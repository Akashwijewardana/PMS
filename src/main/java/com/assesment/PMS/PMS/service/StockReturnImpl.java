package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.StockReturns;
import com.assesment.PMS.PMS.repository.StockReturnRepository;

@Service
public class StockReturnImpl implements StockReturnService{
	
	@Autowired
	private StockReturnRepository stockReturnRepository;

	@Override
	public void save(StockReturns stockReturns) {
		// TODO Auto-generated method stub
		stockReturnRepository.save(stockReturns);
	}

	@Override
	public List<StockReturns> getall() {
		List<StockReturns> stList = new ArrayList<StockReturns>();
		stockReturnRepository.findAll().forEach(stList::add);
		return stList;
	}

	@Override
	public void update(Integer id, StockReturns stockReturns) {
		stockReturns.setId(id);
		stockReturnRepository.save(stockReturns);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		stockReturnRepository.deleteById(id);
		
	}

}
