import java.util.ArrayList;

import com.mc.animal.Animal;
import com.mc.animal.Cat;
import com.mc.animal.Dog;
import com.mc.fish.Fish;
import com.mc.fish.Shark;

public class Test1 {

	public static void main(String[] args) {
		
		// Fish 클래스 객체 생성
		Fish fish1 = new Fish();
		fish1.name = "물고기1";
		fish1.age = 2;
		fish1.swim();
		
		// Shark 클래스 객체 생성
		Shark shark1 = new Shark();
		shark1.name = "샤크1";
		shark1.age = 2;
		shark1.mobile = "010-1111-1111";
		shark1.swim();
		
		// Animal 클래스 객체 생성
		Animal animal = new Animal();
		animal.name = "동물";
		animal.walk();
		animal.swim();
		
		// Dog 클래스 객체 생성
		Dog dog1 = new Dog();
		dog1.name = "강아지1";
		dog1.age = 2;
		dog1.walk();
		dog1.run();
		dog1.swim();
		
		// Cat 클래스 객체 생성
		Cat cat1 = new Cat();
		cat1.name = "고양이1";
		cat1.mobile = "010-1122-2222";
		cat1.walk();
		cat1.run();
		cat1.swim();
		
		// 다형성 : 하나의 타입(예: Animal)으로 여러 타입의 객체(Dog, Cat 등)를 다룰 수 있는 것
		Animal dog2 = new Dog();
		Animal cat2 = new Cat();
		
		dog2.walk();
		// dog2.run(); -> 컴파일 오류
		
		// 배열 만들기
		// 칸의 크기를 Animal로 하면, Dog와 Cat을 넣을 수 있다.
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog1);
		animals.add(cat2);
		
		Animal dog3 = animals.get(0); // 같은 곳을 바라보게 한다. 객체는 하나인데 dog3과 dog2는 하나의 객체를 바라본다.
		Animal cat3 = animals.get(1);
		
		// 형변환
		// Animal로 포장된 Dog 객체를 다시 Dog로 꺼내서 쓴다.
		// dog4의 자료형은 Dog 클래스, 참조하고 있는 객체도 Dog 타입의 객체
		Dog dog4 = (Dog) dog3;
		
		System.out.println(dog3.name);
		System.out.println(dog2.name);
		System.out.println(dog4.name);
		
	}

}
