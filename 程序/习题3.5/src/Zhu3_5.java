import java.util.Scanner;

public class Zhu3_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("请输入两个整数：");
		n=sc.nextInt();
		m=sc.nextInt();
		QiuShu q=new QiuShu();		
		System.out.println("最大公约数为："+q.gys(n, m));
		System.out.println("最小公倍数为："+q.gbs(n, m,q.gys(n, m)));
		sc.close();
	}

}
