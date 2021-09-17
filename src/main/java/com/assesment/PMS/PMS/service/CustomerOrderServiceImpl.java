package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.CustomerOrder;
import com.assesment.PMS.PMS.repository.CustomerOderRepository;

@Service
public class CustomerOrderServiceImpl implements CostomerOrderService {

	@Autowired
	private CustomerOderRepository customerOderRepository;
	@Override
	public void saveCustomerOder(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		customerOderRepository.save(customerOrder);
	}

	@Override
	public List<CustomerOrder> getAllCustomerOders() {
	List<CustomerOrder> coList = new ArrayList<CustomerOrder>();
	customerOderRepository.findAll().forEach(coList::add);
	return coList;
	}

	@Override
	public void upateCusOders(Integer id, CustomerOrder customerOrder) {
		customerOrder.setId(id);
		customerOderRepository.save(customerOrder);
		
	}

	@Override
	public void deleteCustomerOder(Integer id) {
		// TODO Auto-generated method stub
		customerOderRepository.deleteById(id);
	}

	
}
