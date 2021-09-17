package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.Stock;

public interface StockService {

	void saveStock(Stock stock);

	List<Stock> getAllStock();


	void delete(Integer id);

	void updateStock(Integer id, Stock stock);

}
