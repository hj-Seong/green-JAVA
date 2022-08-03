package chap05_while_forex;

import java.util.Scanner;

public class WhileForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 모든 수를 더하는 프로그램
		// while문 사용 (조건, 반복내용)
		// 조건 - 0을 입력 받을 때까지 
		//		: == 관계연산자를 사용
		// 0이 들어왔을때(같을때) : 반복 멈춤
		// 다른 수가 들어왔을 때 : 계속해서 모든 숫자를 더함
		// 반복내용 - 모든 숫자를 더함
		// 			sum변수를 통해서 들어오는 값들을 더하여 저장
		Scanner input = new Scanner(System.in);
		System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
		int num = input.nextInt();
		
		int sum = 0; // 값을 더하기 위한 변수 초기화
		while (num != 0) { // num이 0이 아닐때 반복
			// 1. 값을 더함
			sum += num; // sum = sum + num;
			// 2. 다시 num을 비교하기 위해서 input으로 입력 받음
			System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
			num = input.nextInt();
		}
		System.out.println("총 더한 값 : "+sum);
		
		// while - 구구단 4단.
		int dan = 4;
		int num1 = 1;
		while (num1 <10) { // 9까지 출력하기위한 조건
			System.out.println(dan+" X "+num1+" = "+(dan*num1));
			num1++; // num1의 값을 증가시킴
		}
		
		// 실습 do-while 업다운 게임
		// 반복 조건 - 59이 아니면 반복한다.
		// 반복 내용 - 입력받은 값을 59와 비교해서 작은지 큰지 알려준다.
		
		int inputNum = 0;
		
		do {
			// 1. input을 이용해서 값을 입력받음
			System.out.print("정답을 추측하여 보시오 : ");
			inputNum = input.nextInt();
			
			// 2. 입력받음 값을 비교(if) 큰지 작은지 알려줌
			if (inputNum >59) {
				System.out.println("정답값보다 큽니다");
			}
			else if (inputNum < 59) {
				System.out.println("정답값보다 작습니다");
			}
		} while ( inputNum != 59 );
		// 정답은 반복문을 빠져나와서 한번만 출력
		System.out.println("축하합니다. 정답입니다");
		
		// 반복할 숫자를 입력받은후 반복해서 더한 값 출력하기.
		System.out.print("더하기를 몇 번 반복할지 작성하세요 : ");
		int count = input.nextInt();
		
		int a, b;
		// 횟수만큼 반복해줄때는 초기값을 0으로 많이 둔다.
		for (int num3 = 0; num3 <count ; num3++) {
			System.out.print("두 수를 띄워서 작성하세요 : ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("결과 : "+(a+b));
		}
		
	}

}












