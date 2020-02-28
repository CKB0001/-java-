

public class JieCheng {
public int Jie(int n) 
{
	if(n==0) 
	{
		return(1);
	}
	else 
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum*=i;
			
		}
		return(sum);
	}
}
}
