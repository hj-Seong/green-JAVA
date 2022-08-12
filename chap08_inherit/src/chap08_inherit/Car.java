package chap08_inherit;

public class Car {
	// 필드
	protected int speed;
	// protected를 이용하면 상속과 접근이 가능하다.
	protected int gear;
	protected String color;
	
	// 생성자
	// 매개변수가 없는 생성자를 디폴트 생성자라고 한다.
	public Car() {
		this.speed = 0;
		this.gear = 0;
		this.color = "red";
	}
	
	public Car(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	
	
	
	// 메소드
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public int speedUp(int speed) {
		this.speed += speed;
		return this.speed;
	}
	public int speedDown(int speed) {
		this.speed -= speed;
		return this.speed;
	}
	
	@Override
	public String toString() {
		return color+"색 차량입니다";
	}
	
}
