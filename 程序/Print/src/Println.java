import java.util.Scanner;

public class Println {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		Boolean b=true;
		while(b)
		{
			
			char s=sc.next().charAt(0);
			if(s=='\n')
			{
				b=false;
//				System.out.println("fewfwqqew");
			}
			else
			{
				System.out.print(s);
			}
		}
		sc.close();
	}
}
