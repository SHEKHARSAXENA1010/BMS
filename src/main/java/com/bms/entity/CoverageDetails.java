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
@Table(name = "coveragedetails")
public class CoverageDetails {

	@Id
	private long coverageid;
	@Column(nullable = false, unique = true)
	private String coveragelevel;
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

	@OneToMany(mappedBy = "coveragedetails")
	private List<PremiumInformation> premiuminformation;

	public long getCoverageid() {
		return coverageid;
	}

	public void setCoverageid(long coverageid) {
		this.coverageid = coverageid;
	}

	public String getCoveragelevel() {
		return coveragelevel;
	}

	public void setCoveragelevel(String coveragelevel) {
		this.coveragelevel = coveragelevel;
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
		return "CoverageDetails [coverageid=" + coverageid + ", coveragelevel=" + coveragelevel + ", createdby="
				+ createdby + ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate="
				+ modifieddate + ", isactive=" + isactive + ", toString()=" + super.toString() + "]";
	}

}
