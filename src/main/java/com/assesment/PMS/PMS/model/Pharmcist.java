package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "pharmacist")
public class Pharmcist {

	@Id
	@Column(name= "pahrmacist_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name= "pahrmacist_username")
	private String username;
	
	@Column(name= "pahrmacist_passwrod")
	private String password;
	
	@Column(name= "pahrmacist_email")
	private String email;
	
	@Column(name= "pahrmacist_contact")
	private int contact;
	
	@Column(name= "pahrmacist_name")
	@NotBlank(message = "Name Riquierd")
	private String name;
	
	
	// getters and Setters 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
