package practice04;

public class Game {
	// 필드
	private String gameTitle;
	
	// 생성자
	// 디폴트 생성자
	public Game () {
		gameTitle = "미정";
	}
	// 매개변수가 있는 생성자
	public Game (String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	// 메소드
	// 게임타이틀을 들고온다 return
	public String getGameTitle () {
		return gameTitle;
	}
	
	// gameTitle 게임을 시작합니다 출력
	public void play() {
		System.out.println(getGameTitle()+"게임을 시작합니다");
	}
	// gameTitle 게임을 멈춥니다 출력
	public void stop() {
		System.out.println(getGameTitle()+"게임을 멈춥니다");
	}
	// gameTitle 게임을 종료합니다 출력
	public void end() {
		System.out.println(getGameTitle()+"게임을 종료합니다");
	}
	

}
