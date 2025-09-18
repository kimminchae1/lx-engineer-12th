package com.mc.sea;

public class Fish {
	
	String name;
	
	public Fish(String name) {
		this.name = name;
		
		// 메인에서 Fish 객체가 생성될 때마다 -> Fish 생성자 실행 -> 그 안에서 Sea.count++ 실행
		Sea.count ++;
	}

}
