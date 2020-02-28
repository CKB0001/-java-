package list≤‚ ‘;


public class Book extends Media{
	
	String bookISBN;//
	
   public Book()
   {	   
	  
	   bookISBN=null;
	   
	}
   public void bookISBNinput()
   {
	  bookISBN=sc.next();
   }
   public String toString() 
   {
	return (super.toString()+"\tISBN:"+bookISBN) ;  
   }
}
