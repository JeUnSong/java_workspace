import java.util.Scanner;

public class Assignment3_1 {
//키보드로 원의 반지름을 입력받아서 원의 면적을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double PI = 3.14;
		double radius = scanner.nextDouble();
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 " + circleArea);
		
		scanner.close();
	}

}
