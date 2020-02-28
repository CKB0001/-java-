

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
	String unfinishedTicket()
	{
		String s="";
		if(x!=0)
		{		
			int xx=0;
			ticket t[]=new ticket[x];	
			for(int i=0;i<x;i++)
				t[i]=new ticket();	
			for(int i=0;i<1000;i++)
			{
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)  //未完成车票
				{
					t[xx]=T[i];
					xx++;
				}
			}
			for(int i=0;i<x;i++)	
			{
				s=s+"订单号："+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"站-"+t[i].getbourn()+"站\n"+
				  " 发车时间："+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"开"+"\n"			 					
				  +" 乘客："+t[i].getName()+" "+t[i].getSeat()[0]+"车厢"+t[i].getSeat()[1]+"坐"+"\n";		
			} 
		}
		else 
			s="无票！";
		return s;
	}
	String histiryTicket()
	{
		int yy=0;
		String s="";
		if(y!=0)
		{		
			ticket t[]=new ticket[y];
			for(int i=0;i<1000;i++)
			{
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//历史车票	
				{
					t[yy]=T[i];
					yy++;
				}
			}	
			for(int i=0;i<y;i++)		
			{		
				s=s+"订单号："+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"站-"+t[i].getbourn()+"站\n"+		
				  " 发车时间："+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"开"+"\n"		
				  +" 乘客："+t[i].getName()+" "+t[i].getSeat()[0]+"车厢"+t[i].getSeat()[1]+"坐"+"\n";	
			} 		
		}
		else 
			s="无票！";
		return s;
	}
	String untrivialTicket()
	{
		int zz=0;
		String s="";
		if(z!=0)
		{		
			ticket t[]=new ticket[z];
			for(int i=0;i<1000;i++)
			{
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//历史车票	
				{
					t[zz]=T[i];
					zz++;
				}
			}	
			for(int i=0;i<z;i++)
			{		
				s=s+"订单号："+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"站-"+t[i].getbourn()+"站\n";	
				s=s+" 发车时间："+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"开"+"\n";		
				s=s+" 乘客："+t[i].getName()+" "+t[i].getSeat()[0]+"车厢"+t[i].getSeat()[1]+"坐"+"\n";		
			} 
		}
		else 
			s="无票！";
		return s;
	}
	String candidateTicket()
	{
		int ll=0;
		String s="";
		if(l!=0)
		{		
			ticket t[]=new ticket[z];	
			for(int i=0;i<1000;i++)
			{
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//历史车票	
				{
					t[ll]=T[i];
					ll++;
				}
			}	
			for(int i=0;i<l;i++)		
			{		
				s=s+"订单号："+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"站-"+t[i].getbourn()+"站\n"+		
					" 发车时间："+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"开"+"\n"		
					+" 乘客："+t[i].getName()+" "+t[i].getSeat()[0]+"车厢"+t[i].getSeat()[1]+"坐"+"\n";		
			} 		
		}	
		else 
			s="无票！";
		return s;
	}
	
	
}
