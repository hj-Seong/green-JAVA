package practice03;

public class Book {
	// 필드
	String title;
	int page;
	
	// 생성자
	Book() {
		this.title = "제목미정";
		this.page = 0;
	}
	
	Book(String title, int page) {
		this.title = title;
		this.page = page;
	}
	
	// 메소드
	// 책 제목을 받아서 와서 값을 넣어주는 메소드 
	void setTitle(String title) {
		this.title = title;
	}
	
	// 책 제목을 return 해주는 메소드
	String getTitle() {
		return this.title;
	}
	
	// 책 페이지가 0이면 false를 출력하는 메소드, 0이 아니면 true
	boolean checkPageCount() {
		boolean check;
		if (this.page == 0) {
			check = false;
		}else {
			check = true;
		}
		return check;
	}
	
	
}
