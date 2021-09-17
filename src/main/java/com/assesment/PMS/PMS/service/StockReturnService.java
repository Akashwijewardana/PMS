package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.StockReturns;

public interface StockReturnService {

	void save(StockReturns stockReturns);

	List<StockReturns> getall();

	void update(Integer id, StockReturns stockReturns);

	void delete(Integer id);

}
