
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * ���ݽ���
 */
public class DataAccept {
	/*int orderNumber;//������
	String trainNumber;//����
	String name;//�˿�
	int timeDeparture[]=new int[4]; //��������
	int timeArrival[]=new int[4];//��������
	int timeOrder[]=new int[4];//�µ�����
	String station[]=new String[2];//վ��
	int seat[]=new int[2];//����ţ���λ��
	String type;//��Ʊ����
	boolean pay;//�Ƿ���֧��
	boolean gout;//�Ƿ��ѳ���
	boolean candidate;//�Ƿ�Ϊ�󲹳�Ʊ
	boolean accomplish;//�Ƿ���ɳ���
	float price;//��Ʊ�۸�*/
	private String filename="D:\\ticket.txt";
	private int[] Date(String chu)//����ת����Stringת��Ϊ��������
	{
		int date[]=new int[5];
		date[0]=Integer.valueOf((String)chu.subSequence(0, 4));
		date[1]=Integer.valueOf((String)chu.substring(4, 6));
		date[2]=Integer.valueOf((String)chu.substring(6,8));
		date[3]=Integer.valueOf((String)chu.substring(8,10));
		date[4]=Integer.valueOf((String)chu.substring(10,12));
		return date;
	}
	private int[] Seat(String che)//������λ�Ŵ���Stringת��Ϊ��������
	{
		int seat[]=new int[2];
		seat[0]=Integer.valueOf((String)che.substring(0,2));
		seat[1]=Integer.valueOf((String)che.substring(2,4));
		return seat;
	}
	private String DS(int[] a)//������ת��ΪString
	{
		String q="";
		String s[]=new String[5];
		for(int i=0;i<5;i++) 
		{
			if(a[i]/10<1)
			{
				s[i]="0"+String.valueOf(a[i]);
			}
			else
			{
				s[i]=String.valueOf(a[i]);
			}
			q=q+s[i];
		}
		
		return q;
	}
	private String SS(int[] zhan)//������λ�Ŵ�����������ת��ΪString
	{
		String q="";
		String s[]=new String[2];
		for(int i=0;i<2;i++)
		{
			if(zhan[i]/10<1)
			{
				s[i]="0"+String.valueOf(zhan[i]);
			}
			else
			{
				s[i]=String.valueOf(zhan[i]);
			}
			q=q+s[i];
		}
		return q;
	}
	public ticket[] readTxt()//���ļ��е����Զ��뵽һ��ticket�Ķ���������
	{
		ticket[] nchepiao=new ticket[1000];
		for(int i=0;i<1000;i++)
		{
			nchepiao[i]=new ticket();
		}
		try 
		{	
			ticket[] chepiao=new ticket[1000];
			for(int i=0;i<1000;i++)
			{
				chepiao[i]=new ticket();
			}
			int i=0;
			
			BufferedReader t=new BufferedReader(new FileReader(filename));
			String line=t.readLine();
			String q[]=new String[1000];
			
			while(line!=null) 
			{
				q[i]=line;
				i++;
				line=t.readLine();
			}	
			
			for(int w=0,s=0;q[w]!=null;s++)
			{ 
				chepiao[s]=new ticket();
				chepiao[s].setOrderNumber(q[w]);//������
				chepiao[s].setTrainNumber(q[w+1]);//����
				chepiao[s].setName(q[w+2]);//�˿�
				//�����ڴ���
				int chutime[]=new int[5];
				chutime=this.Date(q[w+3]);
				chepiao[s].setTimeDeparture(chutime);//��������
				int daotime[]=new int[5];
				daotime=this.Date(q[w+4]);
				chepiao[s].setTimeArrival(daotime);//��������
				int xiatime[]=new int[5];
				xiatime=this.Date(q[w+5]);
				chepiao[s].setTimeOrder(xiatime);//�µ�����
				chepiao[s].setstart(q[w+6]);//������
				chepiao[s].setbourn(q[w+7]);//Ŀ�ĵ�
				int che[]=new int[2];
				che=this.Seat(q[w+8]);
				chepiao[s].setSeat(che);//����ţ���λ��
				chepiao[s].setType(q[w+9]);//��Ʊ����
				boolean pay=q[w+10].equals("true");
				chepiao[s].setPay(pay);//�Ƿ���֧��
				boolean gout=q[w+11].equals("true");
				chepiao[s].setGout(gout);//�Ƿ��ѳ���
				boolean can=q[w+12].equals("true");
				chepiao[s].setCandidate(can);//�Ƿ�Ϊ�򲹳�Ʊ
				boolean xin=q[w+13].equals("true");
				chepiao[s].setSccomplish(xin);
				chepiao[s].setPrice(Float.valueOf(q[w+14]));//��Ʊ�۸�
				w=w+15;		
			}
			
			t.close();
			nchepiao=chepiao;
			
			
		}
		catch(IOException iox)
		{
			System.out .println("�ļ���ȡʧ��");
		}
		return nchepiao;
		
	}
	public void Delete(String dindanhao)//���ݶ�����ɾ��
	{
		ticket p[]=new ticket[1000];
		p=this.readTxt();
		int num=0;
		
		for(int i=0;p[i].getName()!=null;i++)
		{
			
			if(p[i].getOrderNumber().equals(dindanhao))
			{
				num=i;
				
			for(;p[num].getName()!=null;num++)
			{
				p[num]=p[num+1];
			}
			}
		}
				
		try //��������������ļ���
		{
			BufferedWriter out=new BufferedWriter(new FileWriter(filename));
			for(int i=0;p[i].getName()!=null;i++) 
			{
				out.write(p[i].getOrderNumber());//������
				out.newLine();
				out.write(p[i].getTrainNumber());//����
				out.newLine();
				out.write(p[i].getName());//�˿�
				out.newLine();
				int s[]=new int[5];
				s=p[i].getTimeDeparture();//��������
				out.write(this.DS(s));
				out.newLine();
				s=p[i].getTimeArrival();//��������
				out.write(this.DS(s));
				out.newLine();
				s=p[i].getTimeOrder();//�µ�����
				out.write(this.DS(s));
				out.newLine();
				out.write(p[i].getstart());//������
				out.newLine();
				out.write(p[i].getbourn());//Ŀ�ĵ�
				out.newLine();
				int s2[]=new int[2];
				s2=p[i].getSeat();//����ţ���λ��
				out.write(this.SS(s2));
				out.newLine();
				out.write(p[i].getType());//��Ʊ����
				out.newLine();
				out.write(String.valueOf(p[i].getPay()));//�Ƿ�֧��
				out.newLine();
				out.write(String.valueOf(p[i].getGout()));//�Ƿ����
				out.newLine();
				out.write(String.valueOf(p[i].getCandidate()));//�Ƿ�Ϊ�򲹳�Ʊ
				out.newLine();
				out.write(String.valueOf(p[i].getSccomplish()));//�Ƿ���ɳ���
				out.newLine();
				out.write(String.valueOf(p[i].getPrice()));//��Ʊ�۸�
				out.newLine();
				
			}
			out.close();
		}
		catch (IOException iox)
		{
		System.out.println("�ļ�ɾ������");
		}
		
	}
}