

public class classifyTicket 
{
	ticket T[]=new ticket[1000];//ȫ������
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
			
			if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//δ��ɶ�������
				x++;
			if(T[i].getPay()==true&&T[i].getSccomplish()==true&&T[i].getOrderNumber()!=null)	//��ʷ����
				y++;
			if(T[i].getPay()==true&&T[i].getSccomplish()==false&&T[i].getOrderNumber()!=null)	//δ���ж���
				z++;
			if(T[i].getPay()==true&&T[i].getCandidate()==true&&T[i].getOrderNumber()!=null)	//�򲹶���
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
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)  //δ��ɳ�Ʊ
				{
					t[xx]=T[i];
					xx++;
				}
			}
			for(int i=0;i<x;i++)	
			{
				s=s+"�����ţ�"+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"վ-"+t[i].getbourn()+"վ\n"+
				  " ����ʱ�䣺"+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"��"+"\n"			 					
				  +" �˿ͣ�"+t[i].getName()+" "+t[i].getSeat()[0]+"����"+t[i].getSeat()[1]+"��"+"\n";		
			} 
		}
		else 
			s="��Ʊ��";
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
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//��ʷ��Ʊ	
				{
					t[yy]=T[i];
					yy++;
				}
			}	
			for(int i=0;i<y;i++)		
			{		
				s=s+"�����ţ�"+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"վ-"+t[i].getbourn()+"վ\n"+		
				  " ����ʱ�䣺"+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"��"+"\n"		
				  +" �˿ͣ�"+t[i].getName()+" "+t[i].getSeat()[0]+"����"+t[i].getSeat()[1]+"��"+"\n";	
			} 		
		}
		else 
			s="��Ʊ��";
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
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//��ʷ��Ʊ	
				{
					t[zz]=T[i];
					zz++;
				}
			}	
			for(int i=0;i<z;i++)
			{		
				s=s+"�����ţ�"+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"վ-"+t[i].getbourn()+"վ\n";	
				s=s+" ����ʱ�䣺"+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"��"+"\n";		
				s=s+" �˿ͣ�"+t[i].getName()+" "+t[i].getSeat()[0]+"����"+t[i].getSeat()[1]+"��"+"\n";		
			} 
		}
		else 
			s="��Ʊ��";
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
				if(T[i].getPay()==false&&T[i].getOrderNumber()!=null)	//��ʷ��Ʊ	
				{
					t[ll]=T[i];
					ll++;
				}
			}	
			for(int i=0;i<l;i++)		
			{		
				s=s+"�����ţ�"+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"վ-"+t[i].getbourn()+"վ\n"+		
					" ����ʱ�䣺"+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"��"+"\n"		
					+" �˿ͣ�"+t[i].getName()+" "+t[i].getSeat()[0]+"����"+t[i].getSeat()[1]+"��"+"\n";		
			} 		
		}	
		else 
			s="��Ʊ��";
		return s;
	}
	
	
}
