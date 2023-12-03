package com.springcore.constructor;
//injecting via constructor
public class Person {
	private String name;
	private int personId;
	private Certi certi;
	//creating constructor
	public Person(String name, int personId,Certi certi) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
	}
	//creating to string method
	@Override
	public String toString() {
		
		return this.name + " : " + this.personId + "{"+this.certi.name+"}";
	}
	
}
