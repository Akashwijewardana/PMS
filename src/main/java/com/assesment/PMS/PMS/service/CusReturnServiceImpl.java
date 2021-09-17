package com.assesment.PMS.PMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.CusReturns;
import com.assesment.PMS.PMS.repository.CusReturnRepository;

@Service
public class CusReturnServiceImpl implements CusReturnService{
	
	@Autowired
	private CusReturnRepository cusReturnRepository;

	@Override
	public void saveCusReturn(CusReturns cusReturns) {
		cusReturnRepository.save(cusReturns);
	}

	@Override
	public List<CusReturns> getAllCusReturns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCusReturns(Integer id, CusReturns cusReturns) {
		cusReturns.setId(id);
		cusReturnRepository.save(cusReturns);
	}

	@Override
	public void delete(Integer id) {
		cusReturnRepository.deleteById(id);
		
	}

}
