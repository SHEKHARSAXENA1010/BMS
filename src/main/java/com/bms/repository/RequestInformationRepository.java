package com.bms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bms.entity.Request_Information;

public interface RequestInformationRepository extends JpaRepository<Request_Information, Long> {

	@Query(value = "select * from requestinformation where email = ?1", nativeQuery = true)
	public Request_Information findByEmail(String email);

	@Query(value = "update requestinformation set requestdescription = ?1 where requestid = ?2", nativeQuery = true)
	public void updateStatus(String requestdescription, long requestid);

	public List<Request_Information> findByRequeststatus(String requeststatus);

	@Query(value = "SELECT COUNT(requeststatus) FROM requestinformation WHERE requeststatus = \"pending\"", nativeQuery = true)
	public long findByRequeststatuscount();

	public List<Request_Information> findByEmailAndRequeststatus(String email, String requeststatus);

	public Optional<Request_Information> findByEmailAndRequestdescriptionAndRequeststatus(String email,
			String requestdescription, String requeststatus);
}
