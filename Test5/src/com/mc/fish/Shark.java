package com.mc.fish;

// 상속
// Fish 부모 클래스 - Shark 자식 클래스
public class Shark extends Fish {
	
	public String mobile;
	
	// 덮어쓰기 (Fish 붕어빵 틀에서 물려받은 swim 함수를 덮어쓰기)
	public void swim() {
		System.out.println("이름이 " + this.name + "인 상어빵이 헤엄칩니다.");
	}

}
