package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.DrugOder;
import com.assesment.PMS.PMS.service.DrugOderService;

@RestController
public class DrugOrderController {

	@Autowired 
	private DrugOderService drugOderService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savedrugoder")
	public void saveDrugOrder(@RequestBody DrugOder drugoder) {
		drugOderService.saveDrugOder(drugoder);
	}
	
	@RequestMapping("/getAlldrugoders")
	public List<DrugOder> getAllDrugOders(){
		return drugOderService.getAllDrugOders();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatedrugoder/{id}")
	public void updateDrugOder(@PathVariable Integer id,@RequestBody DrugOder drugOder) {
		drugOderService.updateDrugOder(id,drugOder);
	}
		@RequestMapping(method = RequestMethod.DELETE, value = "/deletdrugoder")
		public void deleteDrugOders(@PathVariable Integer id) {
			drugOderService.delete(id);
		}
	}

