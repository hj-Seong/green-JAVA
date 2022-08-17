package chaper08_abstract;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상클래스는 객체를 생성하게되면 생성자로 생성할수 없다
		// 추상메소드의 몸체를 구현해서 사용할수 있다
		// 서브클래스를 통해서 상속받아 그 몸체를 구현하여 사용한다.
		// Shape s1 = new Shape();
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print("단어를 입력합니다");
		r1.move(10, 20);
		
		Circle c1 = new Circle();
		c1.draw();
		c1.print("원");
		
		Dog dog = new Dog();
		dog.move();
		dog.sound();
		
		Cat cat = new Cat();
		cat.move();
		cat.sound();
		
	}

}
