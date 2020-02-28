
public class Tape {
	String mediaName;//磁带名称
	double price;//磁带价格
	String press;//磁带出版社
	String artist;//磁带作者
	String taprISRC;//磁带的ISRC
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
		mediaName="无";
		price=0;
		press="无";
		artist="无";
		taprISRC="无";
	}
	public String toString() 
	{
		return("磁带名称:"+mediaName+"   磁带价格:"+price+"   出版社:"+press+"   作者:"+artist+"   ISRC:"+taprISRC);
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
