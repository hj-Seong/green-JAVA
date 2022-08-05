package chap07_Object;

// 객체를 만들기 위한 클래스 선언
public class Box {
	// 필드 - 객체가 각각 사용하는 값
	int width;
	int length;
	int height;
	// 메소드 - 객체의 행동/연산/명령
	int calVoume() {
		return width*length*height;
	}
}
