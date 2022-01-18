package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Prescriptions;
import com.assesment.PMS.PMS.service.PrescriptionService;

@RestController
public class PrescriptionController {
	
	@Autowired
	PrescriptionService prescriptionService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/savePrescription")
	public void savePrescriptions(@RequestBody Prescriptions prescriptions) {
		prescriptionService.savePrescriptions(prescriptions);
	}
	
	@RequestMapping("/getallPrescriptions")
	public List<Prescriptions> getAllPrescriptions(){
		return prescriptionService.getAllPrescriptions();
	}
	
	

}
