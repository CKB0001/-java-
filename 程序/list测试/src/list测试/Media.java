package list测试;

import java.util.Scanner;

public class Media {
	Scanner sc=new Scanner(System.in);
	public String mediaName;//名称
	public double price;//价格
	public String press;//出版社
    public String artist;//作者  
    public void mediaNameInput()
    {
    	mediaName=sc.next();
    }
    public void MediaPriceInput() //查看价格是否是数字，如果不是则报错
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
				System.out.println("输入错误，请输入数字!!!");
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
    	return("名称："+mediaName+"\t"+"价格："+price+"\t"+"出版社："+press+"\t"+"作者："+artist+"\t");
    }
    
}
