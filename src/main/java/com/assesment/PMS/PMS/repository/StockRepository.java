package com.assesment.PMS.PMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.DTO.StockDrugDTO;
import com.assesment.PMS.PMS.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer>{

	@Query(value = "SELECT new com.assesment.PMS.PMS.DTO.StockDrugDTO(s.id,s.Exp_date,s.Mfd_date,s.qty,d.id,d.name,d.price,o.id) FROM Stock s "
			+ "JOIN Drug d ON s.drug = d "
			+ "JOIN DrugOder o ON s.drugOder = o ",nativeQuery = false)
	List<StockDrugDTO>getstockdrug();
		
	
}
