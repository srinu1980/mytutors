package com.cts.autowire;

import org.springframework.beans.factory.annotation.Value;

public class Address
{

	@Value("Rajeev Street")
	private String street;
	
	
	@Value("Hyderabad")
	private String city;

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
