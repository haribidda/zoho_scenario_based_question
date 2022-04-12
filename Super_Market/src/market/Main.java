package market;

import java.util.Scanner;
import java.util.*;
public class Main {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int option;
	   char ch ='y';
	   Products p = new Products();
	   User user = new User();
	   SuperMarket sm = new SuperMarket();
//	   Bill bill = new Bill();
	   int bid=0;
	   InventoryManager im = new InventoryManager();
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
			   if(sm.validate(userid,password))
			   {
				   if(role.equals("user"))
				   {
					   System.out.println("Welcome User "+userid);
					   sm.getProducts();
				   System.out.println("Enter the Product Id  and quantity to buy ");
				   System.out.println("Enter the Product Id");
				   String p_id = sc.next();
				   System.out.println("Enter the  quantity ");
				   int p_q = sc.nextInt();
				   int add=1;
				   Bill bo = new Bill(bid);
				   do
				   {
				     bo.addtoCart(sm,p_id,p_q);
				     System.out.println("Enter 1 to add product to bill || Enter 2 to DisplayBill");
				     add=sc.nextInt();
				   }while(add==1);
				   bo.printBill();
				   bid++;
//				   System.out.println("Proceed To Payment");
//				   System.out.println("Payable Amount : 90");
//				   System.out.println("Payment Successfully");
				   
				  
				   }
				   else
				   {
					   System.out.println("Welcome Admin"+userid);
					   System.out.println("Enter 1)AddProducts \t2)deleteItem \t3)addUser \t4)ViewProducts \t5)CreditUpdate");
					   switch(sc.nextInt())
					   {
					   case 1:
						   sm.addProducts();
						   break;
					   case	2:
						   sm.deleteItem();
						   break;
					   case 3:
						   sm.userRegister();
						   break;
					   case 4:
						   sm.getProducts();
						   break;
					   case 5:
						   System.out.println("Enter the credit limit");
						   break;
					   }
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
		  sm.userRegister();
	   }
		   }
   }
}
