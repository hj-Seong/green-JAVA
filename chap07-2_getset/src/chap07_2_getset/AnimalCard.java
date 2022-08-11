package chap07_2_getset;

public class AnimalCard {
	// 필드
	private String animal;
	private String name;
	private int month;
	
	// 정적 변수 cardCount; - private
	private static int cardCount=0;

	// 정적 변수로 만든 상수 MAX_CARD = 10; - public 
	public static final int MAX_CARD = 10;
	
	// 정적 메소드 getCardCount - public
	public static int getCardCount () {
		return cardCount;
	}
	
	public AnimalCard() {
		this.animal = "";
		this.name = "";
		this.month= 0;
		
		cardCount++;
	}
	
	public AnimalCard(String animal, String name, int month ) {
		this.animal = animal;
		this.name = name;
		this.month = month;
		
		cardCount++;
	}
	
	// 설정자와 접근자
	public String getAnimal() {
		return this.animal;
	}
	public String getName() {
		return this.name;
	}
	public int getMonth() {
		return month;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	// 실습. 동물종류와 이름과 개월수를 출력하는 메소드
	// ! get 메소드를 이용해서 이름값을 가져오자
	// 출력내용 : 동물종류 : animal , 이름 : name , month개월
	public void printAnimalCard() {
		String animal = getAnimal();
		String name = getName();
		int month = getMonth();
		System.out.println("동물종류 : " + getAnimal()
						+ " , 이름 : " + name+" , "
						+ month + "개월");
	}
	
	
}
