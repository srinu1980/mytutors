package com.cts.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {


	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter injection is invoked..");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {

		this.address = address;
System.out.println("Constructor Inject is invoked..");
	}



	
}
