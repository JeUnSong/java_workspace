package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<Book> data = new ArrayList<Book>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("책 제목을 입력하세요. >> ");
		String name = scanner.nextLine();
		
		System.out.println("저자를 입력하세요. >> ");
		String author = scanner.nextLine();
		
		System.out.println("출판사를 입력하세요. >> ");
		String publisher = scanner.nextLine();
		
		System.out.println("가격을 입력하세요. >> ");
		String price = scanner.nextLine();
		
		System.out.println("제목 : " + name );
		System.out.println("저자 : " + author );
		System.out.println("출판사 : " + publisher );
		System.out.println("가격 : " + price );
	}

}
