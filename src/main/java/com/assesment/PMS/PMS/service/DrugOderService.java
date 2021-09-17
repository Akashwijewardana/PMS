package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.DrugOder;

public interface DrugOderService {

	void saveDrugOder(DrugOder drugoder);

	List<DrugOder> getAllDrugOders();

	void updateDrugOder(Integer id, DrugOder drugOder);

	void delete(Integer id);

}
