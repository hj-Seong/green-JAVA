package practice01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비밀번호가 “1111” 일 때
		// 참일 때 “비밀번호가 맞습니다”를 출력하고,
		// 거짓일 때, “비밀번호가 아닙니다”를 출력하세요
		// * 문자를 비교할 때는 .equals(비교할 문자)를 사용하면 된다

		Scanner input = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 : ");
		String password = input.next();
		if (password.equals("1111")) {
			System.out.println("비밀번호가 맞습니다");
		} else {
			System.out.println("비밀번호가 아닙니다");
		}

		// 각 달의 숫자를 입력받았을 때, 달의 일수를 출력하는 프로그램을 작성하세요.
		// 1,3,5,7,8,10,12 : 31일 / 4,6,9,11 : 30일 / 2: 28, 29일
		System.out.print("일수를 알고 싶은 달을 입력하세요 : ");
		int month = input.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다");
			break;
		case 2:
			System.out.println("28일 또는 29일입니다");
			break;
		default:
			System.out.println("입력하신 달은 없습니다");
			break;
		}

		// if -else if -else로 작성했을경우
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31일입니다.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30일입니다");
		} else if (month == 2) {
			System.out.println("28, 29일입니다");
		}

		// “그만”을 입력할 때 까지 입력받은 문자열을 그대로 출력하는 프로그램
		System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
		String word = input.next();
		while (!word.equals("그만")) {
			System.out.println(word);
			System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			word = input.next();
		}

		// 구구단 15단을 출력하세요
		int dan = 15;
		for (int i = 2; i < 10; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}

		// card 안에 현재의 잔액이 들어있다
		// 지하철을 탈 때 1호선 요금은 1300원이다.

		int card = 3000;
		int pay = 1300;

		System.out.print("지하철에 탑승하시겠습니까? 네:1, 아니오 :0 > ");
		int getSubway = input.nextInt();
		while (getSubway == 1) {
			if (card >= pay) {
				card -= pay;
				System.out.println("탑습하였습니다. 현재 남은 잔액은 " + card + "원입니다");
			} else {
				System.out.println("잔액이 부족합니다");
			}
			System.out.print("지하철에 탑승하시겠습니까? 네:1, 아니오 :0 > ");
			getSubway = input.nextInt();
		}

	}

}
