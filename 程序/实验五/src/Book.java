
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
   public Book()
   {
	   mediaName="��";
	   price=0;
	   press="��";
	   artist="��";
	   editor="��";
	   bookISBN="��";
	   publishDate="��";
	}
   public String toString() 
   {
	return ("����:"+mediaName+"  �۸�:"+price+"  ������:"+press+"  ����:"+artist+"  �༭:"+editor+"  ISBN:"+bookISBN+"  �������ڣ�"+publishDate) ;  
   }
   public void MediaPrice() //�鿴�۸��Ƿ������֣���������򱨴�
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
				System.out.println("�����������������!!!");
			}
		}
	}
   
}
