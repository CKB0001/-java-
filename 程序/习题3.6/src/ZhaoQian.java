
public class ZhaoQian {
public void zhao(double q,double w) 
{
	
	/*int ly=0,y=0,wj=0,yj=0,wf=0,lf=0,yf=0;*/	
	int a[]= {0,0,0,0,0,0,0};
	double e[]= {2,1,0.5,0.1,0.05,0.02,0.01};		
	q=(double)Math.round((q-w)*100)/100;	
	for(int i=0;i<7;i++) 
	{
		while(q>=e[i])
		{
			a[i]++;
			q=(double)Math.round((q-e[i])*100)/100;	
		}
	}
		/*while(q>=2)
		{
			ly++;
			q=(double)Math.round((q-2)*100)/100;		
		}
		while(q>=1)
		{
			y++;
			q=(double)Math.round((q-1)*100)/100;		
		}
		while(q>=0.5)
		{
			wj++;
			q=(double)Math.round((q-0.5)*100)/100;	
		}
		while(q>=0.1)
		{
			yj++;
			q=(double)Math.round((q-0.1)*100)/100;			
		}
		while(q>=0.05)
		{
			wf++;
			q=(double)Math.round((q-0.05)*100)/100;	
		}
		while(q>=0.02)
		{
			lf++;
			q=(double)Math.round((q-0.02)*100)/100;	
			
		}
		while(q>=0.01)
		{
			yf++;
			q=(double)Math.round((q-0.01)*100)/100;	
		}*/
		
		System.out.println("Ӧ�һ���ǮΪ");
		System.out.println("��Ԫ"+a[0]+"��");
		System.out.println("һԪ"+a[1]+"��");
		System.out.println("���"+a[2]+"��");
		System.out.println("һ��"+a[3]+"��");
		System.out.println("���"+a[4]+"��");
		System.out.println("����"+a[5]+"��");
		System.out.println("һ��"+a[6]+"��");
	
	
}
}
