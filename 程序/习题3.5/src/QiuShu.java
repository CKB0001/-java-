
public class QiuShu {
public int gys(int n, int m) 
{
	if(m!=0) 
	{
		return gys(m,n%m);
	}
	else
	{
		return(n);
	}
}
public int gbs(int n,int m,int y)
{
	return(n*m/y);
}

}
