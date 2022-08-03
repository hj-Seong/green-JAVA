package chap03_operatorEx;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아메리카노 = 2000, 카페라떼 = 3000, 카푸치노=3500
		// 아메리카노 3개, 카페라떼 3개, 카푸치노 3개
		
		int americano = 2000;
		int cafeLatte = 3000;
		int cappuccino = 3500;
		
		int sum = 0;
		sum = americano*10 + cafeLatte*3 + cappuccino*3;
		System.out.println(sum);
		
		// 5642초 > 몇분 몇초인지 확인.
		int m = 5642 / 60; // 94분 : 60분이 넘었음
		int s = 5642 % 60;
		int h = m / 60;
		// 60분이 넘었기 때문에 나머지 연산자를 사용해서 
		// 0~59분의 값을 얻기 위함.
		m %= 60; 
		
		System.out.println(h+"시간"+m+"분"+s+"초");
		
		// Scanner 를 통해서 입력받은 초를 분과 초로 출력하기.
		int inputNum=0; // 사용자로부터 입력받은 값을 저장할 곳
		Scanner input = new Scanner(System.in);
		System.out.print("초값을 입력해주세요 : ");
		inputNum = input.nextInt();
		System.out.println((inputNum/60)+"분"+(inputNum%60)+"초");
		
		// 값을 2개 입력받은 후 몫과 나머지 출력
		Scanner input1 = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = input1.nextInt();
		System.out.print("두번째 수를 입력하세요(0 제외) : ");
		int num2 = input1.nextInt();
		
		int div = num1 / num2;
		int rest = num1 % num2;
		System.out.println("몫 : "+ div + ", 나머지 : " + rest);
	}

}
