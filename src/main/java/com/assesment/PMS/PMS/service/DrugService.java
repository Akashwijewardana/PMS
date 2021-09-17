package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Drug;

public interface DrugService {

	void saveDrug(Drug drug);

	List<Drug> getAllDrugs();

	void updateDrug(Drug drug,Integer id);

	void deleteDrug(Integer id);

}
