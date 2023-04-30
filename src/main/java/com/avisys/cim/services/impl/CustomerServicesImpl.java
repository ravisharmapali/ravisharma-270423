package com.avisys.cim.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avisys.cim.Customer;
import com.avisys.cim.repo.CustomerRepo;
import com.avisys.cim.services.ICustomerServices;

@Service
public class CustomerServicesImpl implements ICustomerServices {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> findAll = customerRepo.findAll();
		
		return findAll;
	}
	
	@Override
	public Customer getCustomerByMobile(String mobNum) {
	
		Optional<Customer> findByMobileNumber = customerRepo.findByMobileNumber(mobNum);
		Customer customer = findByMobileNumber.get();
		return customer;
	}
	
	@Override
	public List<Customer> searchCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
}
