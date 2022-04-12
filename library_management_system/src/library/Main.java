package library;
import java.util.Scanner;
import java.util.*;
public class Main {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int option;
	   char ch ='y';
	   Library library = new Library();
	   while(true)
		   {
		   System.out.println("Enter 1.Login \t 2.NewRegister");
		   
	   if(sc.nextInt()==1) 
	   {
		   
			   System.out.println("Enter Email and Password to Login");
			   System.out.println("Enter Email");
			   String userid = sc.next();
			   System.out.println("Enter Password");
			   String password = sc.next();
			   System.out.println("Enter Role");
			   String role = sc.next();
			   if(library.validate(userid,password))
			   {
				   if(role.equals("user"))
				   {
					   char op='e';
					   System.out.println("Welcome User :"+userid);
					 do{ 
					  System.out.println("1)View Books \n2)BorrowBook \n3)Issued Book \n4)Return Book \n5)Fine Amount");
					  switch(sc.nextInt())
					  {
					  case 1:
						  library.viewBooks();
						  break;
					  case 2:
						  library.viewBooks();
						  library.borrowBook(userid);
						  break;
					  case 3:
						  library.issuedBookById(userid);
						  break;
					  case 4:
						  library.returnBook(userid);
						  break;
					  case 5:
						  library.fineAmount(userid);
						  break;
					  }
					 System.out.println("Are you like to continue Enter e");
					 op = sc.next().charAt(0);
					 }while(op =='e');
				   }
				   else
				   {
					   char op='e';
					   System.out.println("Welcome Admin :"+userid);
					   do {
					   System.out.println("Enter the Option to Perform");
					   System.out.println("1)ViewBook \n2)SearchBook \n3)AddBook \n4)UpdateBook \n5)DeleteBook \n6)AddUser");
					   switch(sc.nextInt())
					   {
					   case 1:
						   library.viewBooks();
						   break;
					   case	2:
						   library.searchBooks();
						   break;
					   case 3:
						   library.addBook();
						   break;
					   case 4:
						   library.updateBook();
						   break;
					   case 5:
						   library.deleteBook();
						   break;
					   case 6:
						   library.addUser();
						   break;
					   }
					   System.out.println("Are you like to continue Enter e");
						op = sc.next().charAt(0);
					   }while(op=='e');
				   }
			   }
			   else
			   {
					System.out.println("User does not exist");	
		       }
	   }
	   else
	   {
		  System.out.println("Enter Registration Details");
		  library.addUser();
	   }
		   }
   }
}
