
public class Book {
	String mediaName;//�鼮����
    double price;//�۸�
    String press;//������
    String artist;//����
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
    String editor;//�༭
    String bookISBN;
    String publishDate=null;//��������
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
    	System.out.println("���鼮����ϢΪ ��");
    	System.out.println("����:"+mediaName+"\t�۸�:"+price+"\t������:"+press);
    	System.out.println(" ����:"+artist+"\t�༭:"+editor+"\tISBN:"+bookISBN+"\t�������ڣ�"+publishDate);
    }
    
   
}
