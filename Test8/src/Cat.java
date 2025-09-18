import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Animal {
	
	Cat(String name) {
		
		super.name = name;
		
		System.out.println("고양이가 만들어졌어요. -> 이름 : " + name);
		
		Date date = new Date(); // new(Date) : 현재 날짜, 시간을 가진 date 객체 생성
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 날짜를 보기 좋게 형식을 지정하는 도구
		String now = format.format(date); // date 객체를 문자열로 변환
		
		super.birth = now; // 부모 클래스 Animal에 있는 birth라는 변수에 지금 만든 시간 문자열 now를 저장
		
	}

}
