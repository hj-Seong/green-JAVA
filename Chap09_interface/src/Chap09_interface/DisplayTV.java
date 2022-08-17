package Chap09_interface;

public class DisplayTV implements DisplayInterface{

	@Override
	public void onDisplay() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void offDisplay() {
		System.out.println("TV를 끕니다");
	}

}
