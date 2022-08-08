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
		this.name = "홍길동";
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
}
