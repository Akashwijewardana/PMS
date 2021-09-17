package com.assesment.PMS.PMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	@Column(name = "stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "stock_exp_date")
	private Date Exp_date;
	
	@Column(name = "stock_mfd_date")
	private Date Mfd_date;
	
	@Column(name = "stock_quantity")
	private Integer qty;
	
	@Column(name = "drug_id")
	private Integer drug_id;
	
	@Column(name = "drug_order_id")
	private Integer drug_oder_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getExp_date() {
		return Exp_date;
	}

	public void setExp_date(Date exp_date) {
		Exp_date = exp_date;
	}

	public Date getMfd_date() {
		return Mfd_date;
	}

	public void setMfd_date(Date mfd_date) {
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

	public Integer getDrug_oder_id() {
		return drug_oder_id;
	}

	public void setDrug_oder_id(Integer drug_oder_id) {
		this.drug_oder_id = drug_oder_id;
	}
	
	
	
}
