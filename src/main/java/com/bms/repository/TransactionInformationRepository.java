package com.bms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bms.entity.TransactionInformation;

public interface TransactionInformationRepository extends JpaRepository<TransactionInformation, Long> {

	@Query(value = "select * from transactioninformation where empinfoid = ?1 AND status = ?2", nativeQuery = true)
	public Optional<TransactionInformation> findByEmpinfoidAndStatus(long empinfoid, String stauts);

	@Query(value = "update transactioninformation set premiuminfoid = ?1 where empinfoid = ?2", nativeQuery = true)
	public void updatePremiuminfoid(long premiuminfoid, long empinfoid);

}
