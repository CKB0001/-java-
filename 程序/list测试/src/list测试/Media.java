package list����;

import java.util.Scanner;

public class Media {
	Scanner sc=new Scanner(System.in);
	public String mediaName;//����
	public double price;//�۸�
	public String press;//������
    public String artist;//����  
    public void mediaNameInput()
    {
    	mediaName=sc.next();
    }
    public void MediaPriceInput() //�鿴�۸��Ƿ������֣���������򱨴�
	{
		boolean va=false;
		while (!va)
		{
			try
			{
				price=sc.nextDouble();
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
    	press=sc.next();
    }
    public void artistInput() 
    {
    	artist=sc.next();
    }
    public String toString()
    {
    	return("���ƣ�"+mediaName+"\t"+"�۸�"+price+"\t"+"�����磺"+press+"\t"+"���ߣ�"+artist+"\t");
    }
    
}
