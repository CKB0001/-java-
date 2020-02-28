
public class Zhu3_11 {

	public static void main(String[] args) {
		String y[]= {"Jan","feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		
		
		int num=0;
		for(String yue:y) 
		{
			num++;
			System.out.print(yue+"\t");
			if (num%6==0)
				System.out.println("\n");
		}
	}
}
