import java.util.Scanner;

public class Zhu4_11 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		Student student[]=new Student[100];
		StudentBZ bz[]=new StudentBZ[100];
		StudentXW xw[]=new StudentXW[100];
		boolean pan=true;
		int choice=0,pt=0,b=0,x=0;
		while(pan) {
		
			System.out.println("������ͨѧ��ѡ1\n����೤ѡ2\n����ѧϰίԱѡ3\n�鿴ѡ4\n�˳�ѡ0\n");
			System.out.print("������ѡ�");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				student[pt]=new Student();
				System.out.println("������ѧ����ѧ��\n");
				student[pt].setxuehao(sc.nextInt());
				System.out.println("������ѧ��������\n");
				student[pt].setname(sc.next());
				System.out.println("������ѧ����Ӣ��ɼ�\n");
				student[pt].setyingyu(sc.nextDouble());
				System.out.println("������ѧ������ѧ�ɼ�\n");
				student[pt].setshuxue(sc.nextDouble());
				System.out.println("������ѧ���ļ�����ɼ�\n");
				student[pt].setjisuanji(sc.nextDouble());
				System.out.println("��ѧ�����ܳɼ�Ϊ�� "+student[pt].sum());
				System.out.println("ѧ���Ĳ����ɼ�Ϊ�� "+student[pt].testScore());
				pt++;
				break;
			case 2:
				bz[b]=new StudentBZ();
				System.out.println("������೤��ѧ��\n");
				bz[b].setxuehao(sc.nextInt());
				System.out.println("������೤������\n");
				bz[b].setname(sc.next());
				System.out.println("������೤��Ӣ��ɼ�\n");
				bz[b].setyingyu(sc.nextDouble());
				System.out.println("������೤����ѧ�ɼ�\n");
				bz[b].setshuxue(sc.nextDouble());
				System.out.println("������೤�ļ�����ɼ�\n");
				bz[b].setjisuanji(sc.nextDouble());
				System.out.println("��೤���ܳɼ�Ϊ�� "+bz[b].sum());
				System.out.println("�೤�Ĳ����ɼ�Ϊ�� "+bz[b].testScore());
				b++;
				break;
			case 3:
				xw[x]=new StudentXW();
				System.out.println("������ѧϰίԱ��ѧ��\n");
				xw[x].setxuehao(sc.nextInt());
				System.out.println("������ѧϰίԱ������\n");
				xw[x].setname(sc.next());
				System.out.println("������ѧϰίԱ��Ӣ��ɼ�\n");
				xw[x].setyingyu(sc.nextDouble());
				System.out.println("������ѧϰίԱ����ѧ�ɼ�\n");
				xw[x].setshuxue(sc.nextDouble());
				System.out.println("������ѧϰίԱ�ļ�����ɼ�\n");
				xw[x].setjisuanji(sc.nextDouble());
				System.out.println("��ѧϰίԱ���ܳɼ�Ϊ�� "+xw[x].sum());
				System.out.println("ѧϰίԱ�Ĳ����ɼ�Ϊ�� "+xw[x].testScore());
				x++;
				break;
			case 4:
				boolean cha=true;
				while(cha)
				{
					System.out.println("��ͨѧ��ѡ1\n�೤ѡ2\nѧϰίԱѡ3\n����ѧ��ѡ4\n�˳�ѡ0\n");
					System.out.println("����������Ҫ�鿴��ѧ���ĳɼ�");					
					int kan=sc.nextInt();
					switch(kan)
					{
					case 1:
						for(int i=0;i<pt;i++)
						{
							System.out.println(student[i].toString());
						}
						break;
					case 2:
						for(int i=0;i<b;i++)
						{
							System.out.println(bz[i].toString());
						}
						break;
					case 3:
						for(int i=0;i<x;i++) 
						{
							System.out.print(xw[i].toString());
						}
						break;
					case 4:
						System.out.println("��ͨѧ���ĳɼ�Ϊ��");
						for(int i=0;i<pt;i++)
						{
							System.out.println(student[i].toString());
						}
						System.out.println("�೤�ĳɼ�Ϊ��");
						for(int i=0;i<b;i++)
						{
							System.out.println(bz[i].toString());
						}
						System.out.println("ѧϰίԱ�ĳɼ�Ϊ��");
						for(int i=0;i<x;i++) 
						{
							System.out.print(xw[i].toString());
						}
						break;
					case 0:
						cha=false;
						System.out.println("�˳��鿴");
						break;
					default:
						System.out.println("��������ȷ��ѡ��");
						break;
					}					
				}
				break;
			case 0:
				pan=false;
				System.out.println("ллʹ�á�");
				break;
			default:
				System.out.println("��������ȷ��ѡ��!!!");
				break;	
			}
		}
		sc.close();
	}

}
