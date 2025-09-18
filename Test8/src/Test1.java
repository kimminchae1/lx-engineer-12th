
public class Test1 {

	public static void main(String[] args) {
		
		// 동물농장 만들기
		Farm farm = new Farm();
		
		// 강아지 만들고 해시에 넣기
		Dog dog1 = new Dog("강아지1");
		Dog dog2 = new Dog("강아지2");
		farm.animals.put("첫번째 강아지", dog1);
		farm.animals.put("두번째 강아지", dog2);
		
		// 고양이 만들고 해시에 넣기
		Cat cat1 = new Cat("고양이1");
		Cat cat2 = new Cat("고양이2");
		farm.animals.put("첫번째 고양이", cat1);
		farm.animals.put("두번째 고양이", cat2);
		
		// 강아지, 고양이 출력
		System.out.println("첫번째 강아지 이름은? -> " + farm.animals.get("첫번째 강아지").name);
		System.out.println("두번째 고양이 이름은? -> " + farm.animals.get("두번째 고양이").name);
		
		// 고양이 태어난 시간 출력
		System.out.println("첫번째 고양이가 태어난 시간 : " + farm.animals.get("첫번째 고양이").birth);
		System.out.println("첫번째 고양이가 태어난 시간 : " + cat1.birth);
		
	}

}
