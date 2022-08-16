package practice04;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = new Game("가위바위보");
		game1.play();
		game1.end();
		game1.stop();
		
		BoardGame boardGame = new BoardGame("원카드",3);
		boardGame.play(); // 메소드 오버라이딩으로 바뀐 내용 출력
		boardGame.end(); // 부모클래스의 내용 출력
		
		
	}

}
