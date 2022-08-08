package chap07_Object;

public class NumCheck {
	// 필드 
	// private = 클래스안에서만 접근가능
	private int num;
	
	// 메소드, 접근제어자를 붙여서 범위를 알려줄수있다
	// public = 모든 곳에서 접근가능
	// 숫자값을 설정
	// return 값이 없기때문에 void를 사용
	public void setNum(int num) {
		this.num = num;
		
	}
	
	// 숫자값을 되돌려줌
	// return 값의 자료형이 int 임으로 앞에 int를 붙여줌
	public int getNum() {
		return this.num;
	}
	
	// 양수, 음수, 0 비교 후 출력 메소드
	// 메소드안에 다양한 코드들을 작성할 수 있다
	public void checkNum() {
		if (this.num >0) {
			System.out.println("양수");
		} else if( this.num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
	
	
}
