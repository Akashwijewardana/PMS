package com.assesment.PMS.PMS.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.repository.DrugRepository;
import com.assesment.PMS.PMS.service.BrandService;
import com.assesment.PMS.PMS.service.DrugService;
import com.assesment.PMS.PMS.service.GenaricService;
import com.assesment.PMS.PMS.service.RackService;
import com.assesment.PMS.PMS.service.StockService;
import com.assesment.PMS.PMS.service.SupplierService;

@Controller
public class DrugWebController {

	@Autowired
	private DrugService drugService;
	@Autowired
	private GenaricService genaricService;
	@Autowired
	private RackService rackService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private SupplierService supplierService;
	
	
	@Autowired
	private StockService stockService;
	@GetMapping("/viewDrugs")
	public String getAllDrugs(Model model) {
		model.addAttribute("drug",drugService.getallbynames());
		return "viewDrugs";
	}
	
	@GetMapping("/showAddDrug")
    public String ShowAddDrug(Drug drug,Model model) {
		model.addAttribute("generic",genaricService.getAllGenarics());
		model.addAttribute("brand",brandService.getAllBra());
		model.addAttribute("rack",rackService.getAllRack());
		model.addAttribute("supplier",supplierService.getAllSupplier());
		model.addAttribute("stock",stockService.getAllStock());
        return "AddDrug";
    }
    @PostMapping("/addDrug")
    public String addDrug(@Valid Drug drug, BindingResult result, Model model){
    	
        if(result.hasErrors()) {
        	
            return "AddDrug";
        }
        
      drugService.saveDrug(drug);
        return "redirect:/viewDrugs";
    }
    
    
}
