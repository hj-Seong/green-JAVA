package chap10_exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외 처리
		// 프로그램은 예외가 발생했을때 그 코드에서 멈춘다.
		// 코드가 멈추는 것을 막기위해 사용하는 것이 예외처리
		// try/catch 구문을 사용하여 예외를 처리한다.
		
		int x = 6;
		int y = 2;
		// try구문안에 있는 변수는 값이 할당되지 않을수도 있기 때문에 
		// 미리 초기화
		int result = 0; 
		
		try {
			// 오류/예외가 일어날 가능성이 있는 코드
			result = x/y;
		} catch(Exception e) { 
			// Exception 클래스의 매개변수를 통해서 오류받아옴
			System.out.println("오류 발생");
			System.out.println(e);
		}
		// try/catch를 통해 예외를 처리하면 이후 코드도 실행할 수 있다.
		System.out.println("결과 : "+result);

		// if 문으로 예외처리하기
		if(y == 0) {
			System.out.println("오류 발생");
		} else {
			result = x/y;
		}
		
		// 배열의 인덱스 오류 처리
		int[] arrayNum = {1,2,3,4};
		int index = 10;
		
		try {
			System.out.println(arrayNum[index]);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다");
			System.out.println(e); //어떤 오류인지 확인
		} 
		catch(Exception e) {
			System.out.println("오류 발생");
			System.out.println(e); //어떤 오류인지 확인
		}
		
		try ( Scanner input = new Scanner(System.in) ) {
			System.out.print("숫자를 입력해주세요");
			int num = input.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("잘못입력하였습니다");
			System.out.println(e);
		}
		
		// 직접만든 클래스의 예외처리 전달.
		MethodThrow div = new MethodThrow(4,0);
		try {
			// 객체의 메소드에 throw를 통해서 요청하게 되면 
			// 메소드를 사용할때 강제로 try/catch를 사용해야한다.
			System.out.println(div.division());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("오류났습니다");
		}
		
		try {
			System.out.println(div.numArray(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("오류가 났습니다");
		}
		
		try {
			div.myMethode();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			// 오버라이딩한 toString 확인
			System.out.println(e);
			e.printStackTrace();
		}
		
		// Main에서 throw로 사용자 예외 객체 확인하기.
		try {
			if(true) {
				throw new MyException();
			} 
		} catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}

		// 예외객체를 생성하는 클래스인 GreenException
		// Exception 상속하고
		// toString을 오버라이딩해서 "그린에서 만든 예외입니다"를 return 
		
		// 아래에서 try.catch throw를 사용해서 확인하세요.
		try {
			if(true) {
				throw new GreenException();
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
