
public class CD {
	String mediaName;//CD����
	double price;//CD�۸�
	String press;//CD������
	String artist;//CD����
	String cdISRC;//CDISRC
	String cdpublisher;//CD������
	public CD(String inmediaName,double inprice,String inpress,String inartist,String incdISRC,String incdpublisher)
	{
		mediaName=inmediaName;
		price=inprice;
		press=inpress;
		artist=inartist;
		cdISRC=incdISRC;
		cdpublisher=incdpublisher;
	}
	public CD()
	{
		mediaName="��";
		price=0;
		press="��";
		artist="��";
		cdISRC="��";
		cdpublisher="��";
	}
	public String toString() 
	{
		return("CD����:"+mediaName+"   �۸�:"+price+"   ������:"+press+"   ����:"+artist+"   ISRC:"+cdISRC+"   �����̣�"+cdpublisher);
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
