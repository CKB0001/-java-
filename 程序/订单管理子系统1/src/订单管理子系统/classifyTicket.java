package ����������ϵͳ;

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
}
