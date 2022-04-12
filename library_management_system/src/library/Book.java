package library;

public class Book {
     private int bookId;
     private String bookName;
     private String genre;
     private int quantity;
     private int price;
     Book()
     {
    	 
     }
     Book(int bookId,String bookName,String genre,int quantity,int price)
     {
    	 
    	 this.bookId=bookId;
    	 this.bookName=bookName;
    	 this.genre=genre;
    	 this.quantity=quantity;
    	 this.price=price;
    	 
     }
     public String getBookDetails()
     {
   	  return bookId+" "+bookName+" "+genre+" "+quantity+" "+price;
     }
     
     public int getBookId() {
    	 return bookId;
     }
     public String getBookName() {
    	 return bookName;
     }
     public String getGenre() {
    	 return genre;
     }
     public int getBookQuantity(){
    	 return quantity;
     }
     public int getPrice() {
    	 return price;
     }
     public void setBookQuantity(int quantity)
     {
    	 this.quantity=quantity;
     }
     
}
