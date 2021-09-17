package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@Column(name= "brand_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	
	@Column(name = "brand_name")
	private String name;
	
	@Column(name="generic_id")
	private Integer generic_id;
	
	public Integer getGeneric_id() {
		return generic_id;
	}


	public void setGeneric_id(Integer generic_id) {
		this.generic_id = generic_id;
	}


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


}
