package chap07_2_Array;

import java.util.Calendar;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order[] orders = new Order[10];
		orders[0] = new Order("abc123","홍길동","PD-123");
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
		
		// orders[2]~orders[9]까지 new Order();를 이용하여 객체를 생성하고
		// orders[0]~orders[9]까지 getOrderNumber를 출력하세요
		for (int i = 2; i< orders.length ; i++) {
			orders[i] = new Order();
		}
		for (Order order : orders) {
			System.out.println(order.getOrderNumber());
		}
		
	}

}
