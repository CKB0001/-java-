import java.util.Scanner;
public class Zhu3_6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		double q,w;
		
		System.out.println("�����������Ǯ");
		q=sc.nextDouble();
		System.out.println("��������Ʒ�ļ۸�");
		w=sc.nextDouble();
		ZhaoQian z=new ZhaoQian();
		z.zhao(q, w);
		sc.close();

	}

}
