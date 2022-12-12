package services;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.RollbackException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import entities.LoanTransaction;
import repositories.PayrollRepository;
//import repositories.SalaryRepository;

@Stateless
@TransactionManagement(value = TransactionManagementType.BEAN)
public class PayrollService implements Serializable {
	private static final long serialVersionUID = -1213613386993106353L;
	@EJB
	PayrollRepository payrollRepo;
	@Resource
	private UserTransaction utx;

	public void CloseMonth() throws NotSupportedException, SystemException {
		boolean posted = false;

		posted = checkIfPosted();
		if (!posted) {

			try {
				
				utx.begin();
				payrollRepo.MonthEndClose();
				utx.commit();
			} catch (Exception e) {
				System.out.println("Rollback....");
				e.printStackTrace();
				utx.rollback();
			}		}


	}

	private boolean checkIfPosted() {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanTransaction getLoanSummary() {
		double cr = 0;
		double dr = 0;
		LoanTransaction lt = new LoanTransaction();
//		for (int i = 0; i < l.size(); i++) {
//			cr += l.get(i).getCrAmount();
//			dr += l.get(i).getDrAmount();
//		}
//		lt.setCrAmount(cr);
//		lt.setDrAmount(dr);
//
////		Comparator<LoanTransaction> comparator = Comparator.comparing(LoanTransaction::getTrnDate);
////		@SuppressWarnings("unchecked")
////		LoanTransaction lt1 = ((Collection<LoanTransaction>) lt).stream().filter(lts -> lts.getTrnDate() != null)
////				.max(comparator).get();
////		lt.setTrnDate(lt1.getTrnDate());

		return lt;
	}

}
