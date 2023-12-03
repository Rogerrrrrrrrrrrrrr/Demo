package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class New implements InitializingBean,DisposableBean {
	private int price;

	public New(int price) {
		super();
		this.price = price;
	}

	public New() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "New [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initi");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroying");
	}
	
}
