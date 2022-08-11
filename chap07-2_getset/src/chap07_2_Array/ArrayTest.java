package chap07_2_Array;

import java.util.Scanner;

import chap07_2_getset.AnimalCard;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 직접 작성한 클래스를 배열에 넣어서 사용 가능
		// 지금 작성하는 객체는 배열의 객체
		AnimalCard[] cards = new AnimalCard[10];
		
		// 배열안의 객체는 따로 생성해야 함
		// 직접작성한 클래스를 배열로 만들어서 쓸때 new를 두번사용
		// 1. 배열 생성 2. 배열안의 각각의 클래스객체 생성
		cards[0] = new AnimalCard();
		System.out.println(cards[0].getMonth() );
		
		// 클래스객체의 배열의 경우 for문을 이용하여 클래스 객체 생성
		for (int i = 0; i<cards.length ; i++) {
			cards[i] = new AnimalCard();
		}
		cards[0].setAnimal("강아지");
		cards[0].printAnimalCard();
		
		// 콘솔에서 값 입력받아서 넣어주기
		Scanner input = new Scanner(System.in);
		System.out.print("동물의 종류와 이름과 개월을 작성하세요 : ");
		String animal = input.next();
		String name = input.next();
		int month = input.nextInt();
		
		cards[1].setAnimal(animal);
		cards[1].setName(name);
		cards[1].setMonth(month);
		cards[1].printAnimalCard();
		
		// AnimalCard클래스의 객체 배열을 만들고 그 안에 값을 넣으세요
		// 배열의 길이는 3
		// 값은 아무 값으로 넣어주시면 됩니다.(scanner X)
		// 내용확인 printAnimalCard()를 통해 확인
		
		AnimalCard[] animalCards = new AnimalCard[3];
		
		for (int i = 0; i < animalCards.length ; i++) {
			animalCards[i] = new AnimalCard();
		}
		animalCards[0].setAnimal(animal);
		animalCards[0].setMonth(month);
		animalCards[0].setName(name);
		
		animalCards[1] = new AnimalCard("강아지", "백구", 26);
		animalCards[2] = new AnimalCard("햄스터", "햄스터", 1);
		
		// 내용 출력을 위한 for-each 문
		for (AnimalCard card : animalCards) {
			card.printAnimalCard();
		}
		
		System.out.println(AnimalCard.getCardCount());
		
		
	}

}
