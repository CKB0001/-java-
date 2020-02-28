

import java.util.Scanner;

public class Zhu3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("请输入三个比较的整数");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
BiJiao bi=new BiJiao();
System.out.println("最大值为："+bi.Max(x, y, z));
System.out.println("最小值为："+bi.Min(x, y, z));
sc.close();
	}

}
