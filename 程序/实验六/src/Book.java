

public class Book extends Media{
	String editor;//编辑
	String bookISBN;//
	String publishDate;//出版日期
   public Book()
   {	   
	   editor="无";
	   bookISBN="无";
	   publishDate="无";
	}
   public String toString() 
   {
	return (super.toString()+"\t编辑:"+editor+"\tISBN:"+bookISBN+"\t生产日期："+publishDate) ;  
   }
}
