package chap07_Object_String;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 클래스의 메소드 확인
		String word = new String("단어");
		
		// charAt을 사용하면 문자열의 인덱스를 통해 문자를 출력할수 있다
		// 배열과 동일한 인덱스를 가지고 있다(0부터시작)
		System.out.println(word.charAt(0));
		
		// compareTo 사전적 순서로 비교
		// 앞에 있으면 -1(음수), 같으면 0, 뒤에 있으면 1(양수)
		System.out.println(word.compareTo("단억"));
		
		// concat 현재의 단어에 글자를 추가해서 출력
		// 현재의 단어를 바꾸지 않음
		System.out.println(word.concat("장"));
		System.out.println(word+"장"); // 메소드 사용과 동일
		
		// equals 문자열을 비교해서 boolean 값을 출력
		System.out.println(word.equals("단어"));
		
		word = "";  
		// isEmpty는 길이로 boolean 값을 출력,  
		// "" : 객체안의 빈값으로서 길이가 0
		// null : 아예 가르키는 객체가 없다 = 값이 없다.
		System.out.println(word.isEmpty());
		
		// length는 길이를 숫자로 출력
		System.out.println(word.length());
		
		// replace 글자를 모두 바꿔줌
		word = "단어어";
		System.out.println(word.replace("어", "아"));
		
		// substring 원하는 단어를 잘라서 가져옴
		// 처음 위치 ~ 마지막 위치
		System.out.println(word.substring(0,2));
		
		// toLowerCase(), toUpperCase()
		word = "Apple";
		System.out.println(word.toLowerCase());
		
		// 랩퍼 클래스 : 기초자료형을 참조형(객체)로 포장하는 클래스
		int num = 10; // 메소드를 쓸수 없음
		
		// 랩퍼 클래스를 사용하면 메소드를 쓸수 있음
		Integer objNum = new Integer(10);
		System.out.println(objNum.equals(0));
		System.out.println(objNum == 10);
			// Integer에서 메소드를 사용할 수 있다.
		num = Integer.parseInt("5");
		System.out.println(num+3);
		
		// parse를 사용하면 문자열을 기초자료형으로 바꿀수있다
		double objDouble = Double.parseDouble("0.5");
		System.out.println(objDouble+0.1);
		
		// 랩퍼클래스를 이용해서 문자열로 바꿔줄수있다.
		String doubleNum = Double.toString(0.5);
		System.out.println(doubleNum+0.1);
	}

}
