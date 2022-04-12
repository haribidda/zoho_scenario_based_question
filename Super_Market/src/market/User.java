package market;

public class User {
    
	private String Username;
	private String User_id;
	private String password;
	private String role;
	User()
	{
		
	}
	User(String un,String uid,String pass,String r)
	{
		Username = un;
		User_id =uid;
		password = pass;
		role=r;
	}
	
	  public String getUsername()
	  {
		  return Username;
	  }
	  public String getUserid()
	  {
		  return User_id;
	  }
	  public String getPassword()
	  {
		  return password;
	  }
	  public String getRole()
	  {
		  return role;
	  }

}
