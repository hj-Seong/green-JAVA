package chaper08_abstract;

public abstract class Mammal extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("이동한다");
	}
	
	public abstract void sound();
}
