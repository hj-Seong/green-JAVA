package chap07_2_Array;

import java.util.Scanner;

import chap07_2_getset.AnimalCard;

public class AnimalCardArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 진료카드 만들기(콘솔)
		// 1. 선택을 통해서 내용 확인
		// 1) 진료카드의 갯수 2) 진료카드 내용확인 3) 진료카드 작성 4) 종료
		// 2. 카드의 갯수가 100일경우 만들수 없음
		AnimalCard[] cards = new AnimalCard[AnimalCard.MAX_CARD];

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("1. 진료카드 갯수 2. 진료카드 내용확인"
								+ " 3. 진료카드 작성 0. 종료 : ");
			int option = input.nextInt();
			
			if ( option == 1 ) {
				// 진료카드의 갯수는 정적변수인 cardCount 내용 확인
				System.out.println("현재 진료카드는"+
							+AnimalCard.getCardCount()+"개 입니다");
			}
			else if ( option == 2) {
				// 전체 진료카드는 작성된 진료카드!
				// 배열의 길이가 아니라 현재 작성된 진료카드의 개수로 확인
				for (int i = 0; i< AnimalCard.getCardCount() ; i++) {
					cards[i].printAnimalCard();
				}
				
				// 인덱스 값을 통해서 하나만 확인하는 내용

				
			}
			else if (option == 3) {
				// getCardCount = 100 까지 가능
				// 100이 되었을때 더이상 추가할 수 없습니다를 출력.
				// 아래 내용 실행하지않음 (진료카드 추가)
				
				
				// 새 진료카드 추가  - 입력
				System.out.print("동물의 종류와 이름 개월수를 작성하세요 : ");
				String animal = input.next();
				String name = input.next();
				int month = input.nextInt();
				
				// 인덱스값을 전체 카드의 개수로 넣어서 사용
				cards[AnimalCard.getCardCount()] 
						= new AnimalCard(animal, name, month);
				System.out.println("작성이 완료되었습니다");
			}
			else if (option == 0) {
				System.out.println("진료카드를 종료합니다");
				break;
			}
			
		}
		
		
		
		
	}

}
