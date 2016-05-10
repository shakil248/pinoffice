package com.khan.pincode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="S")
public class S {
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name="pin_code")
	private String pinCode;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
