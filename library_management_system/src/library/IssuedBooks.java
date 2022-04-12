package library;

public class IssuedBooks {
      private String userid;
      private int bookid;
      private String issuedDate;
  	  private String returnDate;
  	  IssuedBooks(String userid,int bookid,String issuedDate,String returnDate)
  	  {
  		  this.userid=userid;
  		  this.bookid=bookid;
  		  this.issuedDate=issuedDate;
  		  this.returnDate=returnDate;
  	  }
  	  public String getIssuedBooks()
  	  {
  		  return userid+" "+bookid+"  "+issuedDate+"  "+returnDate;
  	  }
}
