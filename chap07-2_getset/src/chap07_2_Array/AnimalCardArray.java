package chap07_2_Array;

import chap07_2_getset.AnimalCard;

public class AnimalCardArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AnimalCard.getCardCount());
		AnimalCard[] cards = new AnimalCard[AnimalCard.MAX_CARD];

		cards[AnimalCard.getCardCount()] = new AnimalCard();
		cards[AnimalCard.getCardCount()] = new AnimalCard();
		
		
		
	}

}
