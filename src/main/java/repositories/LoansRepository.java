package repositories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.LoanSummaryView;

@Stateless
public class LoansRepository {
	@PersistenceContext(unitName = "payrollPU")

	private EntityManager em;

	public LoanSummaryView getEmpLoanSummary(int id) {
//		return this.em.createQuery("SELECT  a FROM FrdProjectNames a order by a.projectName", LoanSummaryView.class)
//						.getResultList();
		return this.em.find(LoanSummaryView.class, id);
	}
}

