package market;
import java.util.*;
public class SuperMarket {
 
	HashMap<String,Products> product = new HashMap<>();
	HashMap<String,User> users = new HashMap<>();
	HashMap<String,String> userLoginDetails = new HashMap<>();
	User user = new User();
	Scanner sc = new Scanner(System.in);
	SuperMarket(){
		product.put("1", new Products("1","pears",2,45));
		product.put("2", new Products("2","hamam",5,25));
		users.put("hari@gmail.com", new User("hari","hari@gmail.com","hari@32","user"));
		users.put("biddu@gmail.com", new User("bida","biddu@gmail.com","biddu@32","admin"));
	    userLoginDetails.put("hari@gmail.com","hari@32");
	    userLoginDetails.put("biddu@gmail.com","biddu@32");
	}
	public void addProducts()
	{
		int h=1;
		System.out.println("Enter the product details to add");
		System.out.println("Enter ProductId :");
		System.out.println("Enter Product_id :");
		String p_id = sc.next();
		System.out.println("Enter Product_name:");
		String p_name = sc.next();
		System.out.println("Enter Product_quantity:");
		int p_q = sc.nextInt();
		System.out.println("Enter product price");
		int price = sc.nextInt();
		
		
		product.put("1",new Products(p_id,p_name,p_q,price));
		
	}
	public void userRegister()
	{
		
	
		System.out.println("Enter the user details to register");
		System.out.println("Enter Username :");
		String name = sc.next();
		System.out.println("Enter UserId :");
		String userId = sc.next();
		System.out.println("Enter Password :");
		String password = sc.nextLine();
		System.out.println("Enter Role:");
		String role = sc.next();
		
		
		users.put(userId,new User(name,userId,password,role));
		userLoginDetails.put(userId, password);
		System.out.println("User Added Successfully");

	}
	public void getProducts() {
		System.out.println("Product_id  Product_Name  Product_quantity  Product_Price");
		product.forEach((k,v)->System.out.println(v.getProductDetails()));
	}
	public Products getProduct(String id) {
		return product.get(id);
	}
	
	public void deleteItem() {
		
		System.out.println("Enter the Product ID to Delete");
		int p_id = sc.nextInt();
		System.out.println("Product Deleted");
	
	}
	public boolean validate(String userid,String password)
	{
		if(userLoginDetails.containsKey(userid))
		{
			if(password.equals(userLoginDetails.get(userid))) return true;
		}
		
		return false;
		
	}
}
