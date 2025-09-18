
public class Person {
	
	String name;
	int age;
	String mobile;
	
	// 함수상자 만들기 (떨어지는 값 명시하지 않는다.)
	Person(String name, int age, String mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	boolean walk (int speed) {
		System.out.println(speed + "km 속도로 걸어갑니다.");
		return true;
	}

}
