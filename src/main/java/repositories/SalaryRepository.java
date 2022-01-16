package repositories;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.MonthEndAllowance;
import entities.MonthEndDeduction;
import entities.MonthEndTransaction;
import exception.DataNotFoundException;

@Stateless
public class SalaryRepository implements Serializable {

	private static final long serialVersionUID = -6224428128162111170L;
	@PersistenceContext(unitName = "payrollPU")
	private EntityManager em;

	public List<MonthEndTransaction> getAllEmployeeSalaryList(Class<MonthEndTransaction> class1) {
		return this.em.createQuery("Select a.* from MonthEndTransaction a", MonthEndTransaction.class).getResultList();

	}

	public MonthEndTransaction getEmployeeSalary(Integer empCode) {
		try {
			return this.em.createQuery("Select a from MonthEndTransaction a where a.empCode = :empCode",
					MonthEndTransaction.class).setParameter("empCode", empCode).getSingleResult();
			
		} catch (Exception e) {
			System.out.println("No current record: " + e.getMessage());
			return new MonthEndTransaction();
		}
		
	}
	
	public List<MonthEndAllowance> getMEA(int id) {
		return this.em.createQuery("Select a from MonthEndAllowance a where a.trnId = :id",
				MonthEndAllowance.class).setParameter("id", id).getResultList();
	}
	
	public List<MonthEndDeduction> getMED(int id) {
		return this.em.createQuery("Select a from MonthEndDeduction a where a.trnId = :id",
				MonthEndDeduction.class).setParameter("id", id).getResultList();
	}

	public void save(MonthEndTransaction met, List<MonthEndAllowance> mea, List<MonthEndDeduction> med) {
		
		try {

			if (met.getId() == 0) {
				System.out.println("new transaction");
				em.persist(met);
				em.flush();

			} else {
				System.out.println("update transaction");
				em.merge(met);
			}
			for (MonthEndAllowance a : met.getOtherAllowances()) {
				a.setTrnId((met.getId()));
				a.setEmpCode(met.getEmpCode());
			}
			
			for (MonthEndDeduction d : met.getOtherDeductions()) {
				d.setTrnId((met.getId()));
				d.setEmpCode(met.getEmpCode());
			}
			deleteMEA(met.getId());
			for (MonthEndAllowance a : mea) {
				this.em.persist(a);
			}
			deleteMED(met.getId());
			for (MonthEndDeduction d : med) {
				this.em.persist(d);
			}
			em.flush();

		} catch (Exception e) {
			System.out.println("Month End Transaction Error on save:" + e.getMessage());
			throw e;
		}
		
	}
	
	public void deleteMEA(int id) {
		this.em.createQuery("DELETE FROM MonthEndAllowance a WHERE a.trnId = :id")
		.setParameter("id", id)
		.executeUpdate();
	}
	
	public void deleteMED(int id) {
		this.em.createQuery("DELETE FROM MonthEndDeduction a WHERE a.trnId = :id")
		.setParameter("id", id)
		.executeUpdate();
	}

}
