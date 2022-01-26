import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		char grabe;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); //점수 읽기
		if(score >=90)                 //90 이상
			grabe = 'A';
		else if(score >=80)            //80이상 90미만
			grabe = 'B';
		else if(score >=70)            //70이상 80미만
			grabe = 'C';
		else if(score >=60)            //60이상 70미만
			grabe = 'D';
		else                           //60 미만
			grabe = 'F';
		System.out.println("학점은 "+ grabe + "입니다.");
		
		scanner.close();

	}

}
