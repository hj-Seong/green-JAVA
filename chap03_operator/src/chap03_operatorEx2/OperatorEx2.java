package chap03_operatorEx2;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가로길이를 입력받으면 
		// 면적이 1000에 가깝게 하는 세로 길이를 계산해서 출력
		// 면적 = 사각형의 넓이 = 가로(w)*세로(h)
		
		Scanner input = new Scanner(System.in);
		System.out.print("가로의 길이를 입력하세요(1000을 넘어서는 안됨) : ");
		int w = input.nextInt();
		int h = 1000 / w;
		double doubleH = 1000.0 / w; // 하나의 값이라도 실수면 결과 : 실수
		System.out.println("세로길이: "+h);
		System.out.println("세로길이(실수): "+ doubleH);
		
		/*
		System.out.print("아무값이나 입력해주세요 : ");
		String word = input.next(); // String 값을 가져오는 메소드
		System.out.println(word+10); // 문자끼리의 +는 문자의 연결	
		*/
		
		// 이름을 입력받으면 반갑습니다라고 출력하는 코드
		System.out.print("이름을 입력해주세요 : ");
		String name = input.next();
		System.out.println("반갑습니다. "+name+"님");
		
		// 체온을 입력받아 출력하는 코드
		System.out.print("체온을 입력해주세요 : ");
		double t =  input.nextDouble();
		String classNum = "427호";
		System.out.println("현재 체온 "+t+"도 입니다. ");
		System.out.println(classNum+" 강의실입니다.");
		
		// 놀이기구를 타는 사람이  6세 이상인지
		// 키가 140 이상인지 
		// 6세 이상 (true), 키가 140이상(true) 놀이기구를 탈수있다(true)
		int age = 9;
		int height = 140;
		
		System.out.println( (age >= 6) && (height >= 140) );
		
	}

}
