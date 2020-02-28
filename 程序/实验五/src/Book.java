
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
   public Book()
   {
	   mediaName="无";
	   price=0;
	   press="无";
	   artist="无";
	   editor="无";
	   bookISBN="无";
	   publishDate="无";
	}
   public String toString() 
   {
	return ("书名:"+mediaName+"  价格:"+price+"  出版社:"+press+"  作者:"+artist+"  编辑:"+editor+"  ISBN:"+bookISBN+"  生产日期："+publishDate) ;  
   }
   public void MediaPrice() //查看价格是否是数字，如果不是则报错
	{
		boolean va=false;
		while (!va)
		{
			try
			{
				price=Read.readDouble();
				va=true;
			}
			catch(Exception e)
			{
				System.out.println("输入错误，请输入数字!!!");
			}
		}
	}
   
}
