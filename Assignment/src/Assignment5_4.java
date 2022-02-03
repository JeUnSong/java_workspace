import java.util.Scanner;

public class Assignment5_4 {
//4. 3번을 배열을 만들어서 작성해보세요.
	public static void main(String[] args) {
		int[] scoer = new int[3];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("이름을 입력하세요. : ");
		String name = scanner.next();
		
		System.out.print("국어,영어,수학의 점수를 입력하세요: ");
		for(int i=0; i<scoer.length; i++)
			scoer[i] = scanner.nextInt();
		
		for(int i=0; i<scoer.length; i++)
			sum += scoer[i];
		System.out.println("모두 입력했으면 exit를 입력하세요.");
		System.out.print(">>");
		String text = scanner.next();
		if(text.equals("exit"))
			break;
		System.out.print(name + "님의 과목 평균은 " + (double)sum/scoer.length);
		
		
		}
		
		
	}
	
}
