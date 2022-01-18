package com.assesment.PMS.PMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.DTO.BrandGenericDTO;
import com.assesment.PMS.PMS.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Integer>{

	@Query(value ="SELECT new com.assesment.PMS.PMS.DTO.BrandGenericDTO(b.id, b.name, g.id, g.name) FROM Brand b JOIN Genaric g ON b.genaric = g",nativeQuery = false)
	List<BrandGenericDTO> getbygen();


}
