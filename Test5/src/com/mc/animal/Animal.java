package com.mc.animal;

public class Animal {
	
	public String name;
	
	public void walk() {
		System.out.println("이름이 " + this.name + "인 동물이 걸어갑니다.");
	}
	
	public void swim() {
		System.out.println("이름이 " + this.name + "인 동물이 헤엄칩니다.");
	}

}
