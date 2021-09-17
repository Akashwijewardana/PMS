package com.assesment.PMS.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.PMS.PMS.model.Rack;
import com.assesment.PMS.PMS.service.RackService;

@RestController
public class RackController {

	@Autowired
	private RackService rackService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/saverack")
	public void saveRack(@RequestBody Rack rack) {
		rackService.saveRack(rack);
		
	}
	
	@RequestMapping("/getallrack")
	public List<Rack> getAllRack(){
		return rackService.getAllRack();
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updaterack/{id}")
	public void updateRack(@PathVariable Integer id,@RequestBody Rack rack) {
		rackService.updateRack(id,rack);
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleterack")
	public void deleteRack(@PathVariable Integer id) {
		rackService.delete(id);
	}
}
