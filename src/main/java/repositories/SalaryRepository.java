package repositories;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
