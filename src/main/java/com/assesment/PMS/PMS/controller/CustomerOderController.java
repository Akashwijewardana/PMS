package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.CustomerOrder;
import com.assesment.PMS.PMS.model.Genaric;
import com.assesment.PMS.PMS.service.CostomerOrderService;

@RestController
public class CustomerOderController {

	@Autowired
	private CostomerOrderService costomerOrderService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savecustomeroder")
	public void saveCustomerOder(@RequestBody CustomerOrder customerOrder) {
		costomerOrderService.saveCustomerOder(customerOrder);
	}
	
	
	@RequestMapping("/getallcustomeroder")
	public List<CustomerOrder> getAllCustomerOrders(){
		return costomerOrderService.getAllCustomerOders();
		
	}
	@RequestMapping(method =RequestMethod.PUT,value = "/getallcustomeroder/{id}" )
	public void upateCusOders(@PathVariable Integer id,@RequestBody CustomerOrder customerOrder) {
		costomerOrderService.upateCusOders(id,customerOrder);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletecustomeroder")
	public void deleteCustomerOder(@PathVariable Integer id) {
		costomerOrderService.deleteCustomerOder(id);
	}
}
