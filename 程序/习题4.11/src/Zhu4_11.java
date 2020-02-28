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
		
			System.out.println("输入普通学生选1\n输入班长选2\n输入学习委员选3\n查看选4\n退出选0\n");
			System.out.print("请输入选项：");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				student[pt]=new Student();
				System.out.println("请输入学生的学号\n");
				student[pt].setxuehao(sc.nextInt());
				System.out.println("请输入学生的姓名\n");
				student[pt].setname(sc.next());
				System.out.println("请输入学生的英语成绩\n");
				student[pt].setyingyu(sc.nextDouble());
				System.out.println("请输入学生的数学成绩\n");
				student[pt].setshuxue(sc.nextDouble());
				System.out.println("请输入学生的计算机成绩\n");
				student[pt].setjisuanji(sc.nextDouble());
				System.out.println("则学生的总成绩为： "+student[pt].sum());
				System.out.println("学生的测评成绩为： "+student[pt].testScore());
				pt++;
				break;
			case 2:
				bz[b]=new StudentBZ();
				System.out.println("请输入班长的学号\n");
				bz[b].setxuehao(sc.nextInt());
				System.out.println("请输入班长的姓名\n");
				bz[b].setname(sc.next());
				System.out.println("请输入班长的英语成绩\n");
				bz[b].setyingyu(sc.nextDouble());
				System.out.println("请输入班长的数学成绩\n");
				bz[b].setshuxue(sc.nextDouble());
				System.out.println("请输入班长的计算机成绩\n");
				bz[b].setjisuanji(sc.nextDouble());
				System.out.println("则班长的总成绩为： "+bz[b].sum());
				System.out.println("班长的测评成绩为： "+bz[b].testScore());
				b++;
				break;
			case 3:
				xw[x]=new StudentXW();
				System.out.println("请输入学习委员的学号\n");
				xw[x].setxuehao(sc.nextInt());
				System.out.println("请输入学习委员的姓名\n");
				xw[x].setname(sc.next());
				System.out.println("请输入学习委员的英语成绩\n");
				xw[x].setyingyu(sc.nextDouble());
				System.out.println("请输入学习委员的数学成绩\n");
				xw[x].setshuxue(sc.nextDouble());
				System.out.println("请输入学习委员的计算机成绩\n");
				xw[x].setjisuanji(sc.nextDouble());
				System.out.println("则学习委员的总成绩为： "+xw[x].sum());
				System.out.println("学习委员的测评成绩为： "+xw[x].testScore());
				x++;
				break;
			case 4:
				boolean cha=true;
				while(cha)
				{
					System.out.println("普通学生选1\n班长选2\n学习委员选3\n所有学生选4\n退出选0\n");
					System.out.println("请输入你想要查看的学生的成绩");					
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
						System.out.println("普通学生的成绩为：");
						for(int i=0;i<pt;i++)
						{
							System.out.println(student[i].toString());
						}
						System.out.println("班长的成绩为：");
						for(int i=0;i<b;i++)
						{
							System.out.println(bz[i].toString());
						}
						System.out.println("学习委员的成绩为：");
						for(int i=0;i<x;i++) 
						{
							System.out.print(xw[i].toString());
						}
						break;
					case 0:
						cha=false;
						System.out.println("退出查看");
						break;
					default:
						System.out.println("请输入正确的选择：");
						break;
					}					
				}
				break;
			case 0:
				pan=false;
				System.out.println("谢谢使用。");
				break;
			default:
				System.out.println("请输入正确的选择!!!");
				break;	
			}
		}
		sc.close();
	}

}
