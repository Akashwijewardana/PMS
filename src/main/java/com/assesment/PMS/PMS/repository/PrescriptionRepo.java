package com.assesment.PMS.PMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.model.Prescriptions;
import com.assesment.PMS.PMS.model.Rack;

public interface  PrescriptionRepo extends CrudRepository<Prescriptions, Integer> {

}
