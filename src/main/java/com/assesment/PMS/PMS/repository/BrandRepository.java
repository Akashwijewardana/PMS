package com.assesment.PMS.PMS.repository;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assesment.PMS.PMS.model.Brand;
import com.assesment.PMS.PMS.model.Genaric;

public interface BrandRepository extends CrudRepository<Brand, Integer>{

	@Query(nativeQuery = true , value = "SELECT generic.generic_name, brand.brand_id, brand.brand_name, brand.generic_id FROM brand INNER JOIN generic ON brand.generic_id = generic.generic_id")
	List<Brand> findByCategoryID();


}
