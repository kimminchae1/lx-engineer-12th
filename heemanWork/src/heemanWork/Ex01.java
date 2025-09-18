package heemanWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
//		업앤다운 게임
//		1부터 100사이의 임의 숫자를 생성
//		사용자로부터 숫자를 입력받기 (0아래이거나 100보다 크면 다시 입력)
//		입력숫자가 임의숫자보다 크면 아래란 문자열 출력, 작으면 위 라는 문자열 출력
//		몇번만에 맞췄는지를 출력
//		그동안 입력한 숫자를 저장하여 출력
		
		System.out.println("업앤다운 게임");
		
		ArrayList array = new ArrayList();
		
		// 1부터 100까지 임의 숫자 생성
		int random = (int)(Math.random()*100) + 1;
		System.out.println("1~100 사이 임의 숫자를 맞춰보세요." + random);
		// Math.random() : 0.0 이상 1.0 double(소수) 값 반환
		// *100 : 100까지의 숫자
		// (int) : 강제 형변환 casting / double→int 로 변환해서 소수점 이하 버림.
		// +1 : 현재 값이 0~99 이므로, 1~100 범위로 바꾸기 위해 1을 더함.
		
		// 사용자로부터 숫자 입력 후 입력한 숫자 출력
		Scanner scan = new Scanner(System.in); // System.in : 키보드 입력
		int input = scan.nextInt(); // nextInt() : 숫자만 받을 때 / 사용자가 입력한 숫자 읽어서 input에 저장
		System.out.printf("입력한 숫자 : %d\n", input); // %d : 형식 지정자, d는 "decimal"의 약자로 10진수 정수를 의미
		
		// 0 보다 아래거나 100 보다 크면 다시 입력
		while(input > 100 || input <= 0) {
			System.out.println("1과 100 사이 숫자로 다시 입력하세요.");
			input = scan.nextInt();
		} System.out.println("게임을 시작합니다.");
		array.add(input);
		
		// 입력한 숫자가 임의숫자보다 크면 아래, 작으면 위 라는 문자열 출력
		while(input != random) {
			if(input > random) {
				System.out.println("아래");
				input = scan.nextInt();
				array.add(input);
;			} else if(input < random) {
				System.out.println("위");
				input = scan.nextInt();
				array.add(input);
			}
		} System.out.println("정답입니다.");
		
		// 몇 번 만에 맞췄는지 출력
		System.out.println(array.size() + "번 만에 맞추셨습니다.");
		
		// 그동안 입력한 숫자 저장하여 출력
		for(int i=0; i<array.size(); i++) {
			System.out.printf("지금까지 입력한 숫자 : " + array.get(i));
		}
		
	}
}
