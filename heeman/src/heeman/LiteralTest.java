package heeman;

public class LiteralTest {
	
	public static void main(String[] args) {
		
		// 자료형 구분
		// int : 1
		// double : 1.0
		// float : 1.0f
		// char : '1'
		// string : "1"
		
		// int / 연산자 우선순위와 정수 나눗셈의 특성
		int num = 50 / 40 * 5;
		System.out.println(num);
		
		// double
		double myd1 = 1.0;
		double myd2 = 1.0f; // 1.0f 는 float 이지만, float은 double 로 자동 형변환(업캐스팅) 가능
		
		// float
		float myf1 = 1.0f;
		float myf2 = (float)1.0; // 1.0은 double 이므로, 형변환 (float) 을 해야 함.
		
		// 문자열 길이 출력
		System.out.println("Hello".length());
		
	}

}
