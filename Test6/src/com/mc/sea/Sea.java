package com.mc.sea;

public class Sea {
	
	public String name;
	
	// 자식 클래스의 생성자에서는 반드시 부모 클래스의 생성자 중 하나가 호출되어야 한다.
	// 자식 클래스에서 생성자가 호출되면, 자동으로 부모의 기본생성자가 실행되기 때문에 기본생성자를 만들어야 한다.
	public Sea() {
		
	}
	
	public Sea(String name) {
		this.name = name;
	}

}
