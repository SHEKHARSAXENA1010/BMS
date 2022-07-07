package com.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.entity.CoverageDetails;

public interface CoverageDetailsRepository extends JpaRepository<CoverageDetails, Long> {

}
