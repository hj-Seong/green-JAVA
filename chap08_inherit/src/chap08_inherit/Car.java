package chap08_inherit;

public class Car {
	// 필드
	protected int speed;
	// protected를 이용하면 상속과 접근이 가능하다.
	protected int gear;
	protected String color;
	
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
	
}
