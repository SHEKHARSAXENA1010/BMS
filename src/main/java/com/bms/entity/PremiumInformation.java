package com.bms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "premiuminformation")
public class PremiumInformation {

	@Id
	private long premiuminfoid;
	@Column(nullable = false)
	private double amount;
	@Column(updatable = false)
	private String createdby;
	@CreationTimestamp
	@Column(updatable = false)
	@JsonIgnore
	private Date createddate;
	private String modifiedby;
	@UpdateTimestamp
	@JsonIgnore
	private Date modifieddate;
	private String isactive = "true";

	@ManyToOne
	@JoinColumn(name = "coverageid", referencedColumnName = "coverageid")
	private CoverageDetails coveragedetails;

	@ManyToOne
	@JoinColumn(name = "planid", referencedColumnName = "planid")
	private PlanDetails plandetails;

	@OneToMany(mappedBy = "premiuminformation")
	private List<TransactionInformation> transactioninformation;

	public long getPremiuminfoid() {
		return premiuminfoid;
	}

	public void setPremiuminfoid(long premiuminfoid) {
		this.premiuminfoid = premiuminfoid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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

	public CoverageDetails getCoveragedetails() {
		return coveragedetails;
	}

	public void setCoveragedetails(CoverageDetails coveragedetails) {
		this.coveragedetails = coveragedetails;
	}

	public PlanDetails getPlandetails() {
		return plandetails;
	}

	public void setPlandetails(PlanDetails plandetails) {
		this.plandetails = plandetails;
	}

	@Override
	public String toString() {
		return "PremiumInformation [premiuminfoid=" + premiuminfoid + ", amount=" + amount + ", createdby=" + createdby
				+ ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate
				+ ", isactive=" + isactive + ", coveragedetails=" + coveragedetails + ", plandetails=" + plandetails
				+ ", toString()=" + super.toString() + "]";
	}

}
