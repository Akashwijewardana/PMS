package com.assesment.PMS.PMS.web;

import java.lang.ProcessBuilder.Redirect;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.service.PharmacistService;

@Controller
public class PharmacistwebControl {

	@Autowired
	private PharmacistService pharmacistService;
	
	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@GetMapping("/showaddpharmacist")
    public String ShowAddPharmacistForm(Pharmcist pharmcist) {
        return "addpharmacist";
    }
    @PostMapping("/addpharmacist")
    public String addNewPharmacist(@Valid Pharmcist pharmcist, BindingResult result, Model model){
    	
        if(result.hasErrors()) {
        	
            return "addpharmacist";
        }
        
        pharmacistService.savePharmacist(pharmcist);
        return "redirect:/viewPharmacist";
    }
	
	
	@GetMapping("/viewPharmacist")
	public String getAllPharmacist(Model model) {
		model.addAttribute("pharmacist",pharmacistService.getAllPharmacist());
		return "viewPharmacist";
	}
	
	@GetMapping("/updatepharmacist/{id}")
	public String editPharmacist(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("pharmacist",pharmacistService.getById(id));
		return "updatepharmacist";
	}
	
	@PostMapping("/editepharmacist/{id}")
	public String editePharmacist (@PathVariable("id")Integer id,@Valid Pharmcist pharmcist,BindingResult result,Model model){
		if(result.hasErrors()) {
            pharmcist.setId(id);
            model.addAttribute("pharmacist",pharmcist);
            return "updatepharmacist";
        }
	
		Optional<Pharmcist> phamcist1= pharmacistService.updatePharmacist(id, pharmcist);
		return "redirect:/viewPharmacist";
	}

	@GetMapping("/deletepharmacist/{id}")
    public String deletePharmacist(@PathVariable("id") Integer id, Model model) {
        pharmacistService.deletePharmacist(id);
        return "redirect:/viewPharmacist";
    }
	
	
}
