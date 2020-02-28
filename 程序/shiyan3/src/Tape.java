
public class Tape {
	String mediaName;
	double price;
	String press;
	String artist;
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
	String taprISRC;
	void taprISRCINPUT()
	{
		taprISRC=Read.readString();
	}
	void PRINT()
    {
    	System.out.println("该磁带的信息为 ：");
    	System.out.print("磁带名称:"+mediaName+"   磁带价格:"+price+"   出版社:"+press);
    	System.out.println("   作者:"+artist+"   ISRC:"+taprISRC);
    }
}
