import java.util.Scanner;
import java.io.*;
public class Zhu6_3 {
	public static void main (String agrs[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("�������ļ���");
		String c;
		c=sc.next();
		String name="D:\\ѧϰ\\java\\����\\ϰ��6.3\\src\\"+c+".txt";
		BufferedWriter writer=new BufferedWriter(new FileWriter(name));
		System.out.println("����������Ҫ�������ĸ�����");
		int num=sc.nextInt();
		System.out .println("��������Ҫȷ���ķ�Χ");
		System.out .println("ȡ����������ֵΪ��");
		int max=sc.nextInt();
		System.out .println("��ȡ�����������СֵΪ��");
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
