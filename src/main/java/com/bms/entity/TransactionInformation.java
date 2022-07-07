package com.bms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "transactioninformation")
public class TransactionInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emptransid;
	@Column(nullable = false)
	private String status = "current";
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empinfoid", referencedColumnName = "empinfoid")
	private EmployeeInformation employeeinformation;

	@ManyToOne
	@JoinColumn(name = "premiuminfoid", referencedColumnName = "premiuminfoid")
	private PremiumInformation premiuminformation;

	public long getEmptransid() {
		return emptransid;
	}

	public void setEmptransid(long emptransid) {
		this.emptransid = emptransid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public EmployeeInformation getEmployeeinformation() {
		return employeeinformation;
	}

	public void setEmployeeinformation(EmployeeInformation employeeinformation) {
		this.employeeinformation = employeeinformation;
	}

	public PremiumInformation getPremiuminformation() {
		return premiuminformation;
	}

	public void setPremiuminformation(PremiumInformation premiuminformation) {
		this.premiuminformation = premiuminformation;
	}

	@Override
	public String toString() {
		return "TransactionInformation [emptransid=" + emptransid + ", status=" + status + ", createdby=" + createdby
				+ ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate
				+ ", isactive=" + isactive + ", employeeinformation=" + employeeinformation + ", premiuminformation="
				+ premiuminformation + ", toString()=" + super.toString() + "]";
	}

}
