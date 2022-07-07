package com.bms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.entity.CoverageDetails;
import com.bms.entity.EmployeeInformation;
import com.bms.entity.ForgotPassword;
import com.bms.entity.LoginDetails;
import com.bms.entity.PlanDetails;
import com.bms.entity.PremiumInformation;
import com.bms.entity.Request_Information;
import com.bms.entity.TransactionInformation;
import com.bms.services.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeserviceimpl;

	@PostMapping("/addemployee")
	public EmployeeInformation addEmployeeController(@RequestBody EmployeeInformation employeeinformation) {
		return employeeserviceimpl.addEmployeeService(employeeinformation);
	}

	@PostMapping("/login")
	public LoginDetails loginController(@RequestBody LoginDetails logindetails) {
		employeeserviceimpl.loginService(logindetails);
		return logindetails;
	}

	@GetMapping("/fetchdetails")
	public List<EmployeeInformation> fetchDetailsController() {
		return employeeserviceimpl.fetchDetailsService();
	}

	@PostMapping("/insertplans")
	public PlanDetails savePlansController(@RequestBody PlanDetails plandetails) {
		return employeeserviceimpl.savePlanService(plandetails);
	}

	@PostMapping("/insertcoveragelevel")
	public CoverageDetails saveCoverageController(@RequestBody CoverageDetails coveragedetails) {
		return employeeserviceimpl.saveCoverageService(coveragedetails);
	}

	@PostMapping("/insertpremiuminformation")
	public PremiumInformation savePremiumController(@RequestBody PremiumInformation premiuminformation) {
		return employeeserviceimpl.savePremiumService(premiuminformation);
	}

	@PostMapping("/inserttransaction")
	public String saveTransactionController(@RequestBody TransactionInformation transactiondetails) {
		return employeeserviceimpl.saveTransactionService(transactiondetails);
	}

	@PostMapping("/insertinactivetransaction")
	public String saveInactiveTransactionController(@RequestBody TransactionInformation transactiondetails) {
		return employeeserviceimpl.saveInactiveTransactionService(transactiondetails);
	}

	@GetMapping("/fetchemployee")
	public TransactionInformation getTransactionController(@RequestParam long id) {
		return employeeserviceimpl.getTransactionService(id);
	}

	@GetMapping("/fetchplans")
	public List<PlanDetails> getPansController() {
		return employeeserviceimpl.getPlanService();
	}

	@GetMapping("/fetchlevels")
	public List<CoverageDetails> getCoverageController() {
		return employeeserviceimpl.getCoverageService();
	}

	@GetMapping("/fetchpremium")
	public List<PremiumInformation> getPremiumController() {
		return employeeserviceimpl.getPremiumService();
	}

	@PostMapping("/insertcoveragerequest")
	public Request_Information postCoverageRequestController(@RequestBody Request_Information requestinformation) {
		return employeeserviceimpl.postCoverageRequestService(requestinformation);
	}

	@PostMapping("/insertplanrequest")
	public Request_Information postPlanRequestController(@RequestBody Request_Information requestinformation) {
		return employeeserviceimpl.postPlanRequestService(requestinformation);
	}

	@PostMapping("/insertcancelpolicyrequest")
	public Request_Information postCancelPolicyController(@RequestBody Request_Information requestinformation) {
		return employeeserviceimpl.postCancelPolicyService(requestinformation);
	}

	@PostMapping("/approvebutton")
	public List<String> postApproveButtonController(@RequestBody List<Long> requestlist) {
		return employeeserviceimpl.postApproveButtonService(requestlist);
	}

	@PostMapping("/disapprovebutton")
	public List<String> postDisapproveButtonController(@RequestBody List<Long> requestlist) {
		return employeeserviceimpl.postDisapproveButtonService(requestlist);
	}

	@GetMapping("/pendingrequest")
	public List<Request_Information> getPendingRequestController() {
		return employeeserviceimpl.getPendingRequestService();
	}

	@GetMapping("/pendingrequestcount")
	public Long getPendingRequestCountController() {
		return employeeserviceimpl.getPendingRequestCountService();
	}

	@PostMapping("/forgotpassword")
	public ForgotPassword postForgotPasswordController(@RequestBody ForgotPassword forgotpassword) {
		return employeeserviceimpl.postForgotPasswordService(forgotpassword);
	}

//	@GetMapping("/test")
//	public List<Request_Information> postTestController() {
//		return employeeserviceimpl.postTestService();
//	}

}
