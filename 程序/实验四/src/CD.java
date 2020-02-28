
public class CD {
	String mediaName;
	double price;
	String press;
	String artist;
	String cdISRC;
	String cdpublisher;//发行商
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
    	System.out.println("该CD的信息为 ：");
    	System.out.print("CD名称:"+mediaName+"   价格:"+price+"   出版社:"+press);
    	System.out.println("   作者:"+artist+"   ISRC:"+cdISRC+"   发行商："+cdpublisher);
    }
}
