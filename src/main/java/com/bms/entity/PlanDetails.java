package com.bms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "plandetails")
public class PlanDetails {

	@Id
	private long planid;
	@Column(unique = true, nullable = false)
	private String planname;
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

	@OneToMany(mappedBy = "plandetails")
	private List<PremiumInformation> premiuminformation;

	public long getPlanid() {
		return planid;
	}

	public void setPlanid(long planid) {
		this.planid = planid;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
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
		return "PlanDetails [planid=" + planid + ", planname=" + planname + ", createdby=" + createdby
				+ ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate
				+ ", isactive=" + isactive + ", toString()=" + super.toString() + "]";
	}

}
