

import java.io.*;
import java.util.Scanner;

public class Student {
	public static void main(String args[]) throws IOException{
		
		
		boolean choice=true;
		Scanner sc=new Scanner(System.in);
		String filename ="D:\\ѧϰ\\java\\����\\ϰ��6.8\\src\\Student.txt";
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
					System.out .println("������ѧ������");
					w.write("������ \t"+sc.next());
					w.newLine();					
					System.out.println("����������");
					w.write("���� �� \t"+String.valueOf(sc.nextInt()));
					w.newLine();
					System.out .println("������ѧ���İ༶");
					w.write("�༶: \t"+sc.next());
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
