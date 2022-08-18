package Chap09_interface;

// implements 키워드를 통해서 메소드를 구현
// 인터페이스의 경우 대부분이 추상메소드로 이루어져있기 때문에 실행코드가 필요
// 인터페이스를 구현받은 클래스에서 실행코드 작성
public class Truck extends Car implements CarInterface {

	// 상속받은 필드값으로 메소드 구현
	public void setTruck (String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public String getTruckColor() {
		return color;
	}
	public int getTruckSpeed() {
		return speed;
	}
	 
	// 인터페이스로 구현
	@Override
	public void printCar() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스의 내용을 Truck에서 구현했습니다");
	}

}
