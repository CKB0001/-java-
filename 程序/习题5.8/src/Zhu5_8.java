import java.util.Scanner;

public class Zhu5_8 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		Student student[]=new Student[5];
		StudentXW xw=new StudentXW();
		StudentBZ bz=new StudentBZ();
		student[3]=(Student)xw;
		student[4]=(Student)bz;
		System.out.println("请输入普通学生的信息");
		for(int i=0;i<3;i++)
		{	System.out.println("请输入第"+(i+1)+"个普通学生的信息");
			student[i]=new Student();
			System.out.println("请输入学生的学号");
			student[i].setxuehao(sc.nextInt());
			System.out.println("请输入学生的姓名");
			student[i].setname(sc.next());
			System.out.println("请输入学生的数学成绩");
			student[i].setshuxue(sc.nextDouble());
			System.out.println("请输入学生的英语成绩");
			student[i].setyingyu(sc.nextDouble());
			System.out.println("请输入学生的计算机成绩");
			student[i].setjisuanji(sc.nextDouble());			
		}
		System.out.println("请输入学习委员的信息");
			System.out.println("请输入学习委员的学号");
			xw.setxuehao(sc.nextInt());
			System.out.println("请输入学习委员的姓名");
			xw.setname(sc.next());
			System.out.println("请输入学习委员的数学成绩");
			xw.setshuxue(sc.nextDouble());
			System.out.println("请输入学习委员的英语成绩");
			xw.setyingyu(sc.nextDouble());
			System.out.println("请输入学习委员的计算机成绩");
			xw.setjisuanji(sc.nextDouble());
		System.out.println("请输入班长的信息");	
			System.out.println("请输入班长的学号");
			bz.setxuehao(sc.nextInt());
			System.out.println("请输入班长的姓名");
			bz.setname(sc.next());
			System.out.println("请输入班长的数学成绩");
			bz.setshuxue(sc.nextDouble());
			System.out.println("请输入班长的英语成绩");
			bz.setyingyu(sc.nextDouble());
			System.out.println("请输入班长的计算机成绩");
			bz.setjisuanji(sc.nextDouble());
		System.out.println("则他们的测评成绩为：");	
		for(int i=0;i<3;i++) 
		{System.out.print(student[i].xuehao+"  "+student[i].name+"的测评成绩为： ");	
			System.out.println(student[i].testScore());
		}
		System.out.print("班长  "+bz.xuehao +"  "+bz.name+"的测评成绩为： ");
		 System.out .println(bz.testScore());
		System.out.print("学习委员  "+xw.xuehao +"  "+xw.name+"的测评成绩为： ");
		 System.out .println(xw.testScore());
	sc.close();
	}

}
