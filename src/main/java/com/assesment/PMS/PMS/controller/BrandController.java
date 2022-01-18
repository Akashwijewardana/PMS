package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.DTO.BrandGenericDTO;
import com.assesment.PMS.PMS.model.Brand;


import com.assesment.PMS.PMS.service.BrandService;

@RestController
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savebrand")
	public void saveBrand(@RequestBody Brand brand) {
		brandService.saveBrand(brand);
	}
	
	@RequestMapping("/getallbrands")
	public List<Brand> getAllBrands(){
		return brandService.getAllBra();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/updatebrands/{id}")
	public void updateGenaric(@PathVariable Integer id,@RequestBody Brand brand) {
		brandService.updateBrand(id,brand);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletebrand/{id}")
	public void deleteBrand(@PathVariable Integer id) {
		brandService.delete(id);
	}

	@GetMapping("/getallbygenerics")
	public List<BrandGenericDTO>getallbygenerics(){
		return brandService.getallbygenerics();
	};
}
