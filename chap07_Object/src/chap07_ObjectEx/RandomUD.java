package chap07_ObjectEx;

import java.util.Scanner;

public class RandomUD {
	// 필드 - private : 직접 접근해서 값을 수정하는 것을 막기위함
	private int num; // 랜덤한 수
	private int usernum; // 유저입력 수

	// public - 객체를 통해서 사용되는 메소드
	// private - 클래스 안에서만 사용되는 메소드
	// 			내용이 길어지거나, 반복되는 내용을 메소드로 쓰기 위함
	// 메소드 > main에서 작성한 내용을 그대로 들고와서 만드는 법
	public void start() {
		System.out.println("start메소드에서 진행되는 내용입니다");
		
		// 1. 랜덤한 수 만듦
		this.num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		// 2. 수를 입력받음
		// int usernum; > 바로 필드에있는 usernum으로 접근
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("숫자값을 입력해주세요 : ");
			usernum = input.nextInt();

			// 3. 입력받은 수와 랜덤한 수를 비교
			if (usernum > num) {
				// 4. 결과 출력
				System.out.println("입력한 숫자가 더 큽니다");
			} else if (usernum < num) {
				System.out.println("입력한 숫자가 더 작습니다");
			} else {
				// usernum과 num이 같을때 while문을 빠져나옴
				break;
			}
		}

		System.out.println("값이 같습니다. 정답입니다");
	}

	// 랜덤한 숫자값을 할당
	private void getRandomNum () {
		this.num = (int) (Math.random()*100)+1;
	}
	
	// 유저 값을 들고옴
	private int checkUserGuess () {
		Scanner input = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		this.usernum = input.nextInt();
		return usernum;
	}
	// Num 값이 큰지 작은지 같은지 확인.
	private void checkNum() {
		if (usernum > num ) {
			System.out.println("입력값이 더 큽니다");
		} else if (usernum < num) {
			System.out.println("입력값이 더 작습니다");
		} else {
			System.out.println("같습니다");
		}
	}
	
	// 앞에 만든 메소드를 조립해서 실행
	public void startPlay() {
		System.out.println("메소드를 조립해서 실행");
		getRandomNum(); // 랜덤한 수를 할당
		while (true) { // 반복
			this.checkUserGuess(); // 값을 입력받아옴
			checkNum(); // 비교하여 결과 출력
			if( this.num == this.usernum) {
				break;
			}
		}
	}
	
}

