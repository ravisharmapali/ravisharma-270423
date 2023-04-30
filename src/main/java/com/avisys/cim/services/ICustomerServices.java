package com.avisys.cim.services;

import java.util.List;

import com.avisys.cim.Customer;

public interface ICustomerServices {
	List<Customer> getAllCustomers();

	Customer getCustomerByMobile(String mobNum);
	
	List<Customer> searchCustomer();
}
