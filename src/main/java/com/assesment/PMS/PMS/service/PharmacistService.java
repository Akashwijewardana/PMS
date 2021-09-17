package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.model.Pharmcist;

public interface PharmacistService {

	void savePharmacist(Pharmcist pharmcist);

	public List<Pharmcist> getAllPharmacist();
	
	

	public Pharmcist getById(Integer id);

	public Optional<Pharmcist> updatePharmacist(Integer Id,Pharmcist pharmcist);

	void deletePharmacist(Integer id);

	

	

}
