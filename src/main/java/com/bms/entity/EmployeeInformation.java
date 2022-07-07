package com.bms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employeeinformation")
public class EmployeeInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empinfoid;
	private String empcode;
	private String firstname;
	private String lastname;
	private String password = "Jaipur@123";
	@Column(unique = true, nullable = false)
	private String email;
	private String role = "USER";
	@Column(updatable = false)
	private String createdby;
	@JsonIgnore
	@CreationTimestamp
	@Column(updatable = false)
	private Date createddate;
	private String modifiedby;
	@JsonIgnore
	@UpdateTimestamp
	private Date modifieddate;
	private String isactive = "true";

	@OneToMany(mappedBy = "employeeinformation")
	private List<TransactionInformation> transactioninformation;

	@OneToMany(mappedBy = "employeeinformation")
	private List<Request_Information> requestinformation;

	public long getEmpinfoid() {
		return empinfoid;
	}

	public void setEmpinfoid(long empinfoid) {
		this.empinfoid = empinfoid;
	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [empinfoid=" + empinfoid + ", empcode=" + empcode + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", password=" + password + ", email=" + email + ", role=" + role
				+ ", createdby=" + createdby + ", createddate=" + createddate + ", modifiedby=" + modifiedby
				+ ", modifieddate=" + modifieddate + ", isactive=" + isactive + ", toString()=" + super.toString()
				+ "]";
	}

}
