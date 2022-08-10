package chap07_1_access;

// 서로 다른 패키지에 있으면 import로 들고와서 사용 가능
import chap07_1_accessB.AccessB;
import chap07_1_accessB.BankAcc;

import java.util.Scanner;

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 패키지 안에 들어있음
		AccessA a = new AccessA();
		a.printName();
		
		// 다른 패키지 안에 들어있는 클래스 접근
		AccessB b = new AccessB();
		b.printName();
		
		// BankAcc 클래스 확인
		BankAcc bank1 = new BankAcc("1111");
		bank1.inMoney(1000);
		bank1.outMoney(3000);
		System.out.println(bank1.getMoney());
	}

}
