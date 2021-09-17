package com.assesment.PMS.PMS.service;

import java.util.List;

import com.assesment.PMS.PMS.model.CusReturns;

public interface CusReturnService {

	void saveCusReturn(CusReturns cusReturns);

	List<CusReturns> getAllCusReturns();

	void updateCusReturns(Integer id, CusReturns cusReturns);

	void delete(Integer id);

}
