package com.springcore.lifecycle;

public class Test {
	//setting properties
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Test(double price) {
		super();
		this.price = price;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	//creating to string to print properties

	@Override
	public String toString() {
		return "Test [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("method initialised");
	}
	
	public void destroy() {
		System.out.println("method destroyed");
	}
	
}
