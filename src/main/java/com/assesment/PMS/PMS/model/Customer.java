package com.assesment.PMS.PMS.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author Akash
 *
 */
@Entity
@Table(name = "customer")
public class Customer  implements java.io.Serializable{

	@Id
	@Column(name = "cus_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "cus_name")
	private String name;
	
	@Column(name = "cus_contact")
	private String phone;
	
	@Column(name = "cus_email")
	private String mail;

	
	@OneToOne(targetEntity = CustomerLogin.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cus_id", referencedColumnName = "customer_login_id")
	private CustomerLogin customerLogin;


	public Integer getCustomer_id() {
		return id;
	}


	public void setCustomer_id(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public CustomerLogin getCustomerLogin() {
		return customerLogin;
	}


	public void setCustomerLogin(CustomerLogin customerLogin) {
		this.customerLogin = customerLogin;
	}


	
	
	
}
