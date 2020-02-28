import java.util.Scanner;
import java.io.*;
public class Zhu6_3 {
	public static void main (String agrs[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("请输入文件名");
		String c;
		c=sc.next();
		String name="D:\\学习\\java\\程序\\习题6.3\\src\\"+c+".txt";
		BufferedWriter writer=new BufferedWriter(new FileWriter(name));
		System.out.println("请输入你想要的整数的个数：");
		int num=sc.nextInt();
		System.out .println("请输入你要确定的范围");
		System.out .println("取随机数的最大值为：");
		int max=sc.nextInt();
		System.out .println("所取的随机数的最小值为：");
		int min=sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
		String x=String.valueOf((int)(Math.random()*(max+1-min)+min));
			writer.write(x);
			writer.newLine();			
		}
		writer.close();
		
		sc.close();
	}
}
