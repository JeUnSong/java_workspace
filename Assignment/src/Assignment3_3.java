import java.util.Scanner;

public class Assignment3_3 {
	
	public static double sum(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
//국어,영어,수학 세과목을 키보드 입력을 받아서 평균 구하기.
		System.out.println("아래 각 과목의 점수를 넣어 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어");
		double korean = scanner.nextDouble();
		
		System.out.print("영어");
		double english = scanner.nextDouble();
		
		System.out.print("수학");
		double mathematics = scanner.nextDouble();
		
		double average = sum(korean, english, mathematics)/3;
		
		System.out.print("점수 평균은 " +  average + " 입니다.");
		
		scanner.close();
	}

}
