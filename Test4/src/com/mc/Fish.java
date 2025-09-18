package com.mc;

public class Fish {
	
	String name;
	int age;
	
	// public : 변수상자 앞 X, 함수상자 앞 O (보안 때문에)
	
	// 이름 생성자 만들기
	public Fish(String name) {
		this.name = name;
	}
	
	// get 함수 : 값을 가져오기 위한 함수, 반환 값이 있다, 그래서 자료형을 적는다.
	public String getName() {
		return name; // -> this.name 인데 this 생략 가능하다.
	}
	
	// set 함수 : 값을 넣기 위한 함수, 값을 리턴하지 않는다, 그래서 void를 사용한다.
	public void setName(String name) {
		this.name = name;
	}
	
	// get 함수
	public int getAge() {
		return age;
	}
	
	// set 함수
	public void setAge(int age) { 
		this.age = age;
		
		if(age < 20) {
			System.out.println("미성년자 입니다.");
			return; // void는 떨어지는 값이 없지만 return을 쓴 이유 : 더이상 실행하지 않는다는 의미
		}
		
	}

}
