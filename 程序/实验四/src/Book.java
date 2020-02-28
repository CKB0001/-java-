
public class Book {
	String mediaName;//书籍名称
    double price;//价格
    String press;//出版社
    String artist;//作者  
    String editor;//编辑
    String bookISBN;//ISBN
    String publishDate=null;//生产日期    
   public Book(String inmediaName,double inprice,String inpress,String inartist,String ineditor,String inbookISBN,String inpublishDate)
    {
    	mediaName=inmediaName;
    	price=inprice;
    	press=inpress;
    	artist=inartist;
    	editor=ineditor;
    	bookISBN=inbookISBN;
    	publishDate=inpublishDate;
    }
    void PRINT()
    {
    	System.out.println("该书籍的信息为 ：");
    	System.out.println("书名:"+mediaName+"\t价格:"+price+"\t出版社:"+press);
    	System.out.println(" 作者:"+artist+"\t编辑:"+editor+"\tISBN:"+bookISBN+"\t生产日期："+publishDate);
    }
    
   
}
