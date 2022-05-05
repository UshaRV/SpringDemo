package com.Spring.Demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive()
	{
		System.out.println("Distance travelled by the bike is 20km/hr");
	}
}
