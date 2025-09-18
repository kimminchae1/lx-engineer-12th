
public class Test1 {
	
	// main 함수상자 : 프로그램을 실행하면 컴퓨터가 이 함수상자를 실행한다.
	public static void main(String[] args) {
		
		// 출력해보기
		System.out.println("안녕하세요!");
		
		// 변수상자 만들기 _ 두줄 _ 보통 소문자로 시작
		String name1; // name이라는 변수상자 선언
		name1 = "홍길동1"; // 오른쪽 값을 왼쪽으로 할당
		
		int age1;
		age1 = 21;
		
		// 변수상자 만들기 _ 한줄 _ 변수상자를 만들면서 초기화
		String name2 = "홍길동2";
		int age2 = 22;
		boolean isPerson = true;
		float weight = 80.5f;
		double weight2 = 80.5; // 소수점 표현
		
		// 변수상자 안의 값 더하기 _ 숫자 + 숫자
		int output1 = age1 + age2;
		System.out.println(output1);
		
		// 변수상자 안의 값 더하기 _ 문자 + 숫자
		String output2 = name1 + age2;
		System.out.println(output2); // 문자열이 하나라도 있으면 숫자도 문자열로 변환
		
		// if 문
		if(age1 > 21) {
			System.out.println("나이가 21살 보다 많습니다.");
		} else {
			System.out.println("나이가 21살 보다 적습니다.");
		}
		
		// for 문
		int count = 0;
		for(int i=0; i<10; i++) {
			count = count + (i+1);
		}
		System.out.println("1부터 10까지 더한 값 : " + count);
		
		// 더하기 함수상자 실행, 호출
		// add 함수는 값을 반환(return)하기 때문에 변수상자에 값을 담아서 출력
		int output3 = add(age1, age2);
		System.out.println(output3);
		
		// 뺴기 함수상자 실행, 호출
		int output4 = substract(age2, age1);
		System.out.println(output4);
		
		// print1 함수
		// print1 함수는 void, 즉 아무 값도 반환하지 않기 때문에 변수에 담을 수 없음.
		// 단순히 실행만 시키면 동작한다.
		print1();
		
		// walk 함수
		walk(8);
		
	}
	
	// 함수상자 : 반복해서 실행하는 경우가 많은 것들을 모아둔다.
	// 더하기 함수상자
	static int add(int a, int b) { // int = 상자크기, static한 메서드 안에서는 static 한 것만 바로 사용 가능하다.
		return a + b;
	}
	
	// 빼기 함수상자
	static int substract(int a, int b) {
		return a - b;
	}
	
	// print1 함수상자 (콘솔에 출력하는 함수상자)
	static void print1() {
		System.out.println("print1 함수가 실행되었습니다.");
	}
	
	// walk 함수상자 (return을 통해 떨어트리는 값이 없을 때 void 사용)
	static void walk(int speed) {
		System.out.println(speed + "km 속도로 걸어갑니다.");
	}

}