
public class Ckb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {8,9,4,3,5};
          int x=3,c=0;
          float avg=0,sum=0;
          for (int i=0;i<a.length;i++)
          {	  sum=sum+a[i];
        	  if(x==a[i])
        	  {System.out.println("������׼�д���"+x);
              c+=1;
              
              }
          
          }
          if(c==0)                 
        	  System.out.println("����������"+x);
          avg=sum/a.length;
          System.out.println("�������ܺ�Ϊ��"+sum);
          System.out.println("�������ƽ��ֵΪ��"+avg);
          
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
          System.out.println("���ֵΪ��"+a[a.length-1]+"��СֵΪ��"+a[0]);
	}

}

