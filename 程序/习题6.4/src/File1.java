import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException{
		// TODO �Զ����ɵķ������
		String name="D:\\ѧϰ\\java\\����\\ϰ��6.4\\src\\001.txt";
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
		System.out .println("ʱ��Ϊ��"+(end-start)+"����");
		fi.close();
	}

}
