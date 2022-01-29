package com.akash.first;
import udemyjavabasics.Birds;
import udemyjavabasics.Flyable;

public class Sparrow extends Birds implements Flyable {

	public Sparrow(String name, int age, String sex, int lifesp) {
		super(name, age, sex, lifesp);
	}

	public void fly() {
		System.out.println("sparrow flying high");
		
	}
	

}
