package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.service.PharmacistService;

@RestController
public class PharmacistController {
	@Autowired
	private PharmacistService pharmacistService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savepharmacist")
	public void savePharmacist(@RequestBody Pharmcist pharmcist) {
		pharmacistService.savePharmacist(pharmcist);
	}
	
	@RequestMapping("/getallpharmacst")
	public List<Pharmcist> getAllPharmacist(){
		return pharmacistService.getAllPharmacist();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatepharmacist/{id}")
	public void upatePharmacist(@PathVariable Integer id,@RequestBody Pharmcist pharmcist) {
		pharmacistService.updatePharmacist(id, pharmcist);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletepharmaist")
	public void deletePharmacist(@PathVariable Integer id) {
		pharmacistService.deletePharmacist(id);
	}
	
	
}
