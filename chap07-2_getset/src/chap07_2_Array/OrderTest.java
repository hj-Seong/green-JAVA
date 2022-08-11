package chap07_2_Array;

import java.util.Calendar;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order[] orders = new Order[10];
		orders[0] = new Order("abc123","홍길동","PD-123");
		orders[0].setOrderNumber("202208110001");
		System.out.println(orders[0].getOrderNumber());
		
		orders[1] = new Order();
		System.out.println(orders[1].getOrderNumber());
		
		// 캘린더 클래스 확인.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)+1);// 첫 시작달이 0으로 시작
		System.out.println(cal.get(cal.DATE));
		System.out.println(cal.get(cal.HOUR));
		System.out.println(cal.get(cal.MINUTE));
		
	}

}
