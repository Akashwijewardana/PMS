package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.repository.PharmacistRepository;
@Service
public class PharmacistServiceImpl implements PharmacistService{

	@Autowired
	private PharmacistRepository pharmacistRepository;

	@Override
	public void savePharmacist(Pharmcist pharmcist) {
		pharmacistRepository.save(pharmcist);
		
	}


	@Override
	public List<Pharmcist> getAllPharmacist() {
		List<Pharmcist> pmlist = new ArrayList<Pharmcist>();
		pharmacistRepository.findAll().forEach(pmlist::add);
		return pmlist;
	}


	


	@Override
	public void deletePharmacist(Integer id) {
		pharmacistRepository.deleteById(id);
		
	}


	@Override
	@Transactional
	public Optional<Pharmcist> updatePharmacist(Integer Id, Pharmcist pharmcist) {
		// TODO Auto-generated method stub
		return pharmacistRepository.findById(Id).map(e -> {
			e.setName(pharmcist.getName());
			e.setUsername(pharmcist.getUsername());
			e.setEmail(pharmcist.getEmail());
			e.setContact(pharmcist.getContact());
			return e;
		});
	}


	@Override
	public Pharmcist getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Pharmcist> pamcist = Optional.ofNullable(pharmacistRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Pharmcist pharmcist = pamcist.get();
		return pharmcist;
	}


	


	
	
}
