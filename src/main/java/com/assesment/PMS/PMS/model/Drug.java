package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drugs")
public class Drug {
	@Id
	@Column(name = "drug_id ")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "drug_name")
	private String name;
	
	@Column(name = "drug_full_quantity")
	private Integer fullQty;
	
	@Column(name = "rack_id")
	private Integer rack_id;
	
	@Column(name = "brand_id")
	private Integer brand_id;
	
	@Column(name = "genaric_id ")
	private Integer generic_id;
	
	@Column(name = "supplier_id")
	private Integer supplier_id;
	
	@Column(name = "price")
	private float price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFullQty() {
		return fullQty;
	}

	public void setFullQty(Integer fullQty) {
		this.fullQty = fullQty;
	}

	public Integer getRack_id() {
		return rack_id;
	}

	public void setRack_id(Integer rack_id) {
		this.rack_id = rack_id;
	}

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	public Integer getGeneric_id() {
		return generic_id;
	}

	public void setGeneric_id(Integer generic_id) {
		this.generic_id = generic_id;
	}

	public Integer getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
