package chap04_ifEx;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 입력 받아서 10보다 크고, 20보다 작다면, 변수 num을 출력
		// 10보다 크다 : num >10, 20보다 작다 : num < 20
		// 둘 다 참일때 변수 num을 출력 : &&
		Scanner input = new Scanner(System.in);
		System.out.print("10보다 크고 20보다 작은 수를 입력하면 출력됩니다 : ");
		int num = input.nextInt();
		if ( (num > 10) && (num < 20) ) 
			System.out.println(num);
		System.out.println("프로그램이 종료되었습니다");
		
		// 실습, 문자열 비교
		// 변수 안에 값을 할당하고 비교할때는 == 연산자 사용 가능
		// 문자열 값을 받아와서 비교 할때는 .equals(비교할 문자열) 사용
		System.out.print("이름을 입력해주세요 : ");
		String name = input.next();
		if ( name.equals("그린") ) // 결과값이 true, false를 가짐
			System.out.println("본인이 맞습니다");
		System.out.println("프로그램이 종료되었습니다");
		
		// 점수를 입력받고 
		// 점수가 60보다 크면, 합격
		// 아니면 불합격 
		// if-else 문이 끝나면 수고하셨습니다.
		System.out.print("점수를 입력해주세요 : ");
		int score = input.nextInt();
		if (score > 60) 
			System.out.println("합격");
		else 
			System.out.println("불합격");
		System.out.println("수고하셨습니다.");
		
		// 실습 - 중첩 if
		// 홀수짝수/음수양수 판단
		System.out.print("0을 제외한 숫자를 입력하세요 : ");
		int num1 = input.nextInt();
		
		if( num1%2 == 1 || num1%2== -1) {
			System.out.println("홀수입니다");
			if( num1 > 0 ) {
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		}
		else {
			// System.out.println(num1%2); 
			System.out.println("짝수입니다");
			if( num1 > 0 ) {
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		}
		
		// 실습 - 중첩if
		// 3개의 정수값을 받고 최대값을 출력하세요
		int a, b, c, max;
		
		System.out.print("숫자 세개를 띄워쓰기로 구분하여 출력하시오 : ");
		a = input.nextInt(); // 1
		b = input.nextInt(); // 2
		c = input.nextInt(); // 3
		
		if (a > b) {
			// a이 크므로 max값
			max = a; // max에 a값 할당
			if(a > c) { // 조건문을  ( max > c)
				System.out.println("최대값 : "+a); // max
			}
			else { 
				// c가 max값 보가 크므로 max값에 할당
				max = c;
				System.out.println("최대값 : "+c); // max
			}
		}
		else {
			if (b>c) {
				System.out.println("최대값 : "+b);
			}
			else {
				System.out.println("최대값 : "+c);
			}
		}
		
		// 실습, 연속적 if - else if - else
		// 학점계산
		System.out.print("현재 점수를 입력하세요 : ");
		int score1 = input.nextInt();
		if (score1 >= 90) {
			System.out.println("A학점입니다");
		}
		else if (score1 >= 80) {
			System.out.println("B학점입니다");
		}
		else if (score1 >= 70 ) {
			System.out.println("C학점입니다");
		}
		else {
			System.out.println("F학점입니다");
		}
		
	}

}
