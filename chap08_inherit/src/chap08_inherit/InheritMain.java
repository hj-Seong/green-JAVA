package chap08_inherit;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsCar car1 = new SportsCar();
		// 상속받은 Car의 필드값을 사용할수 있다.
		// protected 접근지정자를 사용한 경우 상속이 가능하다
		System.out.println(car1.color);
		
		Car car2 = new Car();
		// protected 접근지정자를 사용한 경우 접근이 가능하다
		System.out.println(car2.color);
		
		People p1 = new People();
		p1.selfIntro();
		
		// 서브클래스는 생성자를 실행할 때  
		// 슈퍼클래스의 생성자를 가져와서 실행한다
		Worker w1 = new Worker();
		System.out.println(w1.nextMonth());
		w1.selfIntro();
		w1.setPeople("흥부", "남자", 30);
		w1.selfIntro();
		
		System.out.println(car1.speedUp(10));
		
		w1.intro();
		w1.selfIntro();
		
		SportsCar car3 = new SportsCar();
		SportsCar car4 = new SportsCar(10, 2, "blue", true);
		
		
		
	}

}
