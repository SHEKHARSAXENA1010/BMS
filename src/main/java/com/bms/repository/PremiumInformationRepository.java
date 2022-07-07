package com.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bms.entity.PremiumInformation;

public interface PremiumInformationRepository extends JpaRepository<PremiumInformation, Long> {

	@Query(value = "select * from premiuminformation where coverageid = ?1 AND planid = ?2", nativeQuery = true)
	public PremiumInformation findByCoveragedetailsANDPlandetails(long coverageid, long planid);

}
