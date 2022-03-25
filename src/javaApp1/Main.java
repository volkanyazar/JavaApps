package javaApp1;

public class Main {

	public static void main(String[] args) {
		//Makale listeleme
		Article article1 = new Article(1,"Bilimsel MAKALE",15,"Fen Bilimleri");
			
		Article[] articles = {article1};
		
		
		for (Article article : articles) {
			System.out.println(article.name);
			
		}
		System.out.println("***************************************************");
		//Kitap listeleme
		Book book1 = new Book(1,"ZF000001220","VADÝDEKÝ ZAMBAK",225,"BALZAC");
		
		Book[] books = {book1};
		
		for (Book book : books) {
			System.out.println(book.name);
		}
		BookService bookService = new BookService();
		bookService.addBook(book1); //kitap ekleme metodu
		bookService.deleteBook(book1); // kitap silme metodu
	}

}
