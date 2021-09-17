package com.assesment.PMS.PMS.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name = "customer_order")
public class CustomerOrder {

	@Id
	@Column(name = "customer_order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "customer_order_date")
	private Date co_date;
	
	@Column(name = "customer_order_quantity")
	private Integer quantity;
	
	@Column(name = "customer_order_grand_price")
	private float gprice;
	
	@Column(name = "customer_order_balance")
	private float balane;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCo_date() {
		return co_date;
	}

	public void setCo_date(Date co_date) {
		this.co_date = co_date;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public float getGprice() {
		return gprice;
	}

	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public float getBalane() {
		return balane;
	}

	public void setBalane(float balane) {
		this.balane = balane;
	}

	public Integer getPharmacist_id() {
		return pharmacist_id;
	}

	public void setPharmacist_id(Integer pharmacist_id) {
		this.pharmacist_id = pharmacist_id;
	}

	public Integer getDrug_id() {
		return drug_id;
	}

	public void setDrug_id(Integer drug_id) {
		this.drug_id = drug_id;
	}

	@Column(name = "pharnacist_id")
	private Integer pharmacist_id;
	
	@Column(name = "drug_id")
	private Integer drug_id;
	
	
}
