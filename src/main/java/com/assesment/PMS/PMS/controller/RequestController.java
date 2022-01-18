package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Rack;
import com.assesment.PMS.PMS.model.Request;
import com.assesment.PMS.PMS.service.RequestService;

@RestController
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/saveRequest")
	public void saveRequest(@RequestBody Request request) {
		requestService.saveRequest(request);
	}

	
	@RequestMapping("/getallrequest")
	public List<Request> getallrequest(){
		return requestService.getAll();
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/updatereq/{id}")
	public void updateGenaric(@PathVariable Integer id,@RequestBody Request request) {
		requestService.updateReq(id,request);
	}
	
	
}
