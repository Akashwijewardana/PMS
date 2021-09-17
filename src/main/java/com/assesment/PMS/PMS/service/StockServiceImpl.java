package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.Stock;
import com.assesment.PMS.PMS.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private StockRepository stockRepository;

	@Override
	public void saveStock(Stock stock) {
		// TODO Auto-generated method stub
		stockRepository.save(stock);
		
	}

	@Override
	public List<Stock> getAllStock() {
		List<Stock> stList = new ArrayList<Stock>();
		stockRepository.findAll().forEach(stList::add);
		return stList;
	}

	@Override
	public void delete(Integer id) {
		stockRepository.deleteById(id);
		
	}

	@Override
	public void updateStock(Integer id, Stock stock) {
		// TODO Auto-generated method stub
		stock.setId(id);
		stockRepository.save(stock);
	}

}
