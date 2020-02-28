package ∑÷÷ß1;
import java.io.*;
public class Wenjian {
public  void print(File file)
{
	if(file.isDirectory()) 
	{
		File result[]=file.listFiles();
		if(result!=null)
		{
			for(int x=0;x<result.length;x++)
			{
				print(result[x]);
			}
		}
	}
	System.out .println(file);
}

}
