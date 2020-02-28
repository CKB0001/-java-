

import java.io.*;
import java.util.Scanner;

public class Student {
	public static void main(String args[]) throws IOException{
		
		
		boolean choice=true;
		Scanner sc=new Scanner(System.in);
		String filename ="D:\\学习\\java\\程序\\习题6.8\\src\\Student.txt";
		while (choice)
		{	
			System.out .println("请输入 \n写入选1\n读出选2\n退出选0\n");
			int x=sc.nextInt();//选择
			switch(x) 
			{
			case 1:
				boolean q=true;
				while(q) 
				{
					
					BufferedWriter w=new BufferedWriter(new FileWriter(filename,true));
					System.out .println("请输入学生姓名");
					w.write("姓名： \t"+sc.next());
					w.newLine();					
					System.out.println("请输入年龄");
					w.write("年龄 ： \t"+String.valueOf(sc.nextInt()));
					w.newLine();
					System.out .println("请输入学生的班级");
					w.write("班级: \t"+sc.next());
					w.newLine();
					
					
					w.close();
					System.out.println("是否继续输入\n 退出输入请选0\n");
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
				System.out .println("请输入正确的选项");
			}
			
		}
		
		sc.close();
	}
}
