import java.util.Scanner;

public class Zhu3_5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("����������������");
		n=sc.nextInt();
		m=sc.nextInt();
		QiuShu q=new QiuShu();		
		System.out.println("���Լ��Ϊ��"+q.gys(n, m));
		System.out.println("��С������Ϊ��"+q.gbs(n, m,q.gys(n, m)));
		sc.close();
	}

}
