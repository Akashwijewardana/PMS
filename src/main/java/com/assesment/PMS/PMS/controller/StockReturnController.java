package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.StockReturns;
import com.assesment.PMS.PMS.service.StockReturnService;
import com.sun.jdi.Method;

@RestController
public class StockReturnController {

	@Autowired
	private StockReturnService stockReturnService;
	@RequestMapping(method = RequestMethod.POST,value = "/savestockreturns")
	public void saveStockReturns(@RequestBody StockReturns stockReturns) {
		stockReturnService.save(stockReturns);
	}
	
	@RequestMapping("/getallstockreturns")
	public List<StockReturns> getAllStockReturns(){
		return stockReturnService.getall();
	}
	@RequestMapping(method = RequestMethod.PUT,value="/updatestockreturns/{id}")
	public void updateStockReturns(@PathVariable Integer id,@RequestBody StockReturns stockReturns) {
		stockReturnService.update(id,stockReturns);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestockreturns")
	public void deleteStockReturns(@PathVariable Integer id) {
		stockReturnService.delete(id);
	}
}
