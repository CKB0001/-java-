import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MovieStore aStore=new MovieStore();
		Movie aMovie=new Movie("��ëŮ","����Ƭ");
		aMovie.addActor("�ﻪ");
		aMovie.addActor("�����");
		aMovie.addActor("��ǿ");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("����Ů��","����Ƭ");
		aMovie.addActor("�ﻪ");
		aMovie.addActor("�¸�");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("��ɫ���Ӿ�","����Ƭ");
		aMovie.addActor("ףϣ��");
		aMovie.addActor("���ĸ�");
		aMovie.addActor("��ǿ");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("����","����Ƭ");
		aMovie.addActor("������");
		aMovie.addActor("�Ե�");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("�ϸ���","ս��Ƭ");
		aMovie.addActor("��ǿ");
		aMovie.addActor("�߱���");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("��·��ʹ","ϲ��Ƭ");
		aMovie.addActor("�Ե�");
		aMovie.addActor("���");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("������","���Ƭ");
		aMovie.addActor("����");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("�ҵĸ���ĸ��","����Ƭ");
		aMovie.addActor("������");
		aMovie.addActor("�����");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("�����","����Ƭ");
		aMovie.addActor("����");
		aMovie.addActor("����");
		aStore.addMovie(aMovie);
		
		System.out .println("Here are the movies in"+aStore);
		aStore.listMovies();
		System.out .println();
		
		System.out .println("ɾ����ëŮ");
		aStore.removeMovie("��ëŮ");
		System.out .println("ɾ����մ��˾");
		aStore.removeMovie("��մ��˾");
		
		System.out .println("\n����Ƭ");
		aStore.listMoviesOftype("����Ƭ");
		System.out .println("����Ƭ");
		aStore.listMoviesOftype("����Ƭ");
		
		System.out .println("\n��ǿ�ĵ�Ӱ");
		aStore.listMoviesWithActor("��ǿ");
		System.out .println("\n�Ե��ĵ�Ӱ");
		aStore.listMoviesWithActor("�Ե�");
		
		
		Scanner sc=new Scanner(System.in);
		
		boolean choice=true;
		while(choice)
		{
			System.out .println("1-����\n2-��Ա����\n3-ɾ��ӰƬ\n4-���Ͳ���\n0-�˳�");
			int i=sc.nextInt();
			switch(i)
			{
			case 1:
				String name1,name2;
				System.out .println("������ӰƬ��");
				name1=sc.next();
				System.out .println("������ӰƬ����");
				name2=sc.next();
				aMovie=new Movie(name1,name2);
				
				System.out .println("������õ�Ӱ�м�����Ա");
				int x=sc.nextInt();
				for(int c=0;c<x;c++)
				{
					System.out.println("�������"+(c+1)+"����Ա");
					String name3=sc.next();
					aMovie.addActor(name3);
					aStore.addMovie(aMovie);
				}
				break;
			case 2:
				String name4;
				System.out .println("�����������Ա������");
				name4=sc.next();
				aStore.listMoviesWithActor(name4);
				break;
			case 3:
				String name5;
				System.out.println("������ɾ��ӰƬ������");
				name5=sc.next();
				aStore.removeMovie(name5);
			case 4:
				String name6;
				System.out .println("���������ӰƬ������");
				name6=sc.next();
				aStore.listMoviesOftype(name6);
				break;
			case 0:
				choice=false;
				break;
			}
		}
		sc.close();
		
		
	}

	
}
