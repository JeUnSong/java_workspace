package Q3;

import java.util.ArrayList;

class Book {
	private String name, author,publisher,price;
	public Book(String name,String author,String publisher,String price) {
		this.name = name; this.author = author;
		this.publisher = publisher; this.price = price;
	}
	public String getName() {return name;}
	public String getAuthor() {return author;}
	public String getPublisher() {return publisher;}
	public String getPrice() {return price;}
}
