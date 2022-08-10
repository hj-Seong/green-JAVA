package chap07_1_accessB;

public class BankAcc {
	public String bankNum;
	private int money;
	
	public BankAcc(String s) {
		this.bankNum = s;
		this.money = 0;
	}
	
	public int getMoney() {
		return this.money; 
	}
	
	public void inMoney(int a) {
		this.money +=a;
	}
	
	public void outMoney(int a) {
		if (money < a) {
			System.out.println("금액이 부족합니다");
		}else {
			this.money -=a;
		}
	}
	
}

