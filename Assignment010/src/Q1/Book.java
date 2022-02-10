package Q1;
//1. 책제목, 저자, 출판사, 가격을 
//키보드 입력을 통해서 ArrayList에 저장하시오.

import java.util.*;

public class Book {

	public static void main(String[] args) {
		var book = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("책 제목을 입력하세요. >> ");
			String name = scanner.nextLine();
			
			System.out.println("저자를 입력하세요. >> ");
			String author = scanner.nextLine();
			
			System.out.println("출판사를 입력하세요. >> ");
			String publisher = scanner.nextLine();
			
			System.out.println("가격을 입력하세요. >> ");
			String price = scanner.nextLine();
			System.out.print("입력이 끝났으면 exit를 입력하세요.");
			//if(price.equals("exit")) {
			//	break;
				
				
				name = name.concat(author);
				name = name.concat(publisher);
				name = name.concat(price);
				book.add(name);
				System.out.println(book);
		}		
	}	
}
	
