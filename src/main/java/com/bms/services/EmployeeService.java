package com.bms.services;

import java.util.List;

import com.bms.entity.CoverageDetails;
import com.bms.entity.EmployeeInformation;
import com.bms.entity.ForgotPassword;
import com.bms.entity.LoginDetails;
import com.bms.entity.PlanDetails;
import com.bms.entity.PremiumInformation;
import com.bms.entity.Request_Information;
import com.bms.entity.TransactionInformation;

public interface EmployeeService {

	public EmployeeInformation addEmployeeService(EmployeeInformation employeeinformation);

	public void loginService(LoginDetails logindetails);

	public List<EmployeeInformation> fetchDetailsService();

	public PlanDetails savePlanService(PlanDetails plandetails);

	public CoverageDetails saveCoverageService(CoverageDetails coveragedetails);

	public PremiumInformation savePremiumService(PremiumInformation premiuminformation);

	public String saveTransactionService(TransactionInformation transactiondetails);

	public TransactionInformation getTransactionService(long id);

	public List<PlanDetails> getPlanService();

	public List<CoverageDetails> getCoverageService();

	public Request_Information postCoverageRequestService(Request_Information requestinformation);

	public Request_Information postPlanRequestService(Request_Information requestinformation);

	public Request_Information postCancelPolicyService(Request_Information requestinformation);

	public List<String> postApproveButtonService(List<Long> requestlist);

	public List<Request_Information> getPendingRequestService();

	public Long getPendingRequestCountService();

	public List<PremiumInformation> getPremiumService();

	public ForgotPassword postForgotPasswordService(ForgotPassword forgotpassword);

	public List<String> postDisapproveButtonService(List<Long> requestlist);

	public String saveInactiveTransactionService(TransactionInformation transactiondetails);

}
