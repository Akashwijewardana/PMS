package com.assesment.PMS.PMS.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.bytebuddy.description.type.TypeDescription.Generic;

@Entity
@Table(name = "brand")
public class Brand implements java.io.Serializable{

	@Id
	@Column(name= "brand_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	
	@Column(name = "brand_name")
	private String name;
	
	@ManyToOne(targetEntity = Genaric.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "generic_id", referencedColumnName = "generic_id")
	private Genaric genaric;

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

	public Genaric getGenaric() {
		return genaric;
	}

	public void setGenaric(Genaric genaric) {
		this.genaric = genaric;
	}



	
	
	
	
}
