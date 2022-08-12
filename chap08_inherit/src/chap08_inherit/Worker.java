package chap08_inherit;

public class Worker extends People {
	// 필드
	private String job;
	private int careerMonth;
	
	// 실습
	// 디폴트 생성자(매개변수X) 묵시적 호출
	public Worker() {
		this.job = "";
		this.careerMonth = 0;
	}
	
	// 모든 필드값을 받아오는 생성자 명시적 호출
	public Worker(String name, String gender, int age,
						String job,int careerMonth) {
		super(name, gender, age);
		this.job = job;
		this.careerMonth = careerMonth;
	}
	
	
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
	
	// 아래 메소드는 이름이 같은 중복정의에 해당
	// equals 메소드를 만들어서 이름, 성별, 나이, 직업, 일한 개월이 같을때
	// true 를 return 하세요. (그외에는 전부 false return)
	public boolean equals(Worker worker) {
		if (name == worker.name  && gender == worker.gender
				&& age == worker.age && job == worker.job
				&& careerMonth == worker.careerMonth) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
