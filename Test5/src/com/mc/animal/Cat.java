package com.mc.animal;

public class Cat extends Animal {
	
	public String mobile;
	
	public void run() {
		System.out.println("이름이 " + this.name + "인 고양이가 뛰어갑니다.");
	}
	
	public void swim() {
		System.out.println("전화번호가 " + this.mobile + "인 고양이가 헤엄칩니다.");
	}

}
