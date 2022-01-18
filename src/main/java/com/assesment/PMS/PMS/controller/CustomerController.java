package com.assesment.PMS.PMS.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Customer;
import com.assesment.PMS.PMS.model.CustomerLogin;
import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.POST, value = "/savecst")
	public void savePharmacist(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}

	@RequestMapping(value = "/getAllCustomers")
	public List<Customer> getAllCustomer() {
		return customerService.getallCustomers();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateCustomers/{id}")
	public void updateCustomers(@PathVariable Integer id, @RequestBody Customer customer) {
		customerService.updateCustomer(id, customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}

	

	 
	 
	@RequestMapping(method = RequestMethod.GET, value = "/getCusbyId/{id}")
	public Customer getCusByis(@PathVariable Integer id) {
		return customerService.getById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/getCusbyMail/{mail}")
	public CustomerLogin getCustomerLogin(@PathVariable String mail) {
		return customerService.getCustomerLogin(mail);
		
		
		
		
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/getCusbyEmail/{mail}")
	public Customer getCusByMail(@PathVariable String mail) {
		return customerService.getByMail(mail);
	}
	
	
	
	
	
}
	
	
	