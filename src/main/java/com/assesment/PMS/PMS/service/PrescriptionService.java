package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Prescriptions;

public interface PrescriptionService {

	void savePrescriptions(Prescriptions prescriptions);

	List<Prescriptions> getAllPrescriptions();
	
}
