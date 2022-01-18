package com.assesment.PMS.PMS.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.assesment.PMS.PMS.model.Stock;
import com.assesment.PMS.PMS.service.StockService;

@Controller
public class StockWebController {

	@Autowired
	private StockService stockService;
	
	
	@GetMapping("/viewStock")
	public String getstockdrug(Model model) {
		model.addAttribute("stock",stockService.getstockdrug());
		return "viewStock";
	}
	
//
//	@GetMapping("gethowWithStockId/{id}")
//	public String getStockid(Model model ,Integer id) {
//		model.addAttribute("stock",stockService.getstockdrugID(id));
//		return "viewStock";
//	}
	
	@GetMapping("/viewSales")
	public String showSales(Model model) {
		model.addAttribute("stock",stockService.getstockdrug());
		return "sales";
	}
	
	@GetMapping("/updatestockforsale/{id}")
	public void editeStock(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("stock1",stockService.getById(id));
		
	}
	
	@PostMapping("/editestock/{id}")
	public String editeStock (@PathVariable("id")Integer id,@Valid Stock stock,BindingResult result,Model model){
		if(result.hasErrors()) {
            stock.setId(id);
            model.addAttribute("stock1",stock);
            
        }
	
		Optional<Stock> stock1= stockService.updateStock(id, stock);
		return "redirect:/viewStock";
	}	
	
	
	@PostMapping("/updateStockQtyforSales/id/quantity")
	public String updateStockQty(@PathVariable ("id") Integer id, @Valid Stock stock, BindingResult result, Model model){
	    if(result.hasErrors()){
	        stock.setId(id);
	        model.addAttribute("stock",stock);
	        return  "sales";
	    }
	    Optional<Stock> stock1 = stockService.decreaseStockQty(id, stock.getQty());
	    return "redirect:/viewSales";
	}

	
	
	
//	@PostMapping("/updateStockforInvoice/{id}")
//	public String updateStock(@PathVariable("id"))
	
}
