
public class ceshi {

	public static void main(String args[]) {
		String i="201905160132";
		int q[]=new int[5];
		
		q[0]=Integer.valueOf((String)i.subSequence(0, 4));
		q[1]=Integer.valueOf((String)i.substring(4, 6));
		q[2]=Integer.valueOf((String)i.substring(6,8));
		q[3]=Integer.valueOf((String)i.substring(8,10));
		q[4]=Integer.valueOf((String)i.substring(10,12));
		for(int s=0;s<5;s++)
		{
			System.out.println(q[s]);
		}
		boolean s=true;
		String p=String.valueOf(s);
		System.out.println(p);
		int w=2;
		if(w/10<1)
		{
			String z="0"+String.valueOf(w);
			System.out.println(z);
		}
		else
		{
			String z=String.valueOf(w);
			System.out.println(z);
		}
		}
		
	
}
