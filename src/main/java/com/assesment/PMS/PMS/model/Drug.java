package com.assesment.PMS.PMS.model;

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
@Table(name = "drugs")
public class Drug implements java.io.Serializable {
	@Id
	@Column(name = "drug_id ")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "drug_name")
	private String name;
	
	@Column(name = "price")
	private Float price;
	
	@ManyToOne(targetEntity = Rack.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "rack_id", referencedColumnName = "rack_id")
	private Rack rack;
	
	@ManyToOne(targetEntity = Brand.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
	private Brand brand;
	
	@ManyToOne(targetEntity = Genaric.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "generic_id", referencedColumnName = "generic_id")
	private Genaric genaric;
	
	@ManyToOne(targetEntity = Supplier.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
	private Supplier supplier;

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


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Rack getRack() {
		return rack;
	}

	public void setRack(Rack rack) {
		this.rack = rack;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Genaric getGenaric() {
		return genaric;
	}

	public void setGenaric(Genaric genaric) {
		this.genaric = genaric;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
