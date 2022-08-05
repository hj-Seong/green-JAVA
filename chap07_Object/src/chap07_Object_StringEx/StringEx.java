package chap07_Object_StringEx;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 작성하고, for문을 통해서 출력하기.
		String date = "2022-08-05";
		// 문자열 메소드는 문자열 값을 직접 바꾸지 않는다.
		for (int i=0 ; i<date.length(); i++) {
			if(date.charAt(i) == '-') {
				// 메소드는 필드값이 아니기에 
				// 대입연산자를 이용해서 값을 수정할 수 없다
				// date.charAt(i) = "."; - 오류
				System.out.print(".");
				continue;
			}
			System.out.print(date.charAt(i));
		}
		// while문을 통해 입력받은 문자열 allWord에 저장하기
		Scanner input = new Scanner(System.in);
		String allWord = "";
		String inputWord ="";
		
		while( !(inputWord.equals("종료")) ) {
			System.out.print("단어를 입력하세요 (반복을 멈추려면 종료) :");
			inputWord = input.next();
			// allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(inputWord);
		}
		System.out.println("결과 확인 :" + allWord);
		
		// 실습. 이름을 입력받고 *로 대치하는 프로그램
		String s = "김흥부";
		System.out.print("이름을 입력하세요 : ");
		s = input.next();
		char middle = s.charAt(1);
		System.out.println(middle);
		// 단 replace는 동일한 글자를 전부 * 으로 바꾼다
		System.out.println(s.replace(middle, '*'));
		
	}

}
