package chap07_Object;

public class Student {
	// 필드값 
	// private는 클래스 안에서만 사용가능
	// public은 클래스 안에서 뿐만 아니라 객체를 통해서도 접근가능
	// 값을 적어주지 않았을때 package까지 접근가능
	String name;
	public int age;
	public int grade;
	
	// 매개변수를 갖지않는 생성자
	// 이름(홍길동) 나이(0) 학년(0) 초기화
	Student() {
		this.name = null;
		this.age = 0;
		this.grade = 0;
	}
	
	// name값을 매개변수로 받아오는 생성자 
	// 이름(name) 나이(0) 학년(0) 초기화
	Student(String name) {
		this.name = name;
		this.age = 0;
		this.grade = 0;
	}
	
	// 매개변수를 여러개 받아와서 사용할 수 있다
	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 메소드 
	void printGrade() {
		System.out.println(grade);
	}
	
	// 실습, return을 통해서 나이값을 돌려주는 메소드
	int getAge() {
		return this.age;
	}
	
	// 매개변수를 통해서 학년을 수정하는 메소드 
	void setGrade(int grade) {
		this.grade = grade;
	}
	
	// if, for, while 사용가능
	void printLevel() {
		// grade에 따라서 고학년 저학년을 나눠서 출력
		// 3학년 초과는 고학년
		// 3학년 이하는 저학년
		if (this.grade >3) {
			System.out.println("고학년입니다");
		} else {
			System.out.println("저학년입니다");
		}
		
	}
	
	
	
}
