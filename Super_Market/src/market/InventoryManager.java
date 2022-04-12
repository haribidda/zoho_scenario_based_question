package market;

import java.util.Scanner;

public class InventoryManager {
	public void deleteProduct()
    {
  	  System.out.println("Deleted Succesfully");
    }
    public void getAllProducts()
    {
  	  System.out.println("Product_id \tProduct_name \tProduct_quantity \tProduct_Category \tprice");
  	  System.out.println("1 \tLegion \t3 \tLaptop \tRS:50000");  
    }
    public void getAllProductsById(int id)
    {
  	  Scanner sc = new Scanner(System.in);
  	  System.out.println("Product_id \tProduct_name \tProduct_quantity \tProduct_Category \tprice");
  	  System.out.println(id+" \tLenovo \t 32 \t Laptop \tRS:50000");  
  	  
//  	  System.out.println("Enter addtocart to buy");
//  	  String str = sc.next();
//  	  if(str.equals("addtocart"))
//  	  {
//  		  bill.addtoCart(id);
//  	  }
  		  
    }
}
