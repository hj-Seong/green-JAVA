package chap08_inherit;

public class Worker extends People {
	// 필드
	private String job;
	private int careerMonth;
	
	// 메소드
	public int nextMonth() {
		this.careerMonth++;
		return this.careerMonth;
	}
	
	// 슈퍼클래스의 메소드를 사용하는 메소드
	// selfIntro를 가져와서 출력하고, 아래 job입니다고 함께 출력하는 메소드
	public void intro () {
		super.selfIntro(); // 동일한 이름의 메소드가 있으므로
		// 슈퍼클래스에서 받아옴을 명시
		System.out.println(job+" 일을 하고있습니다");
	}
	@Override
	public void selfIntro ( ) {
		// name입니다. job 일을 하고있습니다 를 출력
		System.out.println(name+"입니다. "+job+"일을 하고 있습니다");
	}
	
}
