package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.CusReturns;
import com.assesment.PMS.PMS.service.CusReturnService;

@RestController
public class CusReturnController {
	
	@Autowired
	private CusReturnService cusReturnService;
	
	
	@RequestMapping(method = RequestMethod.POST,value ="/savecusreturn")
	public void saveCusReturn(@RequestBody CusReturns cusReturns) {
		cusReturnService.saveCusReturn(cusReturns);
	}
	
	@RequestMapping("/getallcusreturns")
	public List<CusReturns>getAllCusReturns(){
		return cusReturnService.getAllCusReturns();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatecustomerreturns/{id}")
	public void updateCusReturns(@PathVariable Integer id,@RequestBody CusReturns cusReturns) {
		cusReturnService.updateCusReturns(id,cusReturns);
	}
	
	public void deleteCusReturns(@PathVariable Integer id) {
		cusReturnService.delete(id);	
		}

}
