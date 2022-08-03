package chap06_array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 확인 
		int[] numbers; // 배열의 참조변수 선언
		numbers = new int[6]; //배열의 생성
		int[] numbers2 = new int[6]; // 배열 생성
		int[] numbers3 = numbers2; // 배열의 주소 전달
		
		// {} 중괄호를 통해서 값을 바로 입력가능(초기화)
		int[] scores = {10, 20, 40, 70};
		int index = 0;
		
		// [] 대괄호를 이용하여 배열의 값 접근
		// [] : 인덱스 (0~) : 정수값(변수, 식)
		numbers[0] = 1; 
		System.out.println(scores[index+1]);
		System.out.println(scores);
		System.out.println(numbers);
		// 동일한 주소값을 가짐
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		numbers2[0]=5;
		// 동일한 주소값을 가지기 때문에 하나만 값을 수정해도 바뀜
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);
		
		// for문을 이용한 배열 요소 출력
		// 배열의 길이를 직접입력해줄수있지만 length를 사용해서 쓸수있다
		for (int i=0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// for-each 루프
		// 배열안에 있는 요소를 score에 담아서 사용할 수 있다 
		// 배열안에있는 값을 가져오는 것이기 때문에 배열의 값을 수정할수 없다
		for (int score : scores) {
			System.out.println(score);
		}
		
		// 실습, double배열 초기화
		double[] heights = {165.3, 170.2, 158.0, 182.0, 179.3};
		double sum = 0;
		for (double height : heights) {
			System.out.println(height);
			sum += height;
		}
		System.out.println("학생 키의 평균 : "+sum/heights.length);
		

	}

}
