package heeman;

public class Variable {
	public static void main(String[] args) {
		
		// 메모리, 할당, 이름
		
		int count;
		count = 100;
		// count : 할당받음 메모리 공간에 대한 이름
		// 메모리를 할당받고, 그 공간을 count 라는 이름으로 참조한다. 읽는다.
		// 할당받은 메모리 공간에 100 이라는 숫자를 기입한다.
		
		String name = new String("Haha");
		// 생성된 객체의 주소를 name 변수로 할당받은 공간에 기입
		
		System.out.println(Integer.toBinaryString(count));
		// 100을 이진수로 표현
		// Integer : 자바의 int 와 관련된 유틸리티 메서드를 제공하는 클래스
		// toBinaryString() : 괄호 안의 정수 값을 2진수 문자열로 변환해주는 메서드
		
		count = Integer.MAX_VALUE;
		System.out.println(count);
		System.out.println(Integer.toBinaryString(count));
		// MAX_VALUE : Integer 클래스 안의 int 타입 변수
		// int 형으로 가질 수 있는 가장 큰 값 저장
		
		count = count + 1; // 오버플로우 발생
		System.out.println(count); // 메모리 공간의 한계를 넘어서서 다시 최소값인 -2,147,483,648 으로 돌아감
		System.out.println(Integer.toBinaryString(count));
		// int 는 4바이트(32비트) 정수형으로, 저장할 수 있는 값의 범위는 -2,147,483,648 ~ 2,147,483,647 이다.
		
		count = count - 1; // 언더플로우 발생
		System.out.println(count);
		System.out.println(Integer.toBinaryString(count));
		
	}

}
