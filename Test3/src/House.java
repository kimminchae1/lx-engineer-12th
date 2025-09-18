import java.util.ArrayList;

public class House {
	
	String name;
	ArrayList<Dog> dogs;
	ArrayList<Cat> cats;
	
	House(String name, ArrayList<Dog> dogs, ArrayList<Cat> cats) {
		this.name = name;
		this.dogs = dogs;
		this.cats = cats;
	}

}

// ArrayList
// <> : 제네릭, 자료형을 지정할 때 사용
// <> 안에 들어갈 타입은 보통 직접 정의한 클래스, 이미 존재하는 클래스
// ex. <Dog> :  Dog 객체만 담을 수 있는 ArrayList

