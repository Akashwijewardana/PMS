package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.repository.DrugRepository;

@Service
public class DrugServiceImpl implements DrugService{
	
	@Autowired
	private DrugRepository drugRepository;

	@Override
	public void saveDrug(Drug drug) {
		// TODO Auto-generated method stub
		drugRepository.save(drug);
	}

	@Override
	public List<Drug> getAllDrugs() {
		List<Drug> drugList = new ArrayList<Drug>();
		drugRepository.findAll().forEach(drugList::add);
		return drugList;
	}

	@Override
	public void updateDrug(Drug drug,Integer id) {
		// TODO Auto-generated method stub
		drug.setId(id);
		drugRepository.save(drug);
	}

	@Override
	public void deleteDrug(Integer id) {
		drugRepository.deleteById(id);
		
	}

}
