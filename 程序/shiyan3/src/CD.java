
public class CD {
	String mediaName;
	double price;
	String press;
	String artist;
	void mediaNameInput()
	{
		mediaName=Read.readString();
	}
	void mediaPriceInput() 
	{
		price=Read.readDouble();
	}
	void mediaPressInput() 
	{
		press=Read.readString();
	}
	void artistInput() 
	{
		artist=Read.readString();
	}
	String cdISRC;
	String cdpublisher;//������
	void cdISRCinput()
	{
		cdISRC=Read.readString();
	}
	void cdpublisherinput()
	{
		cdpublisher=Read.readString();
	}
	void PRINT()
    {
    	System.out.println("��CD����ϢΪ ��");
    	System.out.print("CD����:"+mediaName+"   �۸�:"+price+"   ������:"+press);
    	System.out.println("   ����:"+artist+"   ISRC:"+cdISRC+"   �����̣�"+cdpublisher);
    }
}
