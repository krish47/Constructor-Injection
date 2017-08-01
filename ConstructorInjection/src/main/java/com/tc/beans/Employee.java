package com.tc.beans;

public class Employee {

	// bean properties
	private int id;
	private String name;

	public Employee(){
		
	}
	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public void show() {
		System.out.println("id : "+id + " " + "& name : " + name);
	}

}