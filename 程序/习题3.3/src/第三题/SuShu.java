package µÚÈıÌâ;

public class SuShu {

	public void sushu()
	{  
		int i,x,m=0;
		
		for(x=1;x<=100;x=x+1) 
		{
			double k=Math.sqrt(x);
			k=(int)k;
			for( i=2;i<=k;i++) 
			
				if(x%i==0) 
					break;
			 
			if(i>=k+1)			
			 {
				System.out.print(x+"\t");
				m=m+1;
				if(m%5==0)
					System.out.println();
			 }
			
		}
		
	}
}
