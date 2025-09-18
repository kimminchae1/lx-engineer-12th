package heeman;

public class ArrayTest {
	public static void main(String[] args) {
		
		// array : 배열
		// 선언, 생성, 할당, 참조
		
		// 배열 선언 : 갯수를 지정하지 않는다.
		int[] list;
		int list2 [];
		
		// 배열 생성 : 갯수를 지정해야 한다.
		list = new int[10];
		
		list[0] = 55;
		// list[10] = 100;
		// list[10] -> 문법에 오류는 없다. = 컴파일이 된다. = bin 폴더에 .class 파일이 만들어졌다.
		// 하지만 컴파일 하는 것과 실행 가능한 것은 다르다. 위 코드는 실행 오류이다. (10번째 리스트가 없기 때문에)
		
		int[] list3 = {12, 45, 7, 12, 46};
		
		// for-each (향상된 for문)
		for(int ele : list3) {
			System.out.print(ele);
		}
		
		System.out.println("");
		
		// 일반적인 for문 (index 기반)
		for(int i=0; i<list3.length; i++) {
			System.out.print(list3[i]);
		}
		
	}

}

//동일타입, 크기 변경이 불가하다.
// -> 가변적 길이, 크기를 쓰고 싶으면 ArrayList (=CollectionAPI)
