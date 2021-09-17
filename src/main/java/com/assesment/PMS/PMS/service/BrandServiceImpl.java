package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.repository.BrandRepository;
@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandRepository brandRepository;
	@Override
	public void saveBrand(Brand brand) {
		// TODO Auto-generated method stub
		brandRepository.save(brand);
		
	}
	@Override
	public List<Brand> getAllBrands() {
		List<Brand> brandList = new ArrayList<Brand>();
		brandRepository.findAll().forEach(brandList::add);
		return brandList;
	}
	@Override
	public void updateBrand(Integer id, Brand brand) {
		brand.setId(id);
		brandRepository.save(brand);
		
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}

}
