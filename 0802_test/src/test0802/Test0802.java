package test0802;

import java.util.Scanner;

public class Test0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 입력받고 값이  2~9사이의 수이면 구구단을 출력
		// 2~9 사이의 수가 아니면 구구단에 등록된 수가아닙니다 를 출력
		
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int dan = input.nextInt();
		
		if ( dan >=2 && dan <= 9 ) {
			//구구단 출력
			for (int i=2 ; i<10 ; i++) {
				System.out.println(dan +"X"+i +"="+ dan*i);
			}
		} else {
			System.out.println("구구단에 등록된 수가 아닙니다.");
		}
		
		// 메뉴 선택 하는 반복문
		
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int num = input.nextInt();
		while ( num != 0 ) {
			// switch로 작성해도 된다
			if (num == 1) {
				System.out.println("짜장을 선택하였습니다");
			} else if (num ==2 ) {
				System.out.println("짬뽕을 선택하였습니다");
			} else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다");
			} 
			// 거짓일 경우( 그외의 경우)가 필요 없을 경우 else는 쓰지않아도 된다.
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt();
		}
		System.out.println("종료되었습니다");
		
		
		
		
		// do while로 작성
		do {
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt();
			if (num == 1) {
				System.out.println("짜장을 선택하였습니다");
			} else if (num ==2 ) {
				System.out.println("짬뽕을 선택하였습니다");
			} else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다");
			}
			
		} while(num != 0);
		
		
		
	}

}


