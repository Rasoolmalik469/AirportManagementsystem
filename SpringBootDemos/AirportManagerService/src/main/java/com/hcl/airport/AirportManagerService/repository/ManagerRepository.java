package com.hcl.airport.AirportManagerService.repository;
/** Rasool Malik Vempalli **/
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.airport.AirportManagerService.entity.ManagerDetails;

public interface ManagerRepository extends JpaRepository<ManagerDetails,Long>{

	public Optional<ManagerDetails> findByContactNumber(String contactNumber);
}
