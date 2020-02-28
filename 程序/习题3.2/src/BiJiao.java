

public class BiJiao {
public int Max(int x,int y,int z)
{
		if(x>y&&x>z) 
		{
			return(x);
		}
		else 
		{
			if(y>x&&y>z)
				return(y);
			else
				return(z);
		}
	
}
public int Min(int x,int y,int z)
{
		if(x<y&&x<z) 
		{
			return(x);
		}
		else 
		{
			if(y<x&&y<z)
				return(y);
			else
				return(z);
		}
	
}
}
