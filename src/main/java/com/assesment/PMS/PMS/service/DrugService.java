package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.DTO.DrugAllDTO;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.model.Genaric;

public interface DrugService {

	void saveDrug(Drug drug);

	List<Drug> getAllDrugs();

	public Optional <Drug> updateDrug(Integer id ,Drug drug);
	

	void deleteDrug(Integer id);

	public Drug getById(Integer id);
	


	List<DrugAllDTO> getallbynames();


}
