package com.assesment.PMS.PMS.DTO;

public class BrandGenericDTO {

	private Integer brand_id;
	private String brand_name;
	private Integer generic_id;
	private String generic_name;
	
	
	
	public BrandGenericDTO(Integer brand_id, String brand_name, Integer generic_id, String generic_name) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.generic_id = generic_id;
		this.generic_name = generic_name;
	}
	
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public Integer getGeneric_id() {
		return generic_id;
	}
	public void setGeneric_id(Integer generic_id) {
		this.generic_id = generic_id;
	}
	public String getGeneric_name() {
		return generic_name;
	}
	public void setGeneric_name(String generic_name) {
		this.generic_name = generic_name;
	}
	
	
}
