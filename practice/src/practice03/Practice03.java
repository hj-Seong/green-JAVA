package practice03;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String names 선언하세요
		// "흥부", "놀부"로 초기화 하세요
		String[] names = {"흥부", "놀부"};
		
		System.out.println(names[0]);
		
		Book myBook = new Book();
		Book myBook1 = new Book("흥부전", 100);
		System.out.println(myBook.getTitle());
		System.out.println(myBook1.getTitle());
		myBook.setTitle("심청전");
		System.out.println(myBook.getTitle());
		
		System.out.println(myBook.checkPageCount());
		System.out.println(myBook1.checkPageCount());
		
		if( myBook1.checkPageCount() ) {
			System.out.println("페이지가 들어가있습니다");
		}else {
			System.out.println("페이지가 입력되어있지않습니다");
		}
		
	}

}
