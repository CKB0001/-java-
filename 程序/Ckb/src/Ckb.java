
public class Ckb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {8,9,4,3,5};
          int x=3,c=0;
          float avg=0,sum=0;
          for (int i=0;i<a.length;i++)
          {	  sum=sum+a[i];
        	  if(x==a[i])
        	  {System.out.println("该数组准中存在"+x);
              c+=1;
              
              }
          
          }
          if(c==0)                 
        	  System.out.println("该数组中无"+x);
          avg=sum/a.length;
          System.out.println("该数组总和为："+sum);
          System.out.println("该数组的平均值为："+avg);
          
          for (int q=0;q<a.length;q++)
          {
        	  for(int y=0;y<a.length-1;y++)
        	  {
        		  if(a[y]>a[y+1])
        		  {
        			  int t=a[y];
        			  a[y]=a[y+1];
        			  a[y+1]=t;
        		  }
        		  
        	  }
          }
          for(int w=0;w<a.length;w++)
        	  System.out.print(a[w]+",");
          System.out.println("最大值为："+a[a.length-1]+"最小值为："+a[0]);
	}

}

