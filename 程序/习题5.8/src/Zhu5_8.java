import java.util.Scanner;

public class Zhu5_8 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		Student student[]=new Student[5];
		StudentXW xw=new StudentXW();
		StudentBZ bz=new StudentBZ();
		student[3]=(Student)xw;
		student[4]=(Student)bz;
		System.out.println("��������ͨѧ������Ϣ");
		for(int i=0;i<3;i++)
		{	System.out.println("�������"+(i+1)+"����ͨѧ������Ϣ");
			student[i]=new Student();
			System.out.println("������ѧ����ѧ��");
			student[i].setxuehao(sc.nextInt());
			System.out.println("������ѧ��������");
			student[i].setname(sc.next());
			System.out.println("������ѧ������ѧ�ɼ�");
			student[i].setshuxue(sc.nextDouble());
			System.out.println("������ѧ����Ӣ��ɼ�");
			student[i].setyingyu(sc.nextDouble());
			System.out.println("������ѧ���ļ�����ɼ�");
			student[i].setjisuanji(sc.nextDouble());			
		}
		System.out.println("������ѧϰίԱ����Ϣ");
			System.out.println("������ѧϰίԱ��ѧ��");
			xw.setxuehao(sc.nextInt());
			System.out.println("������ѧϰίԱ������");
			xw.setname(sc.next());
			System.out.println("������ѧϰίԱ����ѧ�ɼ�");
			xw.setshuxue(sc.nextDouble());
			System.out.println("������ѧϰίԱ��Ӣ��ɼ�");
			xw.setyingyu(sc.nextDouble());
			System.out.println("������ѧϰίԱ�ļ�����ɼ�");
			xw.setjisuanji(sc.nextDouble());
		System.out.println("������೤����Ϣ");	
			System.out.println("������೤��ѧ��");
			bz.setxuehao(sc.nextInt());
			System.out.println("������೤������");
			bz.setname(sc.next());
			System.out.println("������೤����ѧ�ɼ�");
			bz.setshuxue(sc.nextDouble());
			System.out.println("������೤��Ӣ��ɼ�");
			bz.setyingyu(sc.nextDouble());
			System.out.println("������೤�ļ�����ɼ�");
			bz.setjisuanji(sc.nextDouble());
		System.out.println("�����ǵĲ����ɼ�Ϊ��");	
		for(int i=0;i<3;i++) 
		{System.out.print(student[i].xuehao+"  "+student[i].name+"�Ĳ����ɼ�Ϊ�� ");	
			System.out.println(student[i].testScore());
		}
		System.out.print("�೤  "+bz.xuehao +"  "+bz.name+"�Ĳ����ɼ�Ϊ�� ");
		 System.out .println(bz.testScore());
		System.out.print("ѧϰίԱ  "+xw.xuehao +"  "+xw.name+"�Ĳ����ɼ�Ϊ�� ");
		 System.out .println(xw.testScore());
	sc.close();
	}

}
