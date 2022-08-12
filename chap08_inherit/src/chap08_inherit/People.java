package chap08_inherit;

public class People {
	// 필드
	String name;
	String gender;
	int age;
	
	// 메소드
	// 생성자
	public People() {
		this.name = "홍길동";
		this.gender = "남";
		this.age = 20;
	}
	public People( String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// 설정자
	public void setPeople (String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// name을 출력하는 메소드
	public void selfIntro () {
		System.out.println(name+" 입니다.");
	}

}
