package ����;
import java.util.Scanner;
public class zhu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    
    Scanner sc=new Scanner(System.in);
    FuShu num=new FuShu(0,0,0,0);
    System.out.println("�����ĸ�ʽΪa+bi");
    System.out.println("�����븴����a"); 
    num.a1=sc.nextFloat();
    System.out.println("�����븴����b"); 
    num.b1=sc.nextFloat();
    System.out.println("��������һ��������a"); 
    num.a2=sc.nextFloat();
    System.out.println("��������һ��������b"); 
    num.b2=sc.nextFloat();
    
    System.out.println(num.toString());
    	sc.close();
	}

}
