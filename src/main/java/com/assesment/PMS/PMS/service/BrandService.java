package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Brand;

public interface BrandService {

	void saveBrand(Brand brand);

	List<Brand> getAllBrands();

	void updateBrand(Integer id, Brand brand);

	void delete(Integer id);

}
