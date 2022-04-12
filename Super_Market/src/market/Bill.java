package market;
import java.util.*;

public class Bill {
	ArrayList<Bill> pb = new ArrayList();
	private int Transaction_id,quantity;
	private String product_id,product_name;
	private float amount;
	private int total=0;
	Bill(int id)
	{
		Transaction_id=id;
	}
	Bill(int id,String p_id,String p_name,int qty,float price)
	{
		Transaction_id=id;
		quantity=qty;
		amount=price;
		product_id = p_id;
		product_name = p_name;
	}
   public void addtoCart(SuperMarket sm,String id,int pq)
   {
//	   System.out.println("TOTAL BILL AMOUNT WITH PRODUCT DETAILS");
//	   System.out.println("Product_id Product_name Product_Quanity Price");
//	   System.out.println("1      Pears    2    45");
//	   System.out.println("Total Bill Amount : 90");

	   Products obj = sm.getProduct(id);
	   int a = obj.getProduct_quantity();
	   if(a<pq)
	   {
		   	System.out.println("Only "+a+" Quantity is Available Here");
	   }
	   amount = obj.getProductprice();
	   total+=(amount*pq);
	   pb.add(new Bill(Transaction_id,id,obj.getProductname(),pq,amount));
   }
   public void printBill()
   {
	   System.out.println("Bill ID :"+Transaction_id);
	   for(Bill i:pb)
	   {
		   System.out.println(i.product_id+" "+i.product_name+" "+i.amount+" "+i.quantity);
	   }
	   System.out.println(total);
   }
   public int getTransactionid()
   {
 	  return Transaction_id;
   }


}
