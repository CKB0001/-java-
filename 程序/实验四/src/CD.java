
public class CD {
	String mediaName;
	double price;
	String press;
	String artist;
	String cdISRC;
	String cdpublisher;//������
	public CD(String inmediaName,double inprice,String inpress,String inartist,String incdISRC,String incdpublisher)
	{
		mediaName=inmediaName;
		price=inprice;
		press=inpress;
		artist=inartist;
		cdISRC=incdISRC;
		cdpublisher=incdpublisher;
	}
	void PRINT()
    {
    	System.out.println("��CD����ϢΪ ��");
    	System.out.print("CD����:"+mediaName+"   �۸�:"+price+"   ������:"+press);
    	System.out.println("   ����:"+artist+"   ISRC:"+cdISRC+"   �����̣�"+cdpublisher);
    }
}
