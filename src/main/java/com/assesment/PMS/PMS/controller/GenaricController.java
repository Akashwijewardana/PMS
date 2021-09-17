package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Genaric;

import com.assesment.PMS.PMS.service.GenaricService;

@RestController
public class GenaricController {
	
	@Autowired
	private GenaricService genaricService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savegenaric")
	public void saveGenaric(@RequestBody Genaric genaric) {
		genaricService.saveGenaric(genaric);
	}
	
	@RequestMapping("/getallgenaric")
	public List<Genaric> getAllGenarics(){
		return genaricService.getAllGenarics();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updategenaric/{id}")
	public void upatePharmacist(@PathVariable Integer id,@RequestBody Genaric genaric) {
		genaricService.updateGenaric(id,genaric);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletegenaric/{id}")
	public void deleteGenaric(@PathVariable Integer id) {
		genaricService.deleteGenaric(id);
	}
}
