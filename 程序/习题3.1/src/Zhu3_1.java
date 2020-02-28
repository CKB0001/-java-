

import java.util.Scanner;

public class Zhu3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入想要输入的阶乘数");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		JieCheng jie=new JieCheng();
		System.out.println(n+"的阶乘为："+jie.Jie(n));
		sc.close();
	}

}
