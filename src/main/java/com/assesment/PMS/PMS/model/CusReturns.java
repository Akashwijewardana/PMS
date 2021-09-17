package com.assesment.PMS.PMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "returns")
public class CusReturns {

	@Id
	@Column(name = "return_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "return_date" )
	private Date r_date;
	
	@Column(name = "return_quantity")
	private Integer qty;
	
	@Column(name = "return_amount")
	private float amount ;
	
	@Column(name = "customer_order_id ")
	private Integer  co_id;
	
	@Column(name = "pahrmacist_id")
	private Integer pharmacist_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getR_date() {
		return r_date;
	}

	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Integer getCo_id() {
		return co_id;
	}

	public void setCo_id(Integer co_id) {
		this.co_id = co_id;
	}

	public Integer getPharmacist_id() {
		return pharmacist_id;
	}

	public void setPharmacist_id(Integer pharmacist_id) {
		this.pharmacist_id = pharmacist_id;
	}
	
	
}
