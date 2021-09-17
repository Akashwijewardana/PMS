package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.DrugOder;
import com.assesment.PMS.PMS.repository.DrugOrderRepository;

@Service
public class DrugOderImpl implements DrugOderService{
	
	@Autowired
	private DrugOrderRepository drugOrderRepository;

	@Override
	public void saveDrugOder(DrugOder drugoder) {
		
		drugOrderRepository.save(drugoder);
	}

	@Override
	public List<DrugOder> getAllDrugOders() {
		List<DrugOder> dodList = new ArrayList<DrugOder>();
		drugOrderRepository.findAll().forEach(dodList::add);
		return dodList;
	}

	@Override
	public void updateDrugOder(Integer id, DrugOder drugOder) {
		drugOder.setId(id);
		drugOrderRepository.save(drugOder);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		drugOrderRepository.deleteById(id);
		
	}

}
