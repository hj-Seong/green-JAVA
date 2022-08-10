package test0810;

public class Student {
	//필드
	String name;
	int number;
	int score;
	
	
	// 생성자
	Student() {
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;
	}
	
	Student(String name, int number) {
		this.name = name;
		this.number = number;
		this.score = 0;
		
	}
	
	Student(String name, int number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
	
	void setScore(int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult () {
		// 60이상 합격, 미만 불합격
		if( score >=60) {
			System.out.println(name + "님은 합격입니다");
		} else {
			System.out.println(name + "님은 불합격입니다");
		}
	}

}
