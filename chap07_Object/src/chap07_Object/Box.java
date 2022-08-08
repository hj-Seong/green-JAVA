package chap07_Object;

// 객체를 만들기 위한 클래스 선언
public class Box {
	// 필드 - 객체가 각각 사용하는 값
	int width;
	int length;
	int height;
	
	// 생성자
	// new를 이용해서 객체를 생성할 때 
	// 그 값을 초기화할 수 있다.
	Box() {
		// this를 사용하여 클래스의 필드와 메소드에 접근할수 있다.
		this.width = 10;
		this.length = 10;
		this.height = 10;
	}
	
	// 매개변수를 갖는 생성자
	// 외부에서 값을 받아와서 생성자 혹은 메소드 내에서 쓰는 변수
	// 일상예시) 커피(값)를 가져올 때 - 컵(변수)에 담아서 들고옴
	Box(int z) {
		// 가져온 z에 담긴 값은 {}블록 안에서 사용할 수 있다
		this.width = z;
		this.length = z;
		this.height = z;
	}
	
	
	// 메소드 - 객체의 행동/연산/명령
	int calVoume() {
		return width*length*height;
	}
	
	
}
