
public class Test1 {

	public static void main(String[] args) {
		
		// Fish
		// 붕어빵 틀에서 진짜 붕어빵 만들기
		Fish fish1 = new Fish();
		Fish fish2 = new Fish();
		
		// 붕어빵 안에 들어있는 변수상자에 값 넣기
		fish1.name = "생선1";
		fish1.age = 1;
		
		System.out.println("붕어빵 이름과 나이 : " + fish1.name + ", " + fish1.age);
		
		// Sea
		// 바다 만들기
		Sea sea = new Sea();
		sea.name = "태평양";
		sea.fish = fish1;
		System.out.println("바다 안 물고기의 이름 : " + sea.fish.name);
		
		// Person
		// 붕어빵 틀에서 진짜 붕어빵 만들기
		Person person1 = new Person("홍길동1", 21, "010-1111-1111");
		Person person2 = new Person("홍길동2", 22, "010-2222-2222");
		Person person3 = new Person("홍길동3", 23, "010-3333-3333");
		
		System.out.println("<person1 변수상자에 들어있는 붕어빵 안에 들어있는 변수상자의 값>");
		System.out.println("person1의 name : " + person1.name);
		
		// walk() 실행하기
		boolean isPerson = person1.walk(8);
		System.out.println("walk 함수 실행 결과 : " + isPerson);
		
		// 아기 물고기 생성 후 출력
		fish1.babies.add(new Baby());
		System.out.println("아기 물고기는 몇마리? : " + fish1.babies.size());

	}

}
