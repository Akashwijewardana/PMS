package com.assesment.PMS.PMS.service;


import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.DTO.BrandGenericDTO;
import com.assesment.PMS.PMS.model.Brand;

import com.assesment.PMS.PMS.model.Genaric;

public interface BrandService {

	void saveBrand(Brand brand);

	List<Brand> getAllBra();

	public Optional <Brand> updateBrand(Integer id, Brand brand);
	
	public Brand getById(Integer id);

	void delete(Integer id);

	List<BrandGenericDTO> getallbygenerics();

	
	
	
	

}
