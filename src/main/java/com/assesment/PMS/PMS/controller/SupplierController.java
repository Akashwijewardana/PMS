package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Supplier;
import com.assesment.PMS.PMS.service.SupplierService;

@RestController
public class SupplierController {

@Autowired
private SupplierService supplierService;

@RequestMapping(method = RequestMethod.POST,value ="/savesupplier")
public void saveSupplier(@RequestBody Supplier supplier) {
	supplierService.saveSupplier(supplier);
}

@RequestMapping("/getallsulliers")
public List<Supplier> getAllSupplier(){
	return supplierService.getAllSupplier();
}

@RequestMapping(method = RequestMethod.PUT,value = "/updatesupplier/{id}")
public void updateSupplier(@PathVariable Integer id,@RequestBody Supplier supplier) {
	supplierService.updateSupplier(id,supplier);
}
@RequestMapping(method = RequestMethod.DELETE, value = "/deletesupplier")
public void deleteSupplier (@PathVariable Integer id) {
	
	supplierService.delete(id);
}

}
