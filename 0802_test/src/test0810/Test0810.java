package test0810;

import javax.security.auth.Subject;

public class Test0810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50, 60, 36, 90, 100
		// 60점 이상일 때 합격
		// 번호는 작성된 점수 순서
		
		int[] score = {50, 60, 36, 90, 100};
		// System.out.println(score[0]);
		
		int sum = 0;
		int count = 0;
		for (int i = 0 ; i<score.length ; i++ ) {
			if(score[i] >= 60 ) {
				System.out.println((i+1)+"번 : 합격");
				sum += score[i];
				count++;
			}
		}
 		System.out.println("합격자 평균 : "+(sum/count));
		
 		
 		Student s1 = new Student();
 		Student s2 = new Student("흥부",1);
 		
 		s1.setScore(80);
 		s1.printResult();
 		s2.printResult();

 		
	}

}
