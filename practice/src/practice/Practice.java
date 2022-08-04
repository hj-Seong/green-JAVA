package practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum; // 변수 선언 = 변수를 사용할 준비가 됨
		sum = 6 + 8; // 14
		sum = 2 + 1; // 3 - 변수는 가장 마지막 값을 가지게 된다
		// 코드는 항상 위에서 아래로 실행된다.
		System.out.println(sum);
		String name = "홍길동"; // 변수의 초기화
		// 선언을 먼저하는 경우
		// for과 while 반복문을 사용할때 선언을 해줌
		int num = 0;
		for (int i = 0; i < 5; i++) {
			num = i;
		}
		System.out.println(num);

		if (num > 3) { // 조건식을 만들기 위한 규칙
			System.out.println("a값은 3보다 큽니다 ");
		}
		
		// 통장 확인 프로그램
		// 기능을 선택하고 금액을 입력하면 
		// 입금, 출금, 송금 하는 프로그램.
		
		// 변수 : 통장 = 가지고 있는 금액
		// 입금 : 통장에 입력한 금액을 추가함 +
		// 아래 기능의 조건(통장의 금액이 입력한 금액보다 클때)
		// 출금 : 통장에 입력한 금액을 감소함 -
		// 송금 : 통장에 입력한 금액을 감소함 - 
		// + 어디로 보낼건지를 입력받고, 마지막에 어디로 보내는지 안내함
		
		// 변수값을 선언 및 초기화
		int account = 10000;
		int money =0;
		String bank ;
		String adress;
		
		// 기능 입력 안내
		System.out.println("입금/출금/송금");
		System.out.print("원하는 기능을 입력하세요 : ");
		// 기능값 입력
		Scanner input = new Scanner(System.in);
		bank = input.next(); // 문자열 입력
		
		// 금액입력 안내를 출력
		System.out.print("금액을 입력하세요 : ");
		money = input.nextInt(); // 정수 입력
		
		if (bank.equals("입금")) {
			account += money;
			System.out.println("현재 잔액 출력 : "+account);
		} 
		else if (bank.equals("출금")) {
			// account 금액이 money보다 크거나 같다면 실행
			if (account >= money) {
				account -= money; // account = account - money
				System.out.println("현재 잔액 출력 : "+account);
			}
			else {
				System.out.println("출금이 불가능합니다.");
			}
		}
		else if ( bank.equals("송금")) {
			if ( account >= money) {
				System.out.print("송금할 주소를 입력해주세요 : ");
				adress = input.next();
				account -= money;
				System.out.println("현재 잔액 : "+account);
				System.out.println(adress+"(으)로 송금하였습니다");
			} 
			else {
				System.out.println("송금이 불가능합니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
		
	}

}
