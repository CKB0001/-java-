

import java.util.Scanner;

public class Zhu3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("�����������Ƚϵ�����");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
BiJiao bi=new BiJiao();
System.out.println("���ֵΪ��"+bi.Max(x, y, z));
System.out.println("��СֵΪ��"+bi.Min(x, y, z));
sc.close();
	}

}
