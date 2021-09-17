package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Supplier;

public interface SupplierService {

	void saveSupplier(Supplier supplier);

	List<Supplier> getAllSupplier();

	void updateSupplier(Integer id, Supplier supplier);

	void delete(Integer id);

}
