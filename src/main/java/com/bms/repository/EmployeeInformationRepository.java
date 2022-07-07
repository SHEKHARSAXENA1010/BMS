package com.bms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.entity.EmployeeInformation;

public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long> {

	public Optional<EmployeeInformation> findByEmailAndPassword(String email, String password);

	public Optional<EmployeeInformation> findByEmail(String email);

}
