package chap07_Object;

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 생성
		Box myBox;
		myBox = new Box();
		
		// 객체 = 세상에 있는 객체(오브젝트)를 참고하여 만듬.
		// 		 ex) 자동차, 상자
		// 자바는 객체지향 언어이다 - 캡슐화
		// 캡슐화 : 값과 메소드가 함께 들어가 있다.
		// 		   쉽게 바꿀 수 있다
		// 객체를 만들기 위해서 class 사용
		// class는 객체를 만드는 틀
		// 객체는 클래스를 통해 생성된 것
		
		// 미리 작성된 클래스 - String
		String name = new String("홍길동");
		// 객체 name은 .(도트)를 통해 메소드를 사용할 수 있다
		System.out.println(name.equals("홍길동"));
		
		// 직접 만든 클래스의 객체 Box에 접근하기
		// 참조형 변수로 사용, 변수이름으로 접근 - 주소출력
		System.out.println(myBox);
		// 객체에 접근하는 방법 - 필드의 값에 접근해서 출력
		System.out.println(myBox.height);
		// 객체에 접근하는 방법 - 메소드의 계산결과를 출력
		
		System.out.println(myBox.calVoume());
		
		// 만든 클래스의 객체 생성하기
		Student myStudent = new Student();
		System.out.println(myStudent.name);
		// 필드에 직접 접근해서 값 할당 (잘사용하지않음)
		myStudent.name = "홍길동";
		System.out.println(myStudent.name);
		myStudent.age = 30;
		System.out.println(myStudent.age);
		myStudent.grade = 5;
		myStudent.printGrade();
		
		// 다른 객체 생성
		Student myStudent1 = new Student();
		System.out.println(myStudent1.name);
		myStudent1.printGrade();
		// 변수에 들어가 있는 값 확인 
		System.out.println(myStudent);
		System.out.println(myStudent1);
		
		// new와 생성자를 통해서 객체 생성
		// Box(50) 50의 값을 인수라고 부른다
		Box mybox2 = new Box(50);
		System.out.println(mybox2.calVoume());
		
		// 실습. 생성자 확인
		Student s1 = new Student();
		Student s2 = new Student("흥부");
		Student s3 = new Student("놀부", 30, 5);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name + s3.grade);
		
		myBox.setWidth(50);
		myBox.printData();
		
		s1.setGrade(4);
		s1.printGrade();
		s2.printGrade();
					// return 값 30이 들어감
		System.out.println(s3.getAge());
		// 아래와 같이 출력되는것과 동일 
		//System.out.println(30);
		
		s1.printLevel();
		s2.printLevel();
		
		NumCheck num = new NumCheck();
		num.setNum(-10);
		num.checkNum();
	}

}
