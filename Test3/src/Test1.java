import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		// 강아지 만들기
		Dog dog1 = new Dog("강아지1", 1);
		Dog dog2 = new Dog("강아지2", 2);
		
		// 고양이 만들기
		Cat cat1 = new Cat("고양이1", 1);
		Cat cat2 = new Cat("고양이2", 2);
		
		// 배열 생성 후 강아지 넣기
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		
		// 배열 생성 후 고양이 넣기
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(cat1);
		cats.add(cat2);
		
		// 집 만들기
		House house = new House("동물 관리소", dogs, cats);
		
		// 집 정보, 집 안 동물 정보 출력
		System.out.println("\n집 이름 : " + house.name);
		System.out.println("집 안 강아지 마리 수 : " + dogs.size());
		System.out.println("집 안 고양이 마리 수 : " + cats.size());
		
		System.out.println("\ndogs 배열 안의 두번째 칸에 들어있는 강아지 이름 : " + dogs.get(1).name);

	}

}

// 궁금했던 점
// Dog와 Cat은 클래스이기 때문에 메인에서 객체를 만들 수 있는 건 이해되는데
// ArrayList는 House 클래스 안에 있는 변수인데 왜 메인에서 직접 만들 수 있는지?
// 정답
// ArrayList라는 클래스는 이미 자바에서 제공되기 때문이다.
// House 안에 있는 변수는 그 클래스 안에서의 설명일 뿐

// 꼬리 질문
// 그럼 메인에 만든 새로운 배열은 house클래스 안의 배열과는 연관성이 없는 것인가?
// 정답
// 연관성이 없다.
// ArrayList<Dog> dogs = new ArrayList<>();
// 위에 코드는 완전히 새로운 ArrayList 객체이다.
// 명시적으로 할당을 해야 연결이 된다.