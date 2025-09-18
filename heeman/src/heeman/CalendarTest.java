package heeman;

import java.util.Calendar;

public class CalendarTest {
	
	static int FRIDAY = 6;
	
	public static void main(String[] args) {
		
		// 오늘이 금요일이면 "불금이네요" 라는 문자열 출력하기
		// 3가지 방법
		
		Calendar cal = Calendar.getInstance();
		// 현재 날짜, 시간을 기준으로 Calendar 객체 생성
		// static <- ClassName.methodName()으로 호출되고 있기 때문
		// Calendar = 클래스, genInstance = Calendar에 있는 메서드
		
		// 1. 숫자 직접 비교
		int today = cal.get(7); // = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(today);
		
		if(today == 6) {
			System.out.println("불금이네요.");
		}
		
		// 2. Calendar.FRIDAY 사용
		int today2 = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(today2);
		System.out.println(today);
		
		if(today2 == Calendar.FRIDAY) {
			System.out.println("불금이네요.");
		}
		
		// 3. 직접 만든 static int FRIDAY=6; 사용
		int today3 = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(today3);
		System.out.println(today);
		
		if(today3 == FRIDAY) { // static int FRIDAY = 6; 선언했기 때문에 오류없이 작동한다.
			System.out.println("불금이네요.");
		}
		
	}

}
