package chap02_var;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed; // 변수 선언
		long interertRate = 1; // 변수 초기화
		int 반복횟수, loop2 ; // 변수 동시 선언
		
		// 선언을 한 경우 변수 이름에다가 값을 넣음
		speed = 10;
		반복횟수 = 2;
		loop2 = 20;
		
		// 변수는 값을 할당할때 마지막에 할당된 값이 들어간다.
		// 위에서는 10이였지만 0의 값을 넣어주었기 때문에
		// 값이 0이 된다.
		speed = 0; 
		
		// 변수를 출력을 하기위해서는 이름만 작성한다
		System.out.println(speed);
		System.out.println(반복횟수);
		
		// 실습 정수형 변수 선언/초기화 하기
		// 나이(26), 일자(10), 금액(5000), 개수(5), 점수(100)
		
		int 나이 = 26;
		int date = 10;
		int pay = 5000;
		int count = 5;
		int score = 100;
		
		System.out.println(나이);
		System.out.println(date);
		System.out.println(pay);
		System.out.println(count);
		System.out.println(score);
		
		// 실습 long 변수 
		// long에 값을 넣어줄때 int의 범위를 지난 값은 L을 붙여준다.
		long distance = 9460800000000l;
		
		// 변수는 동일한 이름을 선언할 수 없다
		long speedLight = 300000; 
		
		// print메소드 안에 수식을 작성하면 계산하여 출력한다.
		System.out.println( distance/speedLight );
		
		// 실습 실수 double형
		// 반지름이 10인 구의 부피 구하기
		// 변수의 값에 계산식도 들어갈수 있다.
		double volume = 4 / 3 * 3.14 * 10 * 10 * 10;
		System.out.println(volume); // 소수점이 포함되어서 나옴
		
		// 3.14값을 double형에 할당
		double pi = 3.14;
		System.out.println(pi);
		
		// 기호 상수(final) - 값을 수정하여 할당할 수 없다.
		// 초기화 값을 바꾸어서 원하는 값을 넣을 수 있다
		final double PI = 3.141592;
		System.out.println(PI);
		
		// 실습 기호 상수 final
		// 정육면체의 한변의 길이를 기호상수로 두고 계산
		final int LINE = 10;
		
		// 변수는 변수끼리 계산한 값도 할당할 수 있다 
		int V = LINE * LINE * LINE;
		System.out.println(V);
		
		// boolean 논리형 - 참, 거짓 두 가지 값만 가지는 자료형
		boolean isRain = false; // 0과 같은 정수값은 넣을수 없다.
		System.out.println(isRain); //false로 출력되지만 boolean값이다
		
		// 실습 논리형 
		int num = 10;
		boolean check;
		check = (num > 20); // 10 > 20  : 거짓
		System.out.println(check);
		
		// num 값을 30으로 바꿔서 확인하기
		num = 30;
		check = (num>20); // 30 > 20 : 참
		System.out.println(check);
		
		// 문자형과 문자열
		// 문자형은 유니코드로 된 한 글자를 표시할 수 있다
		// 따옴표 사용
		char ch1 = '가';
		char ch2 = '\uac00'; // 역슬래시(\) : Enter키 위에 있음
		System.out.println(ch2);
		
		// 문자열은 String 클래스를 이용해서 값을 할당할수 있다
		// "" 쌍따옴표 사용 : 쌍따옴표 안에 있는 모든 글은 문자열 취급
		String s = "Hello world!";
		System.out.println(s);
		
		//      (자료형)(변수이름) = (값) 
		// 할당 방법 : int num1 = 100
		// int를 이용하여 (변수이름)number에 숫자값 10을 할당하세요
		int num1 = 10;
		
		// boolean을 이용하여 isSunny에 true 값을 할당하세요
		boolean isSunny = true;
		
		// char를 이용하여 char_a에 a 값을 할당하세요
		char char_a = 'a';
		
		// String을 이용하여 sayHi에 hi를 할당하세요
		String sayHi = "hi";
		
		System.out.println(sayHi); // 변수의 경우는 변수 이름만 넣어서 확인
		
		// 문자열의 특수문자
		// \(역슬래시) : 엔터키 위쪽에 원화 표시
		String word = " \" : 쌍따옴표표시 \' : 따옴표표시 \n새 라인"; 
		
		// sysout 적은 후 ctrl+space : 자동완성
		System.out.println(word); 
		
		// 실습 특수문자
		// 쌍따옴표가 들어간 "Hello world" 출력하기
		String word2 = "\"Hello \nworld\"";
		System.out.println(word2);
		
		// 형변환 
		// 축소변환 : double > int 데이터가 사라질수 있다(소수점이하 사라짐)
		int i = (int)10.5;
		System.out.println(i);
		
		// 확대변환 : int > double 
		double d = (double)10;
		System.out.println(d);
		
		// 실습 확대 변환
		// 328/5의 결과 확인
		
		// 65 > int/int > int형으로 출력
		System.out.println(328/5); 
		
		// 65.6 > double/int > double형으로 출력(더 큰쪽으로 맞춤)
		System.out.println((double)328/5); 
		
		// 65.6 > double/double > double형으로 출력
		System.out.println((double)328/(double)5);
		
		// 하나라도 실수형이면 실수형으로 출력된다.
		System.out.println(328.0/5);
		
		// 강제로 int로 형변환을 했기 때문에 결과가 6, int형으로 나옴
		System.out.println((int)32.8/5);
		
	}
	

}
