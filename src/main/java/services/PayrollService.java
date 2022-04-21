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

}
