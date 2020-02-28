
public class Book {
	String mediaName;//书籍名称
    double price;//价格
    String press;//出版社
    String artist;//作者
    void mediaNameInput()
    {
    	mediaName=Read.readString();
    };
    void mediaPriceInput() 
    {
    	price=Read.readDouble();
    };
    void mediaPressInput() 
    {
    	press=Read.readString();
    };
    void artistInput() 
    {
    	artist=Read.readString();
    };
    String editor;//编辑
    String bookISBN;
    String publishDate=null;//生产日期
    void ISBNInput()
    {
    	bookISBN=Read.readString();
    }
    void editorInput()
    {
    	editor=Read.readString();
    }
    void publishDateINPUT() 
    {
    	publishDate=Read.readString();
    }
    void PRINT()
    {
    	System.out.println("该书籍的信息为 ：");
    	System.out.println("书名:"+mediaName+"\t价格:"+price+"\t出版社:"+press);
    	System.out.println(" 作者:"+artist+"\t编辑:"+editor+"\tISBN:"+bookISBN+"\t生产日期："+publishDate);
    }
    
   
}
