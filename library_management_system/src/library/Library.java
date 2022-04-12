package library;
import java.util.*;
public class Library {
   
  
   HashMap<String,User> users = new HashMap<>();
   HashMap<Integer,Book> books = new HashMap<>();
   HashMap<String,IssuedBooks> ib = new HashMap<>();
   HashMap<String,String> userLoginDetails = new HashMap<>();
   
  
   Book book = new Book(); 
   Scanner sc = new Scanner(System.in);
   Library()
   {
	   users.put("hari@gmail.com",new User("hari@gmail.com","hari","hari@32","user",0));
	   userLoginDetails.put("hari@gmail.com","hari@32");
	   users.put("gowtham@gmail.com",new User("gowtham@gmail.com","gowtham","gowtham@32","user",10));
	   userLoginDetails.put("gowtham@gmail.com","gowtham@32");
	   users.put("biddu@gmail.com",new User("biddu@gmail.com","bidda","bidda@32","admin",0));
	   userLoginDetails.put("biddu@gmail.com","bidda@32");
	   books.put(1,new Book(1,"FSD","Web Development",2,500));
	   books.put(2,new Book(2,"DS","CSE",3,870));
	   books.put(3,new Book(3,"ML","Machine Learning",1,1170));
	   ib.put("hari@gmail.com", new IssuedBooks("hari@gmail.com",1,"12-04-2022","20-04-2022"));
	   ib.put("gowtham@gmail.com", new IssuedBooks("gowtham@gmail.com",3,"01-04-2022","10-04-2022"));
   }
  // int bookId,String bookName,String genre,int quantity,int price
   //String userid,int bookid,String issuedDate,String returnDate
   //String userid,int bookid,String issuedDate,String returnDate
   
   /*USER MENU FUNCTIONS*/
   
   public void viewBooks(){
	   
	   System.out.println("Book_ID  Book_Name  Book_Genre  Book_Quantity Book_Price");
		books.forEach((k,v)->System.out.println(v.getBookDetails()));
	   
   }
   public void borrowBook(String userid)
   {
	   User user =null;
	   int f=0,g=0;
	   for (Map.Entry<String,User> entry : users.entrySet())
	   {
		   if(userid.equals(entry.getKey()))
		   {
			     user=entry.getValue();
			     System.out.println(user.getCredit());
		   }
	   }
	   System.out.println("Enter the Book ID Listed Above to Borrow");
	   int bookid= sc.nextInt();
	   Book b;
	   for (Map.Entry<Integer,Book> entry : books.entrySet())
	   {
		   if(bookid==entry.getKey() && entry.getValue().getBookQuantity()>0)
		   {
			 if(user.getCredit()>=500)
			 {
				 ib.put(user.getUserId(),new IssuedBooks(user.getUserId(),bookid,"12-04-2022","20-04-2025"));
				 entry.getValue().setBookQuantity(entry.getValue().getBookQuantity()-1);
				 System.out.println("Issued Successfully");
				 f=1;
				 break;
			 }else
			 {
				 g=1;
				 System.out.println("Not Have Enough Credit");
			 }
		   }
	   }
	   if(f==0 && g==0)
		   System.out.println("Book Not Found");
   }
   
   public void issuedBookById(String userid){
	   
	   
	    for (Map.Entry<String,IssuedBooks> entry : ib.entrySet())
		   {
			   if(userid.equals(entry.getKey()))
			   {
				   IssuedBooks b =entry.getValue(); 
				   System.out.println("User_ID  Book_ID  Issued_Date  Return_Date");
				   System.out.println(b.getIssuedBooks());

			   }
		   }
		
   }
   public void returnBook(String userid) {
	   
	   ib.remove(userid);
	   System.out.println("Returned Successfully");
	   
   }
   public void fineAmount(String userid) {
	   
	   System.out.print("Total Fine Amount to be Paid :");
	   for (Map.Entry<String,User> entry : users.entrySet())
	   {
		   if(userid.equals(entry.getKey()))
		   {
			   System.out.println(entry.getValue().getFine());
		   }
	   }
   }
   
   /*ADMIN MENU FUNCTIONS*/
   
   public void searchBooks()
   {
	   System.out.println("ENTER THE BOOK ID TO SEARCH :");
	   int bookid = sc.nextInt();
	   for (Map.Entry<Integer,Book> entry : books.entrySet())
	   {
		   if(bookid==entry.getKey())
		   {
			   Book b =entry.getValue();
			   System.out.println(b.getBookDetails());
//			   System.out.println(b.getBookId()+" "+b.getBookName()+" "+b.getGenre()+" "+b.getBookQuantity()+" "+b.getPrice());
		   }
	   }
   }
   
   public void addBook() {
	   
	   System.out.println("Enter the Book Details to Store in the Library");
	   System.out.println("Enter BookId :");
	   int bookid= sc.nextInt();
	   System.out.println("Enter BookName :");
	   String bookName= sc.next();
	   System.out.println("Enter BookGenre :");
	   String genre= sc.next();
	   System.out.println("Enter Book Quantity :");
	   int qty = sc.nextInt();
	   System.out.println("Enter Book Price :");
	   int price= sc.nextInt();
	   
	   books.put(bookid,new Book(bookid,bookName,genre,qty,price));
	   System.out.println("Added Successfully");   
   }
   
   public void updateBook() {
	   
	   System.out.println("Enter the BookId AND  Quantity to Update");
	   System.out.println("Enter BookId :");
	   int bookid = sc.nextInt();
	   System.out.println("Enter Quantity :");
	   int qty = sc.nextInt();
	   Book b = new Book();
	   for (Map.Entry<Integer,Book> entry : books.entrySet())
	   {
		   if(bookid==entry.getKey())
		   {
			   entry.getValue().setBookQuantity(qty);
               break;
		   }
	   }
	   System.out.println("Updated Successfully");
   }
   
   public void deleteBook() {
	   
	   System.out.println("Enter the BookId to delete from Library");
	   System.out.println("Enter BookId :");
	   int bookid = sc.nextInt();
	   books.remove(bookid);
	   System.out.println("SUCCUESSFULLY DELETED");
   }
  
   public void addUser()
	{
		System.out.println("Enter the user details to register");
		System.out.println("Enter UserId :");
		String userId = sc.next();
		System.out.println("Enter Username :");
		String name = sc.next();
		System.out.println("Enter Password :");
		String password = sc.nextLine();
		System.out.println("Enter Role:");
		String role = sc.next();
		System.out.println("Enter the Fine Amount :");
		int fine = sc.nextInt();
		
		
		users.put(userId,new User(name,userId,password,role,fine));
		userLoginDetails.put(userId, password);
		System.out.println("User Added Successfully");
	}
   
   public boolean validate(String userid,String password)
	{
		if(userLoginDetails.containsKey(userid))
		{
			if(password.equals(userLoginDetails.get(userid))) return true;
		}
		return false;
	}
   
  
   public void bookFine() {
	   
   }
   public void memberFine()
   {
	   
   }
}
