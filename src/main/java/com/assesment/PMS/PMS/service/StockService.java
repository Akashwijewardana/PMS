package com.assesment.PMS.PMS.service;

import java.util.List;
import java.util.Optional;

import com.assesment.PMS.PMS.DTO.StockDrugDTO;
import com.assesment.PMS.PMS.model.Drug;
import com.assesment.PMS.PMS.model.Stock;

public interface StockService {

	void saveStock(Stock stock);

	List<Stock> getAllStock();


	void delete(Integer id);

	public Optional <Stock> updateStock(Integer id,Stock stock);
	
	List<StockDrugDTO>getstockdrug();

	public Stock getById(Integer id);
	
	Optional<Stock> decreaseStockQty(Integer id, int quantity);
	


	

}
