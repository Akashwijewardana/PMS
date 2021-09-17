package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "drug_order")
public class DrugOder {

	@Id
	@Column(name = "drug_order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "drug_order_quantity")
	private int quantity;
	
	@Column(name = "grand_total")
	private float grandAmont;
	
	@Column(name = "suplier_id")
	private Integer supplier_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getGrandAmont() {
		return grandAmont;
	}

	public void setGrandAmont(float grandAmont) {
		this.grandAmont = grandAmont;
	}

	public Integer getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}
	
}
