package practice02;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		System.out.println(numbers);
		System.out.println(numbers[0]);

		/*
		 * 1. int 점수 배열 변수에 값을 넣어서 초기화 하세요 점수 총 10개 : 88, 58, 47, 69, 50, 72, 87, 90,
		 * 84, 95
		 * 
		 * 2. String 이름 배열 변수에 값을 넣어서 초기화 하세요. 이름 총 10 : “홍길동”, “흥부”, “놀부”, “콩쥐”,
		 * “팥쥐“,”장화“, ”홍련“, ”심청”, “춘향”, “이순신”
		 * 
		 * 3. boolean 합격여부 배열 변수에 값을 넣어서 초기화 하세요. 합격여부 총 10개 : false, true, true,
		 * false,true, false, false, false, false, false
		 * 
		 */
		// 점수 배열 초기화
		int[] scores = { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };

		// 이름 배열 초기화
		String[] names = { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };

		// 합격 여부 초기화
		boolean[] pass = { false, true, true, false, true, false, false, false, false, false };

		// 처음 값 확인
		System.out.println(scores[0]);
		scores[0] = 91;
		// 값을 수정한 후 수정된 값 확인
		System.out.println(scores[0]);

		System.out.println(names[9]);
		names[9] = "몽룡";
		System.out.println(names[9]);

		System.out.println(pass[1]);
		pass[1] = false;
		System.out.println(pass[1]);

		// for-each
		// 점수 배열을 출력할 때 00점으로 출력
		// 이름 배열을 출력할 때 00님으로 출력
		for (int score : scores) {
			System.out.println(score + "점");
		}
		for (String name : names) {
			System.out.println(name + "님");
		}

		/*
		 * 1. 점수 배열의 점수값을 5씩 더하세요.
		 * 
		 * 2. 이름 배열의 전체를 출력하세요.
		 * 
		 * 3. 합격여부 배열의 주어진 값을 전부 반대로 바꿔서 넣어주세요
		 *  !를 이용하면 true값을 false로 바꿔줄수 있다.
		 *  (바꾼 값을 할당해서 넣어주어야 저장된다)
		 * 
		 */
		for (int i=0; i<scores.length ; i++) {
			scores[i] += 5;
			System.out.println(scores[i]);
		}
		
		for (int i=0; i<names.length ; i++) {
			System.out.println(names[i]);
		}
		for (int i =0 ; i < pass.length  ; i++) {
			// 연산자 규칙을 통해서
			// = 대입연산자는 오른쪽의 식부터 실행 후 
			// 그 결과를 왼쪽 pass[i]에 할당한다.
			// 오른쪽 식에서 계산할 때는 그 값(pass[i])을 가져와서 계산한다.
			pass[i] = !pass[i]; // pass[i] = !false 계산결과: true
			System.out.println(pass[i]);
		}
		
		// 점수배열의 60점 이상인 점수만 더해서 평균구하기
		int sumAll = 0;
		int avrgAll = 0;
		for ( int score : scores ) {
			sumAll+= score;
		}
		avrgAll = sumAll/scores.length;
		System.out.println("평균 : "+avrgAll);
		
		int sumPass = 0;
		int avrgPass = 0;
		int countPass = 0;
		for (int score : scores) {
			if(score >= 60) {
				sumPass += score;
				countPass++;
			}
		}
		avrgPass = sumPass/countPass;
		System.out.println("합격자 평균 : "+ avrgPass);
		
		for (String name : names) {
			if( name.equals("콩쥐") ) {
				System.out.println("콩쥐가 있습니다");
			}
		}
		
		int count =0; // true 갯수를 저장할 카운트
		for (int i = 0; i < pass.length ; i++) {
			if(pass[i]) {
				count++;
			}
		}
		System.out.println("합격자 수 : "+count);
		
	}

}


