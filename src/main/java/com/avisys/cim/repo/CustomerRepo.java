package com.avisys.cim.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avisys.cim.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	Optional<Customer> findByMobileNumber(String mobileNumber);
}
