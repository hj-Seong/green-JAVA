package chap08_inheritAnimal;

public class AnimalCardNew extends AnimalCard{
	// 필드
	private String personName;
	
	// 생성자
	// 디폴트 생성자
	public AnimalCardNew() {
		personName ="";
	}
	
	// 매개변수를 갖는 생성자
	public AnimalCardNew(String animal, String name,
							int month, String personName) {
		super(animal, name, month);
		this.personName = personName;
	}
	
	// 메소드 오버라이딩
	@Override
	public void printAnimalCard() {
		System.out.println("보호자 : "+personName);
		super.printAnimalCard();
	}
	
	
	
	
	
}
