package library;
import java.util.*;
public class User {
    private String userId;
    private String userName;
    private String password;
    private String role;
    private int fine;
    private int credit;
    User()
    {
    	this.credit=1500;
    }
    User(String userId,String userName,String password,String role,int fine)
    {
    	this();
    	this.userId=userId;
    	this.userName = userName;
    	this.password = password;
    	this.role=role;
    	this.fine=fine;
    }
    
    public String getUserId() {
   	 return userId;
    }
    
    public String getUserName() {
   	 return userName;
    }
    
    public String getPassword() {
   	 return password;
    }
    
    public String getRole(){
   	 return role;
    }
    
    public int getFine() {
   	 return fine;
    }
    public int getCredit() {
      	 return credit;
       }
    
    public void setFine(int fine)
    {
    	this.fine=fine;
    }
    public void setCredit(int credit){
     	 this.credit=credit;
      }
}
