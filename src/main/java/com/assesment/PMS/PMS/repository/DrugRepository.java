package com.assesment.PMS.PMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.DTO.BrandGenericDTO;
import com.assesment.PMS.PMS.DTO.DrugAllDTO;
import com.assesment.PMS.PMS.model.Drug;

public interface DrugRepository extends JpaRepository<Drug, Integer>{

	@Query(value ="SELECT new com.assesment.PMS.PMS.DTO.DrugAllDTO(d.id,d.name,d.price,r.id,r.name,g.id,g.name,b.id,b.name,s.id,s.name,z.qty) FROM Drug d "
			+ "JOIN Genaric g ON d.genaric = g "
			+ "JOIN Rack r ON d.rack = r "
			+ "JOIN Brand b ON d.brand = b "
			+ "JOIN Stock z ON z.drug = d.id "
			+ "JOIN Supplier s ON d.supplier = s"
			,
			
			nativeQuery = false)
	List<DrugAllDTO> getbyallname();
	
	
}
