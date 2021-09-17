package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.service.DrugService;

@RestController
public class DrugController {

	@Autowired
	private DrugService drugService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savedrug")
	public void saveDrug(@RequestBody Drug drug) {
		drugService.saveDrug(drug);
	}
	
	@RequestMapping("/getalldrugs")
	public List<Drug> getAllDrug(){
		return drugService.getAllDrugs();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatedrug/{id}")
	public void updateDrug(@PathVariable Integer id,@RequestBody Drug drug) {
		drugService.updateDrug(drug,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletedrug")
	public void deleteDrug(@PathVariable Integer id) {
		drugService.deleteDrug(id);
	}
}
