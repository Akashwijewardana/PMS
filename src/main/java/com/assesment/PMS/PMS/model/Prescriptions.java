package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prescriptions")
public class Prescriptions implements java.io.Serializable  {
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name= "prescription_image")
	private String prescription_image;
	
	@Column(name= "description")
	private String description ;
	
	@Column(name = "cus_id")
	private Integer cus_id;
	
//	@OneToOne(targetEntity = Customer.class,fetch = FetchType.LAZY)
//	@JoinColumn(name = "cus_id ", referencedColumnName = "cus_id")
//	private Customer customer;
//
	
	

	
	
	
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPrescription_image() {
		return prescription_image;
	}


	public void setPrescription_image(String prescription_image) {
		this.prescription_image = prescription_image;
	}





	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}







	public Integer getCus_id() {
		return cus_id;
	}


	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}


//	public Customer getCustomer() {
//		return customer;
//	}
//
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	
//	
	
	
	

}
