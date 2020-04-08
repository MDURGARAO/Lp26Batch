package com.virtusa.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int no;
	private String street;
	private String village;
	private String city;
	
	
	
	
	
	public Address() {
		
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
