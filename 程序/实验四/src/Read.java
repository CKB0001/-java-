import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Read {
	public static String readString()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String string="";
		try 
		{
			string=br.readLine();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		return string;
	}
	public static int readInt()
	{
		return Integer.parseInt(readString());
	}
	public static double readDouble()
	{
		return Double.parseDouble(readString());
	}
	
	
}
