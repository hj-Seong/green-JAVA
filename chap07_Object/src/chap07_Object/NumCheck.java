package chap07_Object;

public class NumCheck {
	// 필드
	private int num;
	
	// 메소드
	// 숫자값을 설정
	public void setNum(int num) {
		this.num = num;
	}
	
	// 숫자값을 되돌려줌
	public int getNum() {
		return this.num;
	}
	
	// 양수, 음수, 0 비교 후 출력 메소드
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
