package Assignment6_2;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Student st = new Student();
		Scanner scanner = new Scanner(System.in);
		
		
		Student kor = new Student();
		kor.name = "국어";
		Student eng = new Student();
		eng.name = "영어";
		Student mat = new Student();
		mat.name = "국어";
		
		System.out.print("이름을 입력하세요 : ");
		st.name = scanner.next();
		
		while(true ) {
		System.out.print(kor.name + " 점수를 입력하세요: ");
		st.score = scanner.nextInt();
		
		System.out.print(eng.name + " 점수를 입력하세요: ");
		st.score = scanner.nextInt();
		
		System.out.print(mat.name + " 점수를 입력하세요: ");
		st.score = scanner.nextInt();
		
		System.out.println("모두 입력했으면 exit를 입력하세요.");
		System.out.print(">>");
		String text = scanner.next();
		
		System.out.println(st.name + "님의 평균 점수는 " + st.ave());
		if(text.equals("exit"))
		break;
		}

	}

}