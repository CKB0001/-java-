package shiyan2;

public class Ckb2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][]={{1,2,5,4},{5,9,5},{7,8,5,6}};
		
		int sum=0,i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		System.out.println(sum);
	}

}
