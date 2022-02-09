package assignment6_2;
//2. Student클래스를 사용해서 연습문제5-3번 구현해보기
//학생 이름, 국어, 영어, 수학 점수를 입력하여 평균을 구해서 출력하는  
//프로그램을 작성하시오. 계속 반복하다가 "exit"를 입력하면 종료.

public class Student {
	String name,subject;
	double score;
	
	public Student( ) {}

	public double ave() {
		return (score+score+score)/3;
	}
}