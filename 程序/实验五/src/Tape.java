
public class Tape {
	String mediaName;//�Ŵ�����
	double price;//�Ŵ��۸�
	String press;//�Ŵ�������
	String artist;//�Ŵ�����
	String taprISRC;//�Ŵ���ISRC
	public Tape(String inmediaName,double inprice,String inpress,String inartist,String intaprISRC)
	{
		mediaName=inmediaName;
		price=inprice;
		press=inpress;
		artist=inartist;
		taprISRC=intaprISRC;	
	}
	public Tape() 
	{
		mediaName="��";
		price=0;
		press="��";
		artist="��";
		taprISRC="��";
	}
	public String toString() 
	{
		return("�Ŵ�����:"+mediaName+"   �Ŵ��۸�:"+price+"   ������:"+press+"   ����:"+artist+"   ISRC:"+taprISRC);
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
