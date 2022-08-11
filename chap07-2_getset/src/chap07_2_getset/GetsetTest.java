package chap07_2_getset;

public class GetsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalCard card1 = new AnimalCard();
		
		card1.setAnimal("강아지");
		System.out.println(card1.getAnimal());
		System.out.println(card1.getMonth());
		System.out.println(card1.getName());
		
		AnimalCard card2 = new AnimalCard("고양이", "나비", 10);
		card2.printAnimalCard();
		card1.printAnimalCard();
		
		
	}

}
