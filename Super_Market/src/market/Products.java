package market;
import java.util.*;
public class Products {
	
	//ArrayList<Products> product = new ArrayList<>();

      private String Product_id;
      private String Product_name;
      private int Product_quantity;
      private int Price;
      Products()
      {
    	  
      }
      Products(String pid,String pname,int pq,int price)
      {
    	  Product_id = pid;
    	  Product_name = pname;
    	  Product_quantity =pq;
    	  Price=price;
      }
      public String getProductDetails()
      {
    	  return Product_id+" "+Product_name+" "+Product_quantity+" "+Price;
      }
      
  public String getProductid()
  {
	  return Product_id;
  }
  public String getProductname()
  {
	  return Product_name;
  }
  public int getProduct_quantity()
  {
	  return Product_quantity;
  }
  public int getProductprice()
  {
	  return Price;
  }

}
