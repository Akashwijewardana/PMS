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

import com.assesment.PMS.PMS.model.Genaric;
import com.assesment.PMS.PMS.model.Pharmcist;
import com.assesment.PMS.PMS.service.GenaricService;
import com.assesment.PMS.PMS.service.GenaricSserviceImpl;

@Controller
public class GenaricWebController {
	
	@Autowired
	private GenaricService genaricService;
	
	@GetMapping("/viewGenaric")
	public String getAllPharmacist(Model model) {
		model.addAttribute("genaric",genaricService.getAllGenarics());
		return "viewGenaric";
	}
	
	
	@GetMapping("/showAddGenaric")
    public String ShowAddGeneric(Genaric genaric) {
        return "AddGenaric";
    }
    @PostMapping("/addGenaric")
    public String addGenaric(@Valid Genaric genaric, BindingResult result, Model model){
    	
        if(result.hasErrors()) {
        	
            return "AddGenaric";
        }
        
      genaricService.saveGenaric(genaric);
        return "redirect:/viewGenaric";
    }
	
	

	@GetMapping("/updateGenaric/{id}")
	public String editeGeneric(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("genaric",genaricService.getById(id));
		return "updateGeneric";
	}
	
	
	@PostMapping("/editeGenaric/{id}")
	public String editeGeneric (@PathVariable("id")Integer id,@Valid Genaric genaric,BindingResult result,Model model){
		if(result.hasErrors()) {
            genaric.setId(id);
            model.addAttribute("genaric",genaric);
            return "updateGeneric";
        }
	
		Optional<Genaric> genaric1= genaricService.updateGenaric(id, genaric);
		return "redirect:/viewGenaric";
	}	
	
	@GetMapping("/deleteGenaric/{id}")
    public String deleteGenaric(@PathVariable("id") Integer id, Model model) {
        genaricService.deleteGenaric(id);
        return "redirect:/viewGenaric";
    }
	
	
}
