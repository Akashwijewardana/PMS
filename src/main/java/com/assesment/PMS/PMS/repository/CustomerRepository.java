package com.assesment.PMS.PMS.repository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.model.Customer;



public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Optional<Customer> findCustomerByMail(String mail);
}
