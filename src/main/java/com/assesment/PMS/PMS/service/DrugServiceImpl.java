package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.DTO.DrugAllDTO;
import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.model.Genaric;
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
	public void deleteDrug(Integer id) {
		drugRepository.deleteById(id);
		
	}

	@Override
	@Transactional
	public Optional<Drug> updateDrug(Integer id, Drug drug) {
		// TODO Auto-generated method stub
		return drugRepository.findById(id).map(e -> {
			e.setName(drug.getName());
			return e;
		});
	}

	@Override
	public Drug getById(Integer id) {
		Optional<Drug> genlist = Optional.ofNullable(drugRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Drug drug =genlist.get();
		return drug;
	}

	

	@Override
	public List<DrugAllDTO> getallbynames() {
		List<DrugAllDTO> drugAllDTOs = new ArrayList<DrugAllDTO>();
		drugRepository.getbyallname().forEach(drugAllDTOs::add);
		return drugAllDTOs;
	
	}



}
