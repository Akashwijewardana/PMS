package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.model.Customer;
import com.assesment.PMS.PMS.model.CustomerLogin;

public interface CustomerService {

	void saveCustomer(Customer customer);

	List<Customer> getallCustomers();

	Optional<Customer> updateCustomer(Integer id, Customer customer);

	void deleteCustomer(Integer id);

	
	public Customer getById(Integer id);
	
	public CustomerLogin getCustomerLogin(String mail);
	
	
	public Customer getByMail(String mail);
}
