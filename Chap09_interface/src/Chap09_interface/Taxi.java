package Chap09_interface;

public class Taxi extends Car implements CarInterface{

	// Car의 슈퍼클래스의 필드/메소드 사용
	public void setTaxi(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public String getTexiColor () {
		return color;
	}
	
	// 인터페이스 구현
	@Override
	public void printCar() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스의 내용을 Taxi에서 구현했습니다");
	}

}
