package com.assesment.PMS.PMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.support.DefaultCrudMethods;

import com.assesment.PMS.PMS.model.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier,Integer>{

}
