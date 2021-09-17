package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Rack;
import com.assesment.PMS.PMS.repository.BrandRepository;
import com.assesment.PMS.PMS.repository.RackRepository;

@Service
public class RackServiceImpl implements RackService{
	@Autowired
	private RackRepository rackRepository;

	@Override
	public void saveRack(Rack rack) {
		rackRepository.save(rack);
	}

	@Override
	public List<Rack> getAllRack() {
		List<Rack> rackList = new ArrayList<Rack>();
		rackRepository.findAll().forEach(rackList::add);
		return rackList;
		
	}

	@Override
	public void updateRack(Integer id, Rack rack) {
		rack.setId(id);
		rackRepository.save(rack);
		
		
	}

	@Override
	public void delete(Integer id) {
		rackRepository.deleteById(id);
		
	}

}
