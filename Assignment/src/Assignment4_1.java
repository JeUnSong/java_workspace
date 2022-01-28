import java.util.Scanner;
//입력한 값이 홀수인지 짝수인지 판별하는 프로그램 작성하기.
public class Assignment4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int number = scanner.nextInt();
		
		if (number%2 == 0) {
			System.out.println(number + "은 짝수입니다.");
		}else {
			System.out.println(number + "은 홀수입니다.");
		}
		scanner.close();

	}

}
