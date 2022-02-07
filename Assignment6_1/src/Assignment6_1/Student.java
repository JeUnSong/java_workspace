package Assignment6_1;
//1. 이름과 국어,영어,수학 점수를 저장할 수 있는 Student클래스를 만들어서
//객체를 생성하고 출력하기.
public class Student {
	String name;
	String subject;
	int score;
	
	public Student(String n) {
		name=n; 
	}
	
	public Student(String s, int c) {
		subject=s;
		score=c;
	}
	
}
 
