
public class PeiXu {
	People s=new People();
	
	public void peixu(People p[],int num)
	{
		for (int i=0; i<num-1;i++)
		{
			for (int j=0;j<num-1-i;j++)
			{
				if(p[j].getHeight()>p[j+1].getHeight())
				{
					s=p[j];
					p[j]=p[j+1];
					p[j+1]=s;
				}
			}
		}
		for (int i=0;i<num;i++)
		{
			System.out.println(p[i].toString());
		}
	}
}
