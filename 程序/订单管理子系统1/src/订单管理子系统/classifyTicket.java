package 订单管理子系统;

public class classifyTicket 
{
	ticket T[]=new ticket[1000];//全部订单
	/*T=??;*/
	int x,y,z,l;
	classifyTicket()
	{
		for(int i=0;i<1000;i++)
		{
			T[i]=new ticket();
		}
		DataAccept date=new DataAccept();
		T=date.readTxt();
		x=0;
		y=0;
		z=0;
		l=0;
		for(int i=0;i<1000;i++)
		{
			
			if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//未完成订单数量
				x++;
			if(T[i].getPay()==true&&T[i].getSccomplish()==true&&T[i].getOrderNumber()!=null)	//历史订单
				y++;
			if(T[i].getPay()==true&&T[i].getSccomplish()==false&&T[i].getOrderNumber()!=null)	//未出行订单
				z++;
			if(T[i].getPay()==true&&T[i].getCandidate()==true&&T[i].getOrderNumber()!=null)	//候补订单
				l++;
		}
	}
}
