package tongxunlu;

import java.io.*;
import java.util.Scanner;

public class Tongxunlu {
	public static void main(String args[]) throws IOException{
		boolean choice=true;
		Scanner sc=new Scanner(System.in);
		String filename ="D:\\ѧϰ\\java\\����\\ʵ���\\src\\ͨѶ¼\\ͨѶ¼.txt";
		while (choice)
		{	
			System.out .println("������ \nд��ѡ1\n����ѡ2\n�˳�ѡ0\n");
			int x=sc.nextInt();//ѡ��
			switch(x) 
			{
			case 1:
				boolean q=true;
				while(q) 
				{
				
					BufferedWriter w=new BufferedWriter(new FileWriter(filename,true));
					System.out .println("��������ϵ��");
					w.write("������ \t"+sc.next());
					w.newLine();
					System.out.println("��������ϵ�绰");
					w.write("�绰 �� \t"+String.valueOf(sc.nextInt()));
					w.newLine();
					w.close();
					System.out.println("�Ƿ��������\n �˳�������ѡ0\n");
					int a=sc.nextInt();
					if(a==0)
					{
						q=false;
					}				
				}
				break;
			case 2:
				BufferedReader d=new BufferedReader (new FileReader(filename)); 
				String line=d.readLine();
				while(line!=null) 
				{
					System.out.println(line);
					line=d.readLine();
				}
				d.close();				
				break;
			case 0:
				choice=false;
				break;
			default :
				System.out .println("��������ȷ��ѡ��");
			}
			
		}
		
		sc.close();
	}
}
