package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Genaric;
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
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}
	@Override
	@Transactional
	public Optional<Brand> updateBrand(Integer id, Brand brand) {
		return brandRepository.findById(id).map(e ->{
			e.setName(brand.getName());
			e.setGeneric_id(brand.getGeneric_id());
			return e;
		});
	}
	@Override
	public Brand getById(Integer id) {
		Optional<Brand> brandlist = Optional.ofNullable(brandRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Brand brand =brandlist.get();
		return brand;
	}
	@Override
	public List<Brand> getAllByCatName() {
	
		List<Brand> braList = new ArrayList<>();
		brandRepository.findByCategoryID().forEach(braList::add);
		return braList;
	}

}
