import java.util.Scanner;

public class Assignment5_3 {

//3. 학생 이름, 국어, 영어, 수학 점수를 입력하여 평균을 구해서 출력하는
//프로그램을 작성하시오. 계속 반복하다가 "exit"를 입력하면 종료.
	public static int sum(int k, int e, int m) {
		return k+e+m;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		
		while(true ) {
			
			System.out.print("국어 점수를 입력하세요: ");
			int korean = scanner.nextInt();
			
			System.out.print("영어 점수를 입력하세요: ");
			int english = scanner.nextInt();
			
			System.out.print("수학 점수를 입력하세요: ");
			int math = scanner.nextInt();
			
			
			int a = sum(korean, english, math);
			System.out.println("모두 입력했으면 exit를 입력하세요.");
			System.out.print(">>");
			String text = scanner.next();
			if(text.equals("exit"))
				System.out.print(name + "님의 평균 점수는 " + a/3 + "입니다.");
				break;
			
			
		
		}
		scanner.close();
		}
	
	}


