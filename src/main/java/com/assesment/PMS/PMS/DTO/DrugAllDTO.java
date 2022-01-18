package com.assesment.PMS.PMS.DTO;

public class DrugAllDTO {

	private Integer drug_id;
	private String  drug_name;
	private Float drug_price;
	private Integer rack_id;
	private String	rack_name;
	private Integer generic_id;
	private String	generic_name;
	private Integer brand_id;
	private String	brand_name;
	private Integer	supplier_id;
	private String	supplier_name;
	private Integer stock_quantity;
	
	public DrugAllDTO(Integer drug_id, String drug_name, Float drug_price, Integer rack_id, String rack_name,
			Integer generic_id, String generic_name, Integer brand_id, String brand_name, Integer supplier_id,
			String supplier_name,Integer stock_quantity) {
		super();
		this.drug_id = drug_id;
		this.drug_name = drug_name;
		this.drug_price = drug_price;
		this.rack_id = rack_id;
		this.rack_name = rack_name;
		this.generic_id = generic_id;
		this.generic_name = generic_name;
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.stock_quantity=stock_quantity;
	}
	public Integer getDrug_id() {
		return drug_id;
	}
	public void setDrug_id(Integer drug_id) {
		this.drug_id = drug_id;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public Float getDrug_price() {
		return drug_price;
	}
	public void setDrug_price(Float drug_price) {
		this.drug_price = drug_price;
	}
	public Integer getRack_id() {
		return rack_id;
	}
	public void setRack_id(Integer rack_id) {
		this.rack_id = rack_id;
	}
	public String getRack_name() {
		return rack_name;
	}
	public void setRack_name(String rack_name) {
		this.rack_name = rack_name;
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
	public Integer getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public Integer getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(Integer stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	
	
	
	
	
}
