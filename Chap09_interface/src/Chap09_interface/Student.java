package Chap09_interface;

public class Student implements Comparable{
	private String name;
	private int grade;
	
	// 디폴트 생성자
	public Student() {
		name ="홍길동";
		grade = 1;
	}
	// 매개변수가 있는 생성자
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		// 비교하는 메소드
		// Student객체를 받아와서 그 객체안의 grade를 비교하는 메소드
		
		// 1. otherObject를 instanceof 로 객체의 타입을 확인하고
		//    객체의 타입이 Student일때, 그 객체를 Student 객체로 형변환한다
		if ( otherObject instanceof Student) {
			Student student = (Student)otherObject;
			// 2. 형변환을 했다면, this 객체의 grade에 접근해서
			//      형변환한 otherObject의 grade를 비교
			// 2-1. 값이 같으면 0을 return, 값이 this가 크면 1을 return
			// 		this가 작으면 -1을 return
			
			if( this.grade == student.grade) {
				return 0;
			} else if (this.grade > student.grade) {
				return 1;
			} else {
				return -1;
			}
			
			
		} else {
			// 1-1. 객체의 타입이 Student가 아닐때, 
			// Student 객체가 아닙니다 를 출력하고 return 10을 반환
			System.out.println("Student객체가 아닙니다");
			return 10;
		}

	}
	
}
