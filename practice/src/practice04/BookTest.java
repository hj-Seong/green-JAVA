package practice04;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열객체 만들기
		Book[] booklist = new Book[100];
		
		// 기능 추가 및 반복하기.
		Scanner input = new Scanner(System.in);
		int option = 1;
		while( option !=0 ) {
			System.out.print("1. 전체 책 개수 확인 "+
							 "2. 전채 책 정보 출력 "+
							 "3. 책 대여/반납 " +
							 "4. 책 추가" + "0. 종료 : ");
			option = input.nextInt();
			switch (option) {
			case 1:
				System.out.println("현재 책의 개수는 "
									+Book.getBookCount()+"권입니다");
				break;
			case 2:
				for(int i=0; i<Book.getBookCount(); i++) {
					booklist[i].printBook();
				}
				break;
			case 3:
				System.out.print("책 대여/반납할 인덱스를 적어주세요 : ");
				int index = input.nextInt();
				if (index>=0 && index < Book.getBookCount()) {
					booklist[index].isCheckOut();
				}else {
					System.out.println("존재하지 않는 인덱스입니다");
				}
				break;
			case 4:
				System.out.print("책 제목과 저자, 쪽수를 작성하세요 :");
				String title = input.next();
				String author = input.next();
				int page = input.nextInt();
				// 배열의 인덱스에 객체 생성
				booklist[Book.getBookCount()] 
						= new Book(title,author,page);
				System.out.println("책을 추가하였습니다");
				break;
			case 0:
				System.out.println("도서정리 프로그램을 종료합니다");
				break;
			}
		}

	}

}
