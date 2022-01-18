package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Prescriptions;
import com.assesment.PMS.PMS.model.Supplier;
import com.assesment.PMS.PMS.repository.PrescriptionRepo;  


 

@Service

public class PrescriptionServiceImpl implements PrescriptionService{
	
	@Autowired
	private PrescriptionRepo prescriptionRepo;
	
	

	@Override
	public void savePrescriptions(Prescriptions prescriptions) {
		// TODO Auto-generated method stub
		prescriptionRepo.save(prescriptions);
		
		
		
	}



	@Override
	public List<Prescriptions> getAllPrescriptions() {
		List<Prescriptions> presList = new ArrayList<Prescriptions>();
		prescriptionRepo.findAll().forEach(presList::add);
		return presList;
	}

}
