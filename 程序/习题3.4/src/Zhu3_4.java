import java.lang.Math;
public class Zhu3_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[];
		int q=0;
		SuiJiShu c=new SuiJiShu();
		a=new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		System.out.println("�������������Ϊ��");
		for (int i=0;i<100;i++) 
		{
			System.out.print(a[i]+"\t");
			q++;
			if(q %10==0)
			System.out.println("\n");
		}
		
		int max=0,min=100,w=0;
		for (int i=0;i<100;i++) 
		{
			max=c.max(max, a[i]);
			min=c.min(min, a[i]);
			w=c.jishu(a[i]);
		}
		System.out.println("�������ֵΪ��"+max);
		System.out.println("������СֵΪ��"+min);
		System.out.println("���д���50�����У�"+w+"��");
		
	}

}
