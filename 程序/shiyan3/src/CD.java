
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
	String cdpublisher;//发行商
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
    	System.out.println("该CD的信息为 ：");
    	System.out.print("CD名称:"+mediaName+"   价格:"+price+"   出版社:"+press);
    	System.out.println("   作者:"+artist+"   ISRC:"+cdISRC+"   发行商："+cdpublisher);
    }
}
