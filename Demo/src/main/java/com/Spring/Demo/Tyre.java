package com.Spring.Demo;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
  
	private String brand;
  
// public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

public String getBrand() {
	return brand;
}

@Override
public String toString() {
	return  "It's Working" ;
}

public void setBrand(String brand) {
	this.brand = brand ;
}

}
