package practice05;

import java.util.Scanner;

public class Test0819 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90이상은 장학금, 60이상은 합격, 60미만은 재시험
		int score = 80;
		if(score >= 90) {
			System.out.println("장학금");
		} else if (score >= 60 ) {
			System.out.println("합격");
		}else {
			System.out.println("재시험");
		}
		
		// 숫자를 입력받아서, 합과 평균구하기
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count =0;
		while (true) {
			System.out.print("0을 입력하면 모든 수의 합과 평균을 출력합니다 : ");
			int num = input.nextInt();
			sum += num;
			if (num == 0) {
				break;
			}
			count++; // num이 0일때, 그 값을 더하기 않기 위함.
		}
		System.out.println("합: "+sum+" 평균: "+sum/count);
		
		// (int)(Math.random()*100) 을 이용한 더하기문제(5번반복)
		
		for (int i =0 ; i<5; i++) {
			int x =  (int)(Math.random()*100) ;
			int y =  (int)(Math.random()*100) ;
			System.out.print(x+"+"+y+"= "); //문제 출력
			int result = input.nextInt(); // 정답 입력받아오기
			
			if(x+y == result) { // 정답비교
				System.out.println("정답입니다!");
			}else {
				System.out.println("땡!");
			}
		}
		
		String[] f = {"망고", "복숭아", "자두","포도", "사과"};
		for (String n : f) {
			System.out.println(n+"가 있습니다");
		}
		
		// 3의배수와 5의 배수가 아닌 수 출력하기.
		for(int i =1; i<=100; i++) {
			if( !(i%3==0 || i%5==0)) { // i%3!=0 && i%5!=0
				System.out.print(i+" ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		int[] num = { 40, 60, 80, 100, 70 };
		int sum1=0;
		int avrg = 0;
		for ( int a: num) {
			sum1+=a;
		}
		avrg = sum1/num.length;
		
		System.out.print("평균보다 큰 수 : ");
		for ( int a: num) {
			if(a > avrg) {
				System.out.print(a+" ");
			}
		}
	}

}
