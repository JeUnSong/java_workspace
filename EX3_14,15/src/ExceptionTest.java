import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 두개를 입력해주세요");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		try {
		System.out.println(a/b);
		
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i+1]=1;
		}
	}catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수  없습니다.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 범위를 벗어날 수 없습니다.");
		//DB에 기록
	}
		
		System.out.println("이 부분이 실행될까요 ?");
		scanner.close();
	}

}
