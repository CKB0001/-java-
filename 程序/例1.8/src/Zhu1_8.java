
public class Zhu1_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m[][];
		m=new int [5][10];
		int t=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j]=i*10+j;
				
			}
		}
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				t+=m[i][j];
			}
		}
		for(int a[]:m)
		{
			for(int i:a)
			System.out.println(i);
		}
		System.out.println("The sum is:"+t);
	}

}
