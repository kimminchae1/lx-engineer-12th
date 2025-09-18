import java.util.ArrayList;

import com.mc.sea.Fish;
import com.mc.sea.Sea;

public class Test1 {

	public static void main(String[] args) {
		
		// 바다 2개 만들기
		Sea sea1 = new Sea("바다1");
		Sea sea2 = new Sea("바다2");
		
		// 물고기 3마리 만들기
		Fish fish1 = new Fish("물고기1");
		Fish fish2 = new Fish("물고기2");
		Fish fish3 = new Fish("물고기3");
		
		// 바다1 -> 배열 만들고 물고기 2마리 넣기
		ArrayList<Sea> seas1 = new ArrayList<>();
		seas1.add(fish1);
		seas1.add(fish2);
		
		// 바다2 -> 배열 만들고 물고기 2마리 넣기
		ArrayList<Sea> seas2 = new ArrayList<>();
		seas2.add(fish3);
 		
		// 물고기 출력하기
		System.out.println("총 물고기 수 : " + Fish.count);
		System.out.println(sea1.name + "안에 있는 물고기는 총 " + seas1.size() + "마리이고, 물고기 이름은 " + fish1.name + ", " + fish2.name + " 입니다.");
		System.out.println(sea2.name + "안에 있는 물고기는 총 " + seas2.size() + "마리이고, 물고기 이름은 " + fish3.name + " 입니다.");

	}

}

// 질문
// Fish 클래스에서 return 값이 없는데 메인에서 count 가능한 이유?
// 정답
// count가 static 변수이기 때문에 객체 생성하지 않아도 클래스 이름으로 바로 접근 가능
// static으로 선언된 변수는 클래스 자체에 소속된다.
// 따라서 객체가 아닌 클래스 이름만으로 접근할 수 있다.

// static 이란?
// static 변수는 공용 정적 공간에 하나만 존재하는 값
// 전체 클래스 하나만 저장해두는 것