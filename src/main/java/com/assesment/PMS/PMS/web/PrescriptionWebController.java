package com.assesment.PMS.PMS.web;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.assesment.PMS.PMS.model.Prescriptions;
import com.assesment.PMS.PMS.service.PrescriptionService;


@Controller
public class PrescriptionWebController {

	
	private String imagepath = "Imagers/Customers";
	@Autowired
	private PrescriptionService prescriptionService;
	
//	@GetMapping("/showaddUser")
//	public String addnewBook(User user) {
//	
//	return"saveUser";
//	}
	
	
	@PostMapping("/addnewprescriptions")
	public String addnewuser(@Valid Prescriptions prescriptions, BindingResult result, Model model, @RequestParam("prescription_image") MultipartFile userImageFile) throws IOException {
	
			String img = prescriptions.getCus_id().toString();
			String fileName = FileHandler.savePhotograph(img, userImageFile, imagepath);
			prescriptions.setPrescription_image(fileName);
			prescriptionService.savePrescriptions(prescriptions);
		
		
	return "redirect:/";
	}
}
