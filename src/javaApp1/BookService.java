package javaApp1;

public class BookService {

	public void addBook(Book book) {
		System.out.println("Yeni kitap eklendi "+book.name);
		
	}
	
	public void deleteBook(Book book) {
		System.out.println("Mevcut kitap silindi: "+book.name);
	}
}
