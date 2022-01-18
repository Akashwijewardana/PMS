package com.assesment.PMS.PMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.DTO.StockDrugDTO;
import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.model.Genaric;
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
	public List<StockDrugDTO> getstockdrug() {
		List<StockDrugDTO> stockDrugDTOs = new ArrayList<StockDrugDTO>();
		stockRepository.getstockdrug().forEach(stockDrugDTOs::add);
		return stockDrugDTOs;
	}

	@Override
	public Optional<Stock> updateStock(Integer id ,Stock stock) {
		// TODO Auto-generated method stub
				return stockRepository.findById(id).map(e -> {
					e.setQty(id);
					return e;
				});
	}


	
	@Override
	public Stock getById(Integer id) {
		Optional<Stock> genlist = Optional.ofNullable(stockRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Stock stock=genlist.get();
		return stock;
	}

	@Transactional
	@Override
	public Optional<Stock> decreaseStockQty(Integer id, int quantity) {
		// TODO Auto-generated method stub
		return stockRepository.findById(id).map(e ->{
			e.setQty(quantity);
			return e;
		} );
	}
	
	

}
