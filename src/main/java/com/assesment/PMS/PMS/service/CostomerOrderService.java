package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.CustomerOrder;

public interface CostomerOrderService {

	void saveCustomerOder(CustomerOrder customerOrder);

	List<CustomerOrder> getAllCustomerOders();

	void upateCusOders(Integer id, CustomerOrder customerOrder);

	void deleteCustomerOder(Integer id);

	

}
