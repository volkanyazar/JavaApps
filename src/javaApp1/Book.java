package javaApp1;

public class Book {

	   int id;
	   String name;
	   String bookCode;
	   int totalPage;
	   String ownerName;
	   
	   public Book() {
		  
	   }
	    
	   public Book(int id,String bookCode,String name, int totalPage, String ownerName){
	   this.id = id;
	   this.bookCode = bookCode;
	   this.name = name;
	   this.totalPage = totalPage;
	   this.ownerName = ownerName;
	
	   }
}
