
public class SuiJiShu {
	int num=0,mx,mn;
public int max(int n,int m)

{
	if(n>m) 
		
		return(n);
	else 

		return(m);
}

public int min(int n,int m)
{
	if(n<m)
		return n;
	else 
		return m;
}
public int jishu(int n)
{
	if(n>50)
		num++;
	return num;
}

}

