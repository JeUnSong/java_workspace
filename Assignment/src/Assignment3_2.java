import java.util.Scanner;

public class Assignment3_2 {
//이름, 학번, 학과를 키보드 입력을 받아서 출력하기.
	public static void main(String[] args) {
		System.out.print("이름, 학번, 학과를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		int studentid = scanner.nextInt();
		System.out.print("학번은 " + studentid + ", ");
		
		String department = scanner.next();
		System.out.print("학과는 " + department + " 입니다.");
		
		scanner.close();

	}

}
