package heeman;

public class Function {
	public static void main(String[] args) {
		
		int result = print(5);
		System.out.println(result);
		
	}
	
	// 메서드 정의 (define, definition)
	private static int print(int count) {
		int result = 0;
		for(int i=0; i<count; i++) {
			System.out.println("Hello");
			result += i;
		} return result;
	}
}

// 함수 : 명령어를 모아둔 것 / 전달데이터, 리턴
// 함수 왜 씀? 1. 중복코드 제거 2. 코드를 이해하기 편하게 하기 위해

// 명령어 : 선언문, 제어문, 할당, 실행

// 메서드를 원하는 대로 잘 정의할 수 있어야 함.
