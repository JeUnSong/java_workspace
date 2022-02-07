import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); // 미국 달러 환율 설정
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "입니다.");
		scanner.close();
	}

}
