

public class Book extends Media{
	String editor;//�༭
	String bookISBN;//
	String publishDate;//��������
	
   public Book()
   {	   
	   editor=null;
	   bookISBN=null;
	   publishDate=null;
	  
   }
   public String getBookISBN()
   {
	   return bookISBN;
   }
   public void editorInput()
   {
	   editor=Read.readString();
   }
   public void bookISBNInput()
   {
	   bookISBN=Read.readString();
   }
   public void publishDateInput()
   {
	   publishDate=Read.readString();
   }
   public double getprice()
   {
	   return price;
   }
   public String toString() 
   {
	return (super.toString()+"\t"+"�༭:"+editor+"\t"+"ISBN:"+bookISBN+"\t"+"�������ڣ�"+publishDate+"\n") ;  
   }

}
