import com.mc.animal.Animal;
import com.mc.animal.Cat;
import com.mc.animal.Dog;
import com.mc.animal.Farm;

public class Test1 {
	public static void main(String[] args) {
		
		// 붕어빵틀(클래스)에서 붕어빵 만들기
		Animal animal1 = new Animal("동물1");
		Animal animal2 = new Animal("동물2");
		
		System.out.println("붕어빵 이름 : " + animal1.getName());
		
		// 강아지 만들기, 고양이 만들기
		Dog dog1 = new Dog("강아지1");
		Cat cat1 = new Cat("고양이1");
		
		// 동물농장 만들기
		Farm farm1 = new Farm();
		farm1.setDog(dog1);
		// farm1 농장 안의 dog라는 변수에 dog1 객체를 넣어주는 것 -> 대표강아지
		// 농장 안에 있는 dog라는 이름의 변수상자에 강아지1을 보관 (배열이랑 상관 없음.)
		
		// 동물농장 배열에 강아지 새로 만들면서 넣기
		farm1.animals.add(new Dog("강아지2"));
		farm1.animals.add(new Dog("강아지3"));
		
		// animals 배열에 있는 강아지 출력, 강아지 정보 출력
		System.out.println("배열 안 강아지 총 마리 수 : " + farm1.animals.size());
		for(int i=0; i<farm1.animals.size(); i++) {
			System.out.println(i + "번째 강아지 : " + farm1.animals.get(i).getName());
		}
		
		// Dog 붕어빵 틀에 있는 count 변수상자 값 확인하기
		System.out.println("Dog틀 강아지 마리 수 : " + Dog.count);
		
		// 고양이 배열에 넣기
		farm1.animals2.put("첫번째 고양이", cat1);
		farm1.animals2.put("두번째 고양이", new Cat("고양이2"));
		farm1.animals2.put("세번째 강아지", dog1);
		
		// animals2 배열에 있는 고양이 출력
		System.out.println("첫번째 고양이를 찾아줘 : " + farm1.animals2.get("첫번째 고양이").name);
		System.out.println("두번째 고양이를 찾아줘 : " + farm1.animals2.get("두번째 고양이").name);
		
		// 세번째 강아지의 생년월일
		System.out.println("세번째 강아지의 생년월일 : " + ((Dog)farm1.animals2.get("세번째 강아지")).birth);
		// (Dog) : Animal 타입을 Dog로 강제 형변환
		// 왜 필요한가? Animal 타입에는 birth가 없기 때문이다.
		// 언제 써야 하는가? 부모 타입으로 저장된 객체를 자식처럼 사용할 때
		
	}

}
