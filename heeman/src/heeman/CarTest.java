package heeman;

public class CarTest {
	
	public static void main(String[] args) {
		
		new Car();
		
		// car 객체 생성
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		
		
		// 이름
		car1.setName("자동차1");
		car2.setName("자동차2");
		car3.setName("자동차3");
		car4.setName("자동차4");
		
		// 스피드
		car1.setSpeed(300);
		car2.setSpeed(80);
		car3.setSpeed(300);
		car4.setSpeed(200);
		
		// 출력
		System.out.println(car1.name + "의 스피드 : " + car1.getSpeed());
		System.out.println(car2.name + "의 스피드 : " + car2.getSpeed());
		System.out.println(car3.name + "의 스피드 : " + car3.getSpeed());
		System.out.println(car4.name + "의 스피드 : " + car4.getSpeed());
		
	}

}

class Car {
	
	String name;
	int speed;
	Car[] list = new Car[4];
	
	Car() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
