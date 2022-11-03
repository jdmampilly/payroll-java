package services;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

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

//	@EJB
//	SalaryRepository salaryRepo;
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
//				payrollRepo.PostToLoanFiles();
////				payrollRepo.PostToLeaveFiles();
//				payrollRepo.PostToSalaryHistory();
//				payrollRepo.PostToAllowanceHistory();
//				payrollRepo.PostToDeductionHistory();
				payrollRepo.DeleteCurrentSalaryData();
				utx.commit();
			} catch (RollbackException re) {
				System.out.println("Rollback....");
				utx.rollback();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (javax.transaction.RollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicMixedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicRollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// update gosi ??

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
