package Assignment6_2;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		Student[][] Student = new Student[3][3];
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		
		System.out.print("국어 점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		//int score = scanner.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		//int score = scanner.nextInt();
		
//		Student name = new Student("송제운");
//		Student korean = new Student("국어" + 80);
//		Student english = new Student("영어" + 50);
//		Student math = new Student("수학" + 30);

	}

}