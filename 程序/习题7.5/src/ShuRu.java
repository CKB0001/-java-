import java.util.Scanner;
import java.util.Date;
public class ShuRu {
	int num=10;
	People p[]=new People[num];
	Scanner sc=new Scanner(System.in);
	public People[] people()
	{
		for(int i=0;i<num;i++)
		{
			p[i]=new People();
			System.out.println("请输入录入人的姓名");
			p[i].setName(sc.next());
			System.out.println("请输入录入人的性别");
			p[i].setSex(sc.next());
			System.out.println("请输入录入人的生日");
			p[i].setDay(sc.next());
			System.out.println("请输入录入人的身高");
			p[i].setHeight(sc.nextDouble());
			System.out.println("请输入录入人的体重");
			p[i].setWeight(sc.nextDouble());
			
		}		
		return p;
	}
	
	
}
