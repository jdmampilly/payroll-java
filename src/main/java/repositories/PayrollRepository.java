package repositories;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import entities.EmployeeLoanSummaryView;
import entities.LeaveTransaction;
import entities.LoanMaster;
import entities.LoanTransaction;
import exception.DataNotFoundException;
import exception.NoResultException;
import exception.SQLServerException;

@Stateless
public class PayrollRepository implements Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "payrollPU")
	private EntityManager em;

	public <T> List<T> getAll(Class<T> type) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> q = cb.createQuery(type);
		Root<T> r = q.from(type);
		return em.createQuery(q.select(r)).getResultList();
	}

	public <T> List<T> getAllByCriteria(Class<T> entity, Map<String, String> parameters) {
		final StringBuilder parameter = new StringBuilder("");
		parameters.forEach((key, value) -> {
			parameter.append(" AND UPPER(a." + key + ") LIKE UPPER('%" + value.toString() + "%')");
		});
		if (parameter.length() > 0) {
			parameter.delete(0, 4);
			parameter.insert(0, " WHERE ");
		}
		List<T> returnList = null;
		try {
			returnList = this.em
					.createQuery("SELECT a FROM " + entity.getSimpleName() + " a " + parameter.toString(), entity)
					.getResultList();
			return returnList;
		} catch (Exception e) {
			throw new SQLServerException("Get All by Criteria");
		}

	}

	public <T> T getById(Class<T> type, Object id) {
		T t = em.find(type, id);
		if (t == null) {
			throw new DataNotFoundException("Data not found for id: " + id);
		}
		return t;
	}

	public <T> T getByKey(Class<T> entity, String searchKey, String searchValue) {
		try {
			T t = em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getSingleResult();
			return t;
		} catch (javax.persistence.NoResultException e) {
			throw new NoResultException("Data not found for searchValue: " + searchValue);
		}
	}

	public <T> T getByKey(Class<T> entity, String searchKey, int searchValue) {
		System.out.println("search key:" + searchKey);
		System.out.println("search value:" + searchValue);
		System.out.println("entity:" + entity);
		try {
			T t = em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getSingleResult();
			return t;

//		}	catch (NoResultException nre) {
//		        return null;
		} catch (Exception e) {
			throw new NoResultException("Data not found for searchValue: " + e + searchValue);
		}

	}

	public <T> List<T> getListByKey(Class<T> entity, String searchKey, int searchValue) {
		System.out.println("getListByKey.....");
		try {
			List<T> t =  em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getResultList();
			System.out.println("t:" + t);
			return t;

//		}	catch (NoResultException nre) {
//		        return null;
		} catch (Exception e) {
			throw new NoResultException("Data not found for searchValue: " + e + searchValue);
		}
	}

	public <T> T save(T t) {
		try {
			em.persist(t);
			em.flush();
			em.refresh(t);
			return t;
		} catch (Exception e) {
			throw new SQLServerException("On Saving");
		}

	}

	public <T> T update(T t) {
		try {
			em.merge(t);
			return t;
		} catch (Exception e) {
			throw new SQLServerException("On Updating");
		}
	}

	public <T> void delete(T t) {
		try {
			em.remove(em.merge(t));
		} catch (Exception e) {
			throw new SQLServerException("On deleting");
		}

	}

	public <T> List<T> getAllRecords(Class<T> tClass, Map<String, String> filters, int start, int maxR,
			String sortFieldName, boolean isAsc) {

		final StringBuilder filter = new StringBuilder("");
		filters.forEach((key, value) -> {
			System.out.println("key:" + key + ", value:" + value);
			filter.append(" AND UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%" + value.toString() + "%')");
		});
		System.out.println("Filter:" + filter);
		if (filter.length() > 0) {
			filter.delete(0, 4);
			filter.insert(0, " WHERE ");
		}
		String sorting = sortFieldName == "" ? "" : " ORDER BY t." + sortFieldName + (isAsc ? " ASC" : " DESC");
		System.out.println("sort field + asc: " + sortFieldName + isAsc);
		List<T> s = null;
		try {
			s = this.em.createQuery("SELECT t FROM " + tClass.getSimpleName() + " t " + filter.toString() + sorting,
					tClass).setFirstResult(start).setMaxResults(maxR).getResultList();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		System.out.println("Query : " + tClass.getSimpleName() + "SELECT t FROM " + tClass.getSimpleName() + " t "
				+ filter.toString() + sorting);
		return s;
	}

	public <T> long getSize(Class<T> tClass, Map<String, String> filters) {
		final StringBuilder filter = new StringBuilder("");
		filters.forEach((key, value) -> {
			System.out.println("key:" + key + ", value:" + value);
			filter.append(" AND UPPER(a." + key + ") LIKE UPPER('%" + value.toString() + "%')");
		});
		System.out.println("Filter:" + filter);
		if (filter.length() > 0) {
			filter.delete(0, 4);
			filter.insert(0, " WHERE ");
		}
		return this.em
				.createQuery("SELECT count(a) FROM " + tClass.getSimpleName() + " a " + filter.toString(), long.class)
				.getSingleResult();
	}

	public <T> long getSize(Class<T> tClass) {
		return this.em.createQuery("SELECT count(a) FROM " + tClass.getSimpleName() + " a ", long.class)
				.getSingleResult();
	}

	public List<LeaveTransaction> getEmployeeLeaveAllRecords(Integer empCode) {
		List<LeaveTransaction> l = null;
		try {
			l = this.em
					.createQuery("Select a from LeaveTransaction a where a.empCode = :empCode", LeaveTransaction.class)
					.setParameter("empCode", empCode).getResultList();
			return l;
		} catch (Exception e) {
			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

	}

	public LeaveTransaction getEmployeeLeaveRecord(int empCode, int id) {

		LeaveTransaction lt = this.em
				.createQuery("Select a from LeaveTransaction a where a.empCode = :empCode and a.id = :id",
						LeaveTransaction.class)
				.setParameter("empCode", empCode).setParameter("id", id).getSingleResult();
		return (lt == null ? new LeaveTransaction() : lt);

	}

	public List<LoanTransaction> getEmployeeLoanAllRecords(int empCode) {
		List<LoanTransaction> l = null;
		try {
			l = this.em.createQuery("Select a from LoanTransaction a where a.empCode = :empCode", LoanTransaction.class)
					.setParameter("empCode", empCode).getResultList();
		} catch (Exception e) {

			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

		return l;
	}

	public LoanTransaction getEmployeeLoanRecord(int empCode, int id) {
		LoanTransaction lt = this.em
				.createQuery("Select a from LoanTransaction a where a.empCode = :empCode and a.id = :id",
						LoanTransaction.class)
				.setParameter("empCode", empCode).setParameter("id", id).getSingleResult();
		return (lt == null ? new LoanTransaction() : lt);
	}

	public EmployeeLoanSummaryView getEmpLoanSummary(int empCode) {
		try {
			return this.em.createQuery("Select a from EmployeeLoanSummaryView a where a.empCode = :empCode",
					EmployeeLoanSummaryView.class).setParameter("empCode", empCode).getSingleResult();
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2.getLocalizedMessage());
			return new EmployeeLoanSummaryView();
		}

	}

	public void updateLoanMaster(int empCode, LoanTransaction ln) {
		double amount = ln.getCrAmount() - ln.getDrAmount();
		double additionalInstallment = ln.getAdditionalInstallment();
		System.out.println("Additional Installment =" + additionalInstallment);
		LoanMaster lm = new LoanMaster();
		// To do
		// check oracle code to verify how the data is maintained in the loan master
		try {
			lm = this.em.createQuery("Select a from LoanMaster a where a.empCode = :empCode ", LoanMaster.class)
					.setParameter("empCode", empCode).setParameter("empCode", empCode).getSingleResult();

			if (lm != null) {
				System.out.println("lm is not null");
				Query query = this.em.createQuery(
						"Update LoanMaster a set a.loanAmount = a.loanAmount + :amount, a.loanInstallment = a.loanInstallment + :additionalInstallment where a.empCode = :empCode")
						.setParameter("empCode", empCode).setParameter("amount", amount)
						.setParameter("additionalInstallment", additionalInstallment);
				query.executeUpdate();
				System.out.println("Query updated");

			} else {
				System.out.println("lm is null");
				Query query = this.em.createQuery(
						"INSERT INTO LoanMaster (empCode, loanAmount, loanDate,loanInstallment, loanType) VALUES (?,?,?,?,?)")
						.setParameter("empCode", empCode).setParameter("loanAmount", ln.getCrAmount())
						.setParameter("loanDate", ln.getTrnDate())
						.setParameter("loanInstallment", ln.getAdditionalInstallment()).setParameter("loanType", "1");
				query.executeUpdate();
				System.out.println("Query insert");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LoanMaster resultset = " + lm == null);
			System.out.println("error updating loan info:" + e.getMessage());
		}

	}

	public void updateEmpMasterLoanInstallment(int id, double additionalInstallment) {
		Query query = this.em.createQuery(
				"Update Employee a set a.loanInstallment = a.loanInstallment + :additionalInstallment where a.id = :id")
				.setParameter("id", id).setParameter("additionalInstallment", additionalInstallment);
		query.executeUpdate();

	}

}
