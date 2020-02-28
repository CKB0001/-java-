import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MovieStore aStore=new MovieStore();
		Movie aMovie=new Movie("白毛女","悲剧片");
		aMovie.addActor("田华");
		aMovie.addActor("李百万");
		aMovie.addActor("陈强");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("党的女儿","教育片");
		aMovie.addActor("田华");
		aMovie.addActor("陈戈");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("红色娘子军","教育片");
		aMovie.addActor("祝希娟");
		aMovie.addActor("王心刚");
		aMovie.addActor("陈强");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("五朵金花","爱情片");
		aMovie.addActor("陈丽坤");
		aMovie.addActor("赵丹");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("上甘岭","战斗片");
		aMovie.addActor("陈强");
		aMovie.addActor("高保成");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("马路天使","喜剧片");
		aMovie.addActor("赵丹");
		aMovie.addActor("周璇");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("少林寺","武打片");
		aMovie.addActor("葛优");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("我的父亲母亲","爱情片");
		aMovie.addActor("章子怡");
		aMovie.addActor("孙红雷");
		aStore.addMovie(aMovie);
		
		aMovie=new Movie("红高粱","艺术片");
		aMovie.addActor("巩俐");
		aMovie.addActor("姜文");
		aStore.addMovie(aMovie);
		
		System.out .println("Here are the movies in"+aStore);
		aStore.listMovies();
		System.out .println();
		
		System.out .println("删除白毛女");
		aStore.removeMovie("白毛女");
		System.out .println("删除秋菊打官司");
		aStore.removeMovie("秋菊打官司");
		
		System.out .println("\n教育片");
		aStore.listMoviesOftype("教育片");
		System.out .println("爱情片");
		aStore.listMoviesOftype("爱情片");
		
		System.out .println("\n陈强的电影");
		aStore.listMoviesWithActor("陈强");
		System.out .println("\n赵丹的电影");
		aStore.listMoviesWithActor("赵丹");
		
		
		Scanner sc=new Scanner(System.in);
		
		boolean choice=true;
		while(choice)
		{
			System.out .println("1-增加\n2-演员查找\n3-删除影片\n4-类型查找\n0-退出");
			int i=sc.nextInt();
			switch(i)
			{
			case 1:
				String name1,name2;
				System.out .println("请输入影片名");
				name1=sc.next();
				System.out .println("请输入影片类型");
				name2=sc.next();
				aMovie=new Movie(name1,name2);
				
				System.out .println("请输入该电影有几个演员");
				int x=sc.nextInt();
				for(int c=0;c<x;c++)
				{
					System.out.println("请输入第"+(c+1)+"个演员");
					String name3=sc.next();
					aMovie.addActor(name3);
					aStore.addMovie(aMovie);
				}
				break;
			case 2:
				String name4;
				System.out .println("请输入查找演员的名字");
				name4=sc.next();
				aStore.listMoviesWithActor(name4);
				break;
			case 3:
				String name5;
				System.out.println("请输入删除影片的名字");
				name5=sc.next();
				aStore.removeMovie(name5);
			case 4:
				String name6;
				System.out .println("请输入查找影片的类型");
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
