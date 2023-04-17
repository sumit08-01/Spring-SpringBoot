package com.Spring.newPakageName;

public class Emp {
	private Address address;

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
