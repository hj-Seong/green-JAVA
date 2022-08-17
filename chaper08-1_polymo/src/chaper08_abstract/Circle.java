package chaper08_abstract;

public class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다");
	}

	@Override
	public void print(String word) {
		// TODO Auto-generated method stub
		System.out.println("원 클래스에서 출력 :"+word);
	}

}
