package com.mc.animal;

public class Dog extends Animal {
	
	public int age;
	
	public void run() {
		System.out.println("이름이 " + this.name + "인 강아지가 뛰어갑니다.");
	}
	
	public void swim() {
		System.out.println("나이가 " + this.age + "인 강아지가 헤엄칩니다.");
	}

}
