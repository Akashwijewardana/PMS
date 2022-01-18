package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Customer;
import com.assesment.PMS.PMS.model.CustomerLogin;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.model.DrugOder;
import com.assesment.PMS.PMS.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getallCustomers() {
		// TODO Auto-generated method stub
		List<Customer> cusList = new ArrayList<Customer>();
		customerRepository.findAll().forEach(cusList::add);
		return cusList;
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Optional<Customer> updateCustomer(Integer id, Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).map(e -> {
			e.setName(customer.getName());
			e.setPhone(customer.getPhone());
			e.setMail(customer.getMail());
			return e;
		});
	}



	@Override
	public Customer getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Customer> cuslist = Optional.ofNullable(customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id")));
		Customer customer = cuslist.get();
		return customer;
	}

	@Override
	public CustomerLogin getCustomerLogin(String mail) {
		// TODO Auto-generated method stub
		
		Optional<Customer> cuslist = Optional.ofNullable(customerRepository.findCustomerByMail(mail).orElseThrow(() -> new IllegalArgumentException("Invalid Email")));
		CustomerLogin customerLogin = cuslist.get().getCustomerLogin();
		System.out.println(customerLogin.getUsername());
		return customerLogin;
		
		
	}

	@Override
	public Customer getByMail(String mail) {
		// TODO Auto-generated method stub
		Optional<Customer> cuslist = Optional.ofNullable(customerRepository.findCustomerByMail(mail).orElseThrow(() -> new IllegalArgumentException("Invalid Id")));
		Customer customer = cuslist.get();
		return customer;
	}

	

}
