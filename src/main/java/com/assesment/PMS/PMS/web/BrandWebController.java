package com.assesment.PMS.PMS.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.assesment.PMS.PMS.service.BrandService;

@Controller
public class BrandWebController {

	@Autowired
	private BrandService brandService;
	
	
	
	@GetMapping("/viewBrands")
	public String getAllPharmacist(Model model) {
		model.addAttribute("brand",brandService.getAllByCatName());
		return "viewBrands";
	}
	
}
