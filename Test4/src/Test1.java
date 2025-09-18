import com.mc.Fish;

public class Test1 {

	public static void main(String[] args) {
		
		// 물고기 만들기
		Fish fish1 = new Fish("물고기1");
		Fish fish2 = new Fish("물고기2");
		
		// 물고기 나이
		fish1.setAge(5);
		fish2.setAge(8);
		
		// 물고기 정보 출력
		System.out.println("\nfish1의 정보 : " + fish1.getName() + ", " + fish1.getAge());
		System.out.println("fish2의 정보 : " + fish2.getName() + ", " + fish2.getAge());

	}

}
