

public class Media {

	public String mediaName;//����
	public double price;//�۸�
	public String press;//������
    public String artist;//����  
    public void mediaNameInput()
    {
    	mediaName=Read.readString();
    }
    public void MediaPriceInput() //�鿴�۸��Ƿ������֣���������򱨴�
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
    public void mediaPressInput()
    {
    	press=Read.readString();
    }
    public void artistInput() 
    {
    	artist=Read.readString();
    }
    public String toString()
    {
    	return("���ƣ�"+mediaName+"\t"+"�۸�"+price+"\t"+"�����磺"+press+"\t"+"���ߣ�"+artist+"\t");
    }
    
}
