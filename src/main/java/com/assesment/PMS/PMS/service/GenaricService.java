package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.model.Genaric;

public interface GenaricService {

	void deleteGenaric(Integer id);

	public Optional<Genaric> updateGenaric(Integer integer, Genaric genaric);

	public Genaric getById(Integer id);
	
	List<Genaric> getAllGenarics();

	void saveGenaric(Genaric genaric);
	

}
