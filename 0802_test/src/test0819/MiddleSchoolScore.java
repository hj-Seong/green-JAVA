package test0819;

public class MiddleSchoolScore extends Scores{
	private String name;
	
	public MiddleSchoolScore() {
		name ="";
	}
	public MiddleSchoolScore(String name, int korean, int math, int english) {
		super(korean, math, english);
		this.name = name;
	}
	
	// name의 평균 점수: 점수 를 출력하는 메소드
	public void printArvg() {
		System.out.println(name+"의 평균 점수 : "+arvg());
	}
	
}
