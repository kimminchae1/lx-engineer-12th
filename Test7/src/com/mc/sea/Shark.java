package com.mc.sea;

public class Shark extends Fish {

	public Shark(String name) {
		
		// super = 부모(Fish)
		// 부모 클래스에 기본 생성자가 없으므로, 자식 클래스에서 super(값)처럼 매개변수가 있는 생성자를 명시적 호출
		super(name);
	}
	
}
