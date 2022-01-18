package com.assesment.PMS.PMS.DTO;

public class StockDrugDTO {

	
	private Integer stock_id;
	private String Exp_date;
	private String Mfd_date;
	private Integer qty;
	private Integer drug_id;
	private String drug_name;
	private  Float price;
	private Integer drug_order_id;
	public Integer getStock_id() {
		return stock_id;
	}
	public void setStock_id(Integer stock_id) {
		this.stock_id = stock_id;
	}
	public String getExp_date() {
		return Exp_date;
	}
	public void setExp_date(String exp_date) {
		Exp_date = exp_date;
	}
	public String getMfd_date() {
		return Mfd_date;
	}
	public void setMfd_date(String mfd_date) {
		Mfd_date = mfd_date;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getDrug_order_id() {
		return drug_order_id;
	}
	public void setDrug_order_id(Integer drug_order_id) {
		this.drug_order_id = drug_order_id;
	}
	public StockDrugDTO(Integer stock_id, String exp_date, String mfd_date, Integer qty, Integer drug_id,
			String drug_name, Float price, Integer drug_order_id) {
		super();
		this.stock_id = stock_id;
		Exp_date = exp_date;
		Mfd_date = mfd_date;
		this.qty = qty;
		this.drug_id = drug_id;
		this.drug_name = drug_name;
		this.price = price;
		this.drug_order_id = drug_order_id;
	}
	
	
	
	
}
