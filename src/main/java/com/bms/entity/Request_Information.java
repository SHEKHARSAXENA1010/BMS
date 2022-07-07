package com.bms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "requestinformation")
public class Request_Information {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long requestid;
	private String requestdescription;
	private long requestdetails;
	private String requeststatus = "pending";
	private String email;
	private String requestdetailsdescription;

	@ManyToOne
	@JoinColumn(name = "empinfoid", referencedColumnName = "empinfoid")
	private EmployeeInformation employeeinformation;

	public String getRequestdetailsdescription() {
		return requestdetailsdescription;
	}

	public void setRequestdetailsdescription(String requestdetailsdescription) {
		this.requestdetailsdescription = requestdetailsdescription;
	}

	public long getRequestid() {
		return requestid;
	}

	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}

	public String getRequestdescription() {
		return requestdescription;
	}

	public void setRequestdescription(String requestdescription) {
		this.requestdescription = requestdescription;
	}

	public long getRequestdetails() {
		return requestdetails;
	}

	public void setRequestdetails(long requestdetails) {
		this.requestdetails = requestdetails;
	}

	public String getRequeststatus() {
		return requeststatus;
	}

	public void setRequeststatus(String requeststatus) {
		this.requeststatus = requeststatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeInformation getEmployeeinformation() {
		return employeeinformation;
	}

	public void setEmployeeinformation(EmployeeInformation employeeinformation) {
		this.employeeinformation = employeeinformation;
	}

	@Override
	public String toString() {
		return "Request_Information [requestid=" + requestid + ", requestdescription=" + requestdescription
				+ ", requestdetails=" + requestdetails + ", requeststatus=" + requeststatus + ", email=" + email
				+ ", requestdetailsdescription=" + requestdetailsdescription + ", employeeinformation="
				+ employeeinformation + ", toString()=" + super.toString() + "]";
	}

}
