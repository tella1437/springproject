package com.teks.beans;

public class Student {
	private String id;
	private String name;
	private String email;
	private Address address;
	
	
	 public Student(String id, String name, String email, Address address) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.address = address;
	    }

	 public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	   
	    public Address getAddress() {
			return address;
		}

	   
	    public void display() {
	        System.out.println("Student ID: " + getId());
	        System.out.println("Student Name: " + getName());
	        System.out.println("Student Email: " + getEmail());
	        System.out.println("Student Address: " + getAddress());
	    }

		

		
}
