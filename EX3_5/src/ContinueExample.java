import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n <= 0)
				continue; //����� �ƴ� ��� ���� �ݺ����� ����
			sum+=n;
		}
		System.out.println("����� ���� " + sum);
		
		scanner.close();

	}

}