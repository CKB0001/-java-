
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
    	System.out.println("�ôŴ�����ϢΪ ��");
    	System.out.print("�Ŵ�����:"+mediaName+"   �Ŵ��۸�:"+price+"   ������:"+press);
    	System.out.println("   ����:"+artist+"   ISRC:"+taprISRC);
    }
}
