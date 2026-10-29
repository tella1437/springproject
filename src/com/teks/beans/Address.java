package com.teks.beans;

public class Address {
private String houseno;
private String city;
private int pincode;
public Address(String houseno, String city, int pincode) {
    this.houseno = houseno;
    this.city = city;
    this.pincode = pincode;
}

@Override
public String toString() {
	return houseno +" " + city +" "+ pincode;
}
}
