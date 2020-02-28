import java.lang.Math;
public class Zhu3_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[];
		int q=0;
		SuiJiShu c=new SuiJiShu();
		a=new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		System.out.println("所产生的随机数为：");
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
		System.out.println("其中最大值为："+max);
		System.out.println("其中最小值为："+min);
		System.out.println("其中大于50的数有："+w+"个");
		
	}

}
