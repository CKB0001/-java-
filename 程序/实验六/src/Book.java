

public class Book extends Media{
	String editor;//�༭
	String bookISBN;//
	String publishDate;//��������
   public Book()
   {	   
	   editor="��";
	   bookISBN="��";
	   publishDate="��";
	}
   public String toString() 
   {
	return (super.toString()+"\t�༭:"+editor+"\tISBN:"+bookISBN+"\t�������ڣ�"+publishDate) ;  
   }
}
