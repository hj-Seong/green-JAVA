package Chap09_interface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스를 구현하여 작성한 클래스는 서브클래스와 동일하게 쓰인다.
		// 상속과 인터페이스의 차이점
		// 상속은 부모클래스의 필드/메소드를 가져다 쓰고 필요한 부분을 오버라이딩
		// 인터페이스는 인터페이스의 추상메소드를 오버라이딩해서 구현하여 사용
		Truck t1 = new Truck();
		t1.move();
		t1.printCar();
		
		// 하나의 인터페이스로 여러 클래스의 메소드의 이름을 동일하게 사용해야할 때
		// 인터페이스 구현을 할때 반드시 오버라이딩을 하기 때문에
		// 작성할 메소드의 갯수가 동일
		Taxi t2 = new Taxi();
		t2.printCar();
		
		DisplayTV tv = new DisplayTV();
		tv.onDisplay();
		tv.offDisplay();
	}

}
