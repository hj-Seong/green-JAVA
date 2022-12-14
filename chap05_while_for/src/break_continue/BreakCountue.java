package break_continue;

import java.util.Scanner;

public class BreakCountue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문안에서 사용할 수 있는 키워드
		// break;
		
		// switch문에서 break;
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("입력된 값은 0입니다");
			break; // break를 사용해서 switch문을 나간다.
		default:
			System.out.println("다른 숫자값입니다");
			break;
		}

		// 반복문에서 break 
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			if(i == 4) {
				break;
			}
		}
		
		// while문에서 break
		int a = 1;
		while(true) {
			a++;
			System.out.println(a);
			if(a>10) {
				break;
			}
		}
		
		// for문에서 break;
		// 1~100까지 출력하는 중 77까지 출력하고 멈추기
		for (int i = 1 ; i<101 ; i++ ) {
			System.out.print(i+" ");
			// 77을 출력하고 나오기 위해 syso뒤에 작성
			if(i == 77) { 
				break;
			}
			// 10의 배수 일때 줄바꿈 추가
			if(i % 10 == 0) {
				System.out.println();
			} 
		}
		
		// 실습 while문에서 break
		Scanner input = new Scanner(System.in);
		int num1; 
		while (true) {
			System.out.print("숫자를 입력하세요.(0:종료) : ");
			num1 = input.nextInt();
			if(num1 == 0) {
				break;
			}
			System.out.println(num1);
		}
		
		// continue 확인
		// 현재의 실행중인 코드를 건너뜀
		for (int i =0 ; i<10; i++ ) {
			if(i == 4) {
				continue; 
				// 건너뛰고 싶은 코드 위쪽에 작성
			}
			System.out.println(i);
		}
		
		// 실습 continue 
		for (int i = 1; i<=30 ; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
