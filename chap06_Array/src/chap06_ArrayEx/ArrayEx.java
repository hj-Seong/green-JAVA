package chap06_ArrayEx;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner을 통해서 체온값 입력
		double[] temperatures = new double[5]; // [] 갯수지정가능
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("체온을 입력하세요 : ");
			temperatures[i] = input.nextDouble();
		}
		// for-each 사용
		for (double temperature : temperatures) {
			if (temperature >= 37) {
				System.out.print("(위험)");
			}
			System.out.println(temperature);
		}
		
		// 실습, String 배열, 요소값 비교
		String[] fruits = {"바나나","딸기", "포도","사과","키위"};
		System.out.print("과일이름을 입력해주세요 : ");
		String fruitInput = input.next();
		for (int i = 0; i <fruits.length ; i++) {
			// 입력받은 값과 for문으로 배열을 하나씩 비교
			if( fruitInput.equals(fruits[i]) ) {
				System.out.println(fruitInput+"이 있습니다.");
				break;
			}
		}
		
		// 있는지 없는지를 확인하는 for문
		boolean isFruit = false; 
		for (int i = 0; i <fruits.length ; i++) {
			// 입력받은 값과 for문으로 배열을 하나씩 비교
			if( fruitInput.equals(fruits[i]) ) {
				isFruit = true; // 값이 있으면 true로 바꿈
				break; // 입력받은 값이 한개이기 때문에 찾고 반복문을 나옴
			}
		}
		if (isFruit) {
			System.out.println(fruitInput+"이 있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		
		// 학생의 수를 입력받고, 점수배열을 만든후 성적 입력하기.
		System.out.print("학생의 수를 입력하세요 : ");
		int student = input.nextInt();
		int[] studentScores = new int[student]; // 배열크기입력
		int count = 0;
		for ( int i =0 ; i<student ; i++ ) {
			count++;
			System.out.print((i+1)+"번째 점수를 입력하세요 : ");
			// 배열 요소에 인덱스를 통하여 직접 접근하여 값 할당
			studentScores[i] = input.nextInt(); 
		}
		System.out.println(count);
		for ( int score : studentScores) { 
			if (score >=60) {
				System.out.println(score);
			}
		}
		
	}
}
