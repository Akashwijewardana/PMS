package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Supplier;
import com.assesment.PMS.PMS.repository.SupplierRepository;
@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
	

	@Override
	public void saveSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
		
	}

	@Override
	public List<Supplier> getAllSupplier() {
		List<Supplier> supplierList = new ArrayList<Supplier>();
		supplierRepository.findAll().forEach(supplierList::add);
		return supplierList;
	}

	@Override
	public void updateSupplier(Integer id, Supplier supplier) {
		// TODO Auto-generated method stub
		supplier.setId(id);
		supplierRepository.save(supplier);
	}

	@Override
	public void delete(Integer id) {
		supplierRepository.deleteById(id);
		
	}

}
