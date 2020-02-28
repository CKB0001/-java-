
public class CD {
	String mediaName;//CD名称
	double price;//CD价格
	String press;//CD出版社
	String artist;//CD作者
	String cdISRC;//CDISRC
	String cdpublisher;//CD发行商
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
		mediaName="无";
		price=0;
		press="无";
		artist="无";
		cdISRC="无";
		cdpublisher="无";
	}
	public String toString() 
	{
		return("CD名称:"+mediaName+"   价格:"+price+"   出版社:"+press+"   作者:"+artist+"   ISRC:"+cdISRC+"   发行商："+cdpublisher);
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
