import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		String name="D:\\学习\\java\\程序\\习题6.4\\src\\001.txt";
		FileWriter fi=new FileWriter(name);
		String x[];
		x=new String[100000];
		for(int i=0;i<100000;i++) 
		{
			x[i]=String.valueOf((int)(Math.random()*100));
		}
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) 
		{
			fi.write(x[i]);
		}
		long end=System.currentTimeMillis();
		System.out .println("时间为："+(end-start)+"毫秒");
		fi.close();
	}

}
