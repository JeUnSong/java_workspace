
public class BookApp {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 생성자 Book(String t, String a) 호출
		Book loveStory = new Book("춘향전"); // 생성자 Book(String t) 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

	}

}
