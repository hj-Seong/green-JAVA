package chap01_test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to");
		System.out.println("Java");
		int x = 0; 
		System.out.println(x);
		System.out.print("숫자를 입력하세요 : ");
		
		//ctrl+space 해서 Scanner추가
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		System.out.println(x);
		System.out.println("출력했습니다");
		
		System.out.println(1+x); // 1과 사용자 입력수가 더해져서 나옴
	}
}
