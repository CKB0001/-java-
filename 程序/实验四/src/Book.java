
public class Book {
	String mediaName;//�鼮����
    double price;//�۸�
    String press;//������
    String artist;//����  
    String editor;//�༭
    String bookISBN;//ISBN
    String publishDate=null;//��������    
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
    	System.out.println("���鼮����ϢΪ ��");
    	System.out.println("����:"+mediaName+"\t�۸�:"+price+"\t������:"+press);
    	System.out.println(" ����:"+artist+"\t�༭:"+editor+"\tISBN:"+bookISBN+"\t�������ڣ�"+publishDate);
    }
    
   
}
