import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Zhu6_6 {
	public static void main(String[] args) {
		String filename="D:\\ѧϰ\\java\\����\\ϰ��6.6\\src\\test.txt";
		int line;
		try {
				File w=new File(filename);
				w.createNewFile();
				BufferedReader in=new BufferedReader(new FileReader(w));
				line=in.read();
				while(line !=-1)
				{
					if(line >='a'&&line<'z'||line>='A'&&line<='Z') 
					{
						System.out .print((char)line);
					}
					else
						System.out .print("\n");
					line =in.read();
				}
				in.close();
			}
		catch(IOException iox) {
			System.out .println("�ļ������ɶ���"+filename);
		}
		
		
	}
}
