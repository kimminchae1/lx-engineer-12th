// 별도의 클래스가 아닌 하나의 클래스 안에서 붕어빵 틀, 진짜 붕어빵 만들기
package com.mc.person;

public class Person {
	
	// 사람틀 만들기
	// 변수상자 만들기
	String name;
	int age;
	String mobile;

	public static void main(String[] args) {

		// 사람틀에서 사람 만들기
		Person person1 = new Person();
		Person person2 = new Person();
		
		// 사람틀 안에 있는 변수상자에 값 넣기
		person1.name = "홍길동1";
		person1.age = 21;
		person1.mobile = "010-1111-1111";
		
		person2.name = "홍길동2";
		person2.age = 22;
		person2.mobile = "010-2222-2222";
		
		// 사람 정보 출력하기
		System.out.println("person1 사람 정보 : " + person1.name + ", " + person1.age + ", " + person1.mobile);
		System.out.println("person2 사람 정보 : " + person2.name + ", " + person2.age + ", " + person2.mobile);
		
	}

}
