package heeman;

public class ClassTest {
	public static void main(String[] args) {
		
		// class 구성요소 : 변수, 메서드, 생성자를 모아놓은 것
		
		int count; // count : 숫자를 직접 기입할 수 있는 메모리 공간
		count = 500;
		
		Employee emp; // Employee 타입의 변수 선언
		emp = new Employee(); // 객체 생성 및 new Employee() 생성자 호출
		// Employee : 클래스, emp : 변수
		// stack 영역에서 64비트의 메모리 공간을 할당받아 emp라는 이름으로 참조하게 되고,
		// 그 공간엔 객체의 주소값만을 저장할 수 있다.
		// heap 영역에 new Employee 라는 객체를 생성하고, 생성된 객체의 주소값을 emp에 기입
		
		emp.count = 500;
		System.out.println(emp.count);
		
		// Call by Reference
		Change(emp); // static을 사용해서 객체 생성 안해도 됨.
		System.out.println(emp.count);
		// emp를 Change() 메서드에 매개변수로 전달
		// 참조 reference를 전달하는 것이므로, 메서드 안에서 객체값을 바꾸면, 원본 객체 emp도 바뀜.
		
	}
	
	private static void Change(Employee emp2) {
		emp2.count = 1000;
	}
	
}

class Employee {
	
	int count;
	
	Employee() {
		System.out.println("Employee()");
	}
	
}

// stack 영역 : 주소값, 변수, 파라미터
// heap 영역 : 객체