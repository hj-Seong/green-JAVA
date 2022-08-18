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
		
		Student s1 = new Student();
		Student s2 = new Student("흥부", 1);
		
		int check = s1.compareTo(s2);
		switch (check) {
		case 1:
			System.out.println("s1의 학년이 더 높습니다");
			break;
		case 0:
			System.out.println("s1과 학년이 같습니다");
			break;
		case -1:
			System.out.println("s1의 학년이 더 낮습니다");
			break;
		default:
			System.out.println("잘못된 객체입니다.");
		}
		
		CarInterface ci = new CarInterface() {
			@Override
			public void printCar() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스의 객체입니다");
			}
		};
		ci.printCar();
		
		// DisplayInterface를 이용하여 인터페이스 객체를 만드세요(익명객체)
		// 변수이름은 di 
		// di가 켜졌습니다. / di가 꺼졌습니다  출력
		DisplayInterface di = new DisplayInterface() {
			
			@Override
			public void onDisplay() {
				// TODO Auto-generated method stub
				System.out.println("di가 켜졌습니다");
			}
			@Override
			public void offDisplay() {
				// TODO Auto-generated method stub
				System.out.println("di가 꺼졌습니다");
			}
		};
		
		di.onDisplay();
		di.offDisplay();
		
		// 클래스를 상속받고 인터페이스를 구현한 서브클래스
		Taxi taxi = new Taxi();
		taxi.setTaxi("red", 10);
		System.out.println(taxi.getTexiColor());
		
		// Truck 클래스에 Car를 상속하여 
		// setTruck과 getTruckColor, getTruckSpeed를 작성하세요
		Truck truck = new Truck();
		truck.setTruck("blue", 5);
		System.out.println(truck.getTruckColor());
		
		// 인터페이스의 상속과 상수 정의
		Bus bus = new Bus();
		bus.RestDay(7);
		
	}

}
