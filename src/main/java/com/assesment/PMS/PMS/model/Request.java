package com.assesment.PMS.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class Request {
	
	@Id
	@Column(name = "request_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "cus_email")
	private String cus_email;
	
	@Column(name = "cus_contact")
	private Integer cus_contact ;
	
	@Column(name = "request_description")
	private String request;
	
	@Column(name = "request_status")
	private Integer req_status;
	
	
	@Column(name = "pharmacist_id")
	private Integer phatmacist_id;
	
	@Column(name = "request_date")
	private String request_date;
	
	@Column(name = "response_date")
	private String response_date;
	
	@Column(name = "response")
	private  String response;
	
	
	



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public Integer getCus_contact() {
		return cus_contact;
	}

	public void setCus_contact(Integer cus_contact) {
		this.cus_contact = cus_contact;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public Integer getReq_status() {
		return req_status;
	}

	public void setReq_status(Integer req_status) {
		this.req_status = req_status;
	}

	public Integer getPhatmacist_id() {
		return phatmacist_id;
	}

	public void setPhatmacist_id(Integer phatmacist_id) {
		this.phatmacist_id = phatmacist_id;
	}

	public String getRequest_date() {
		return request_date;
	}

	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}

	public String getResponse_date() {
		return response_date;
	}

	public void setResponse_date(String response_date) {
		this.response_date = response_date;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}


	

	
	
}
