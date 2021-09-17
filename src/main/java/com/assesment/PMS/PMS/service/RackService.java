package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Rack;

public interface RackService {

	void saveRack(Rack rack);

	List<Rack> getAllRack();

	void updateRack(Integer id, Rack rack);

	void delete(Integer id);

}
