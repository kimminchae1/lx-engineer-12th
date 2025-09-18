
public class Cat {
	
	String name;
	int age;
	
	// 이름과 나이를 전달받는 생성자 함수
	Cat(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("고양이가 만들어짐! -> " + name + "," + age);
	}

}
