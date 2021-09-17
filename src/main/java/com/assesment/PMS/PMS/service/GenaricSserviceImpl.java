package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Genaric;
import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.repository.GenaricRepository;
@Service
public class GenaricSserviceImpl implements GenaricService {
	@Autowired
	private GenaricRepository genaricRepository;
	

	

	@Override
	@Transactional
	public Optional<Genaric> updateGenaric(Integer id ,Genaric genaric) {
		return genaricRepository.findById(id).map(e -> {
			e.setName(genaric.getName());
			return e;
		});
		
	}

	@Override
	public List<Genaric> getAllGenarics() {
		List<Genaric> genercList = new ArrayList<Genaric>();
		genaricRepository.findAll().forEach(genercList::add);
		return genercList;
		
	}

	@Override
	public void saveGenaric(Genaric genaric) {
		// TODO Auto-generated method stub
		genaricRepository.save(genaric);
	}

	@Override
	public void deleteGenaric(Integer id) {
		// TODO Auto-generated method stub
		genaricRepository.deleteById(id);
	}

	@Override
	public Genaric getById(Integer id) {
		Optional<Genaric> genlist = Optional.ofNullable(genaricRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Genaric genaric =genlist.get();
		return genaric;
	}

}
