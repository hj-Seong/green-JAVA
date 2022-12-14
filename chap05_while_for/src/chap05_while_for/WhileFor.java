package chap05_while_for;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 while
		// 조건이 참일때 안의 블록을 반복한다.
		// 반복문 while을 쓸때 주의점
		// 1. 조건문이 true일때만 안의 내용이 실행
		// 2. 조건문이 항상 true이면 무한반복에 빠져서 프로그램이 끝나지않는다
		int num = 0; 
		while ( num < 5 ) {
			System.out.println("반복하고 있습니다 : "+num);
			num++;
		}
		
		// 1~10까지 출력 
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		
		// 실습 while - 카운트다운
		int countDown = 10;
		while (countDown > 0) {
			System.out.println(countDown);
			countDown--;
		}
		
		// 실습 while 전체합, 짝수 합, 홀수 합
		int sum, even, odd;
		int num2 = 1;
		sum = 0;
		even = 0;
		odd = 0;
		
		while (num2 <= 100) {
			// 전체 합
			sum += num2;
			
			// 짝수의 합
			if( num2 % 2 == 0 ) {
				even += num2;
			}
			else { // 홀수의 합
				odd += num2;
			}
			num2++;
		}
		// 반복이 끝난후에 확인을 하려면
		// while문 바깥에 작성
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);
		
		// do while  : 반복할 내용이 무조건 한번은 실행되는 조건문
		Scanner input = new Scanner(System.in);
		int num4 = 0;
		int sum4 = 0;
		
		do { // while의 뒤에있던 반복할 내용이 do를 이용해서 앞으로 가져옴
			System.out.print("더할 값을 입력해주세요(0을 넣으면 멈춤) : ");
			num4 = input.nextInt();
			sum4 += num4;
		} while (num4 != 0); // 조건이 참이라면 do로 올라가 다시 반복
		
		System.out.println("더한 값 : "+ sum4);
		
		// 실습 do while  
		// 1~10까지의 내용 출력
		int num5 = 1;
		do {
			System.out.println(num5); // 1출력
			num5++; //num5의 값 증가
		} while(num5 <= 10);
		
		// for문 
		// for(초기화 ; 조건식 ; 증감계산) 
		for (int num6 = 1; num6<=10 ; num6++) {
			System.out.println(num6);
		}
		
		// for문을 이용한 1~10 까지의 합
		int sum7 =0;
		for (int num7 = 1 ; num7 <=10 ; num7++ ) {
			sum7 += num7;
		}
		System.out.println(sum7);
		
		 // 실습 for - 팩토리얼
		long mult = 1;
		for (int num8=1 ; num8<=20 ; num8++) {
			mult *= num8;
			System.out.println(num8);
		}
		System.out.println("20!의 값 : "+ mult);
							// 1, 5, 7, 11, 
		// 1~20 까지의 정수 중 (2 또는 3의 배수)가 아닌 수의 총합.
		int sum9 =0;
		for (int num9 = 1 ; num9 <= 20 ; num9++ ) {
			// !( num9 % 2 ==0 || num9 %3 == 0 ) 
			if ( num9 % 2 != 0  &&  num9 % 3 != 0 ) {
				sum9 += num9;
				System.out.println(num9);
			}
		}
		System.out.println(sum9);
		
		// for문의 초기화 값은 for문안에서만 사용이 가능하다
		for (int i = 0 ; i<5 ; i++) {
			System.out.println("반복문입니다" + i);
		}
		// System.out.println(i); //for문 밖에서는 쓸수 없다.
		// 다른 for문에서 사용한 이름은 다른 for문에서 사용할 수 있다
		for (int i = 0 ; i<10 ; i++) {
			System.out.println("새로운 i를 이용한 반복문입니다"+i);
		}
		
		// 중첩 반복문 : 반복문 안에 반복문이 들어가 있는 형태
		for (int i=0 ; i<2 ;i++) {
			System.out.println("for문 i에서 반복중입니다");
			for(int j=0 ; j<2 ;j++) {
				System.out.println("i : "+i+", j : "+j);
			}
			System.out.println("내부 for문이 종료되었습니다");
		}
		
		// 중첩 반복문 - 구구단 2~9
		for (int i = 2; i < 10 ; i++) {
			System.out.println("<"+i+"단>");
			for (int j = 1; j < 10 ; j++) {
				 System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		// 중첩 반복문으로 5x5 박스 출력하기
		for (int i =0; i<5; i++) {
			// 가로 * 5개를 찍어줌
			for (int j=0; j<5; j++) {
				System.out.print("* ");
			}
			// * 5개가 찍힌 후 줄바꿈
			System.out.println();
		}
		
		// 중첩 반복문 확인 + 조건문 확인
		for ( int  i = 0; i<5;i++ ) {
			for (int j = 0 ; j<5 ; j++) {
				if (true) {
					System.out.print(i+","+j+"  ");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
		
		// 실습 중첩반복문과 조건
		for (int i =0 ; i<5; i++) {
			for (int j =0; j<5; j++) {
				if(i>=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
