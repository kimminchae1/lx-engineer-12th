package com.mc.animal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Animal {
	
	public String birth;
	public static int count = 0;
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		
		super(name);
		
		count += 1;
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		birth = format.format(date);
		
	}

}
