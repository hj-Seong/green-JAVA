package practice04;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("홍길동전", "허균", 100);
		System.out.println(book1.getCheckOut());
		book1.isCheckOut();
		book1.printBook();

	}

}
