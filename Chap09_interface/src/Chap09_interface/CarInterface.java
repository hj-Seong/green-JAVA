package Chap09_interface;

// interface 키워드를 통해서 인터페이스 생성
public interface CarInterface {
	// 인터페이스 구성요소의 특징
	// 1. 추상메소드로만 이루어져있다
	// 1-1. 안에 실행코드가 필요한 경우 default 키워드 사용
	// 2. 필드값은 사용할수 없고 상수(final)로만 사용 가능
	// 3. 정적 메소드 사용가능
	/* 인터페이스는 기본적으로 추상메소드로 이루어져 있다 */
	
	
	// 필드값대신 상수 사용 가능
	final int NUMBER = 0;
	
	// 정적메소드 사용가능
	public static void printCarNumber() {
		System.out.println("인터페이스의 정적 메소드입니다 : "+NUMBER);
	}
	
	// 추상메소드 - 추상메소드의 형태가 기본 메소드
	public void printCar();
	
	// 블록이 있는 메소드를 사용할때 default 키워드 사용
	default public void move() {
		System.out.println("내용을 추가하기위해서는 default 키워드 사용");
	};

}
