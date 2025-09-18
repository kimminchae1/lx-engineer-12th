package com.mc.animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
	
	public Dog dog;
	public ArrayList<Animal> animals = new ArrayList<>();
	public HashMap<String, Animal> animals2 = new HashMap<>();
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
