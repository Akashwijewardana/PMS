package com.assesment.PMS.PMS.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Genaric;
import com.assesment.PMS.PMS.service.BrandService;
import com.assesment.PMS.PMS.service.GenaricService;

@Controller
public class BrandWebController {

	@Autowired
	private BrandService brandService;
	
	@Autowired
	private GenaricService genaricService;
	
	
	@GetMapping("/viewBrands")
	public String getAllPharmacist(Model model) {
		model.addAttribute("brand",brandService.getallbygenerics());
		return "viewBrands";
	}
	
	@GetMapping("/showAddBrand")
    public String ShowAddGeneric(Brand brand,Model model) {
		model.addAttribute("genaric",genaricService.getAllGenarics());
        return "AddBrand";
    }
    @PostMapping("/addBrand")
    public String addBrand(@Valid Brand brand, BindingResult result, Model model){
    	
        if(result.hasErrors()) {
        	
            return "AddBrand";
        }
        
      brandService.saveBrand(brand);
        return "redirect:/viewBrands";
    }
    
    
	
	
	@GetMapping("/deleteBrand/{id}")
    public String deleteGenaric(@PathVariable("id") Integer id, Model model) {
        brandService.delete(id);
        return "redirect:/viewBrands";
    }
	
	
	@GetMapping("/updateBrand/{id}")
	public String editeBrand(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("brand",brandService.getById(id));
		return "updateBrand";
	}
	
	
	@PostMapping("/editeBrand/{id}")
	public String editeBrand (@PathVariable("id")Integer id,@Valid Brand brand,BindingResult result,Model model){
		if(result.hasErrors()) {
            brand.setId(id);
            model.addAttribute("brand",brand);
            return "updateBrand";
        }
	
		Optional<Brand> brand1= brandService.updateBrand(id, brand);
		return "redirect:/viewBrands";
	}	
	
}
