package com.springcore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean{
	 private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception { //work as init
		System.out.println("taking pepsi : inti");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Going to put bottel back to shop : Destroy");
		
	}
}
