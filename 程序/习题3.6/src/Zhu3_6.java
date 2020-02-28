import java.util.Scanner;
public class Zhu3_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		double q,w;
		
		System.out.println("请输入你给的钱");
		q=sc.nextDouble();
		System.out.println("请输入物品的价格");
		w=sc.nextDouble();
		ZhaoQian z=new ZhaoQian();
		z.zhao(q, w);
		sc.close();

	}

}
