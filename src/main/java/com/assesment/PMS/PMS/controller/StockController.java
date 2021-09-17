package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Stock;
import com.assesment.PMS.PMS.service.StockService;

@RestController
public class StockController {

	@Autowired 
	private StockService service;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savestock")
	public void saveStock(@RequestBody Stock stock) {
		service.saveStock(stock);
	}
	@RequestMapping(value = "/getallstock")
	public List<Stock> getAllStock(){
		return service.getAllStock();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/updatestock/{id}")
	public void updateStock(@PathVariable Integer id,@RequestBody Stock stock) {
		 service.updateStock(id,stock);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestock")
	public void deleteStock(@PathVariable Integer id) {
	service.delete(id);
	}
	}
	

