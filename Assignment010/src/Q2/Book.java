package Q2;
import java.util.*;
public class Book {
	//2. 1번을 HashMap을 이용해서 저장하고 출력하시오.
	//key => 책제목, 저자, 출판사, 가격
	public static void main(String[] args) {
		HashMap<String, String> book = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("책제목을 입력하세요");
		String name = scanner.nextLine();
		book.put(name, "책제목");
		
		System.out.print("저자를 입력하세요");
		String author = scanner.nextLine();
		book.put(author, "저자");
		
		System.out.print("출판사를 입력하세요");
		String publisher = scanner.nextLine();
		book.put(publisher, "저자");
		
		System.out.print("가격을 입력하세요");
		String price = scanner.nextLine();
		book.put(price, "가격");
		
		Set<String> keys = book.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String n = it.next();
			String s =book.get(n);
			System.out.println(s + ":" + n);
		}
		

	}

}
