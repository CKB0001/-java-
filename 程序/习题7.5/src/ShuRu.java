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
			System.out.println("������¼���˵�����");
			p[i].setName(sc.next());
			System.out.println("������¼���˵��Ա�");
			p[i].setSex(sc.next());
			System.out.println("������¼���˵�����");
			p[i].setDay(sc.next());
			System.out.println("������¼���˵����");
			p[i].setHeight(sc.nextDouble());
			System.out.println("������¼���˵�����");
			p[i].setWeight(sc.nextDouble());
			
		}		
		return p;
	}
	
	
}
