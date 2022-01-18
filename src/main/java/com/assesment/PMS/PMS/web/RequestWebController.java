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
import com.assesment.PMS.PMS.model.Request;
import com.assesment.PMS.PMS.service.RequestService;

@Controller
public class RequestWebController {
	
	@Autowired
	private RequestService requestService;
	
	
	@GetMapping("/getRequest")
	public String getAllDrugs(Model model) {
		model.addAttribute("request",requestService.getAll());
		return "viewRequest";
	}
	
	
	
	@GetMapping("/updateRequest/{id}")
	public String editeRequest(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("request",requestService.getByid(id));
		return "updateRequest";
	}
	
	
	@PostMapping("/editeRequest/{id}")
	public String editeBrand (@PathVariable("id")Integer id,@Valid Request request,BindingResult result,Model model){
		if(result.hasErrors()) {
            request.setId(id);
            model.addAttribute("request",request);
            return "updateRequest";
        }
	
		Optional<Request> brand1= requestService.updateReq(id, request);
		return "redirect:/getRequest";
	}
	
	

}
