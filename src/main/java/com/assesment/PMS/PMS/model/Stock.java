package com.assesment.PMS.PMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock implements java.io.Serializable {

	@Id
	@Column(name = "stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "stock_exp_date")
	private String Exp_date;
	
	@Column(name = "stock_mfd_date")
	private String Mfd_date;
	
	@Column(name = "stock_quantity")
	private Integer qty;
	
	



	@ManyToOne(targetEntity = Drug.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "drug_id", referencedColumnName = "drug_id")
	private Drug drug;
	
	
	@ManyToOne(targetEntity =DrugOder.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "drug_order_id", referencedColumnName = "drug_order_id")
	private DrugOder drugOder;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public Drug getDrug() {
		return drug;
	}


	public void setDrug(Drug drug) {
		this.drug = drug;
	}


	public DrugOder getDrugOder() {
		return drugOder;
	}


	public void setDrugOder(DrugOder drugOder) {
		this.drugOder = drugOder;
	}


	
	
}
