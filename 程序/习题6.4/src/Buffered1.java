import java.io.*;
import java.io.IOException;
public class Buffered1 {
	public static void main(String[] args) throws IOException{
		String name="D:\\ѧϰ\\java\\����\\ϰ��6.4\\src\\002.txt";
		BufferedWriter out=new BufferedWriter(new FileWriter(name));
		String x[];
		x=new String[100000];
		for(int i=0;i<100000;i++) 
		{
			x[i]=String.valueOf((int)(Math.random()*100));
		}
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) 
		{
			out.write(x[i]);
		}
		long end=System.currentTimeMillis();
		System.out .println("ʱ��Ϊ��"+(end-start)+"����");
		out.close();
	}
}
