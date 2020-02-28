

public class Book extends Media{
	String editor;//编辑
	String bookISBN;//
	String publishDate;//出版日期
	
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
	return (super.toString()+"\t"+"编辑:"+editor+"\t"+"ISBN:"+bookISBN+"\t"+"生产日期："+publishDate+"\n") ;  
   }

}
