package heeman;

public class ControlTest {
	
	public static void main(String[] args) {
		
		// 1부처 몇까지 누적해야 백만을 초과할까? 1+2+3+...+n
		// 변수? 로직? 제어문?
		// count, sum
		// 반복문, for, while -> 몇번이나 반복해야할지 모를 때
		
		// 1부터 몇 개의 숫자를 더했는지 저장하는 변수
		int count = 0;
		
		// 숫자들을 계속 더해서 누적된 합을 저장하는 변수
		int sum = 0;
		
		// sum이 백만보다 작을 동안 계속 반복하는 while문
		while(sum < 1000000) {
			count++; // count에 1을 더한다. (1,2,3... 점점 증가)
			sum = sum + count; // 현재의 count 값을 sum에 더한다.
		}
		
		System.out.printf("1부터 %d까지 누적하면 %d가 되고 백만을 넘습니다.", count, sum);
		// printf : 형식을 지정해서 출력하는 메서드
		// println : 그냥 값을 출력하고 줄바꿈만 해준다.
		// %d : 정수 int를 출력하라는 뜻, %d 자리에 차례대로 count와 sum의 값이 들어간다.
		
	}

}
