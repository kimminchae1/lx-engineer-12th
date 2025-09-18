package com.mc.sea;

public class Fish extends Sea {
	
	// public String name;
	public static int count = 0;
	
	public Fish(String name) {
		this.name = name;
		
		count++; // count = count + 1 이랑 같은 의미
	}

}
