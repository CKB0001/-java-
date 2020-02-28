
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 数据接收
 */
public class DataAccept {
	/*int orderNumber;//订单号
	String trainNumber;//车次
	String name;//乘客
	int timeDeparture[]=new int[4]; //出发日期
	int timeArrival[]=new int[4];//到达日期
	int timeOrder[]=new int[4];//下单日期
	String station[]=new String[2];//站点
	int seat[]=new int[2];//车厢号，座位号
	String type;//车票类型
	boolean pay;//是否已支付
	boolean gout;//是否已出行
	boolean candidate;//是否为后补车票
	boolean accomplish;//是否完成出行
	float price;//车票价格*/
	private String filename="D:\\ticket.txt";
	private int[] Date(String chu)//日期转换将String转化为整形数组
	{
		int date[]=new int[5];
		date[0]=Integer.valueOf((String)chu.subSequence(0, 4));
		date[1]=Integer.valueOf((String)chu.substring(4, 6));
		date[2]=Integer.valueOf((String)chu.substring(6,8));
		date[3]=Integer.valueOf((String)chu.substring(8,10));
		date[4]=Integer.valueOf((String)chu.substring(10,12));
		return date;
	}
	private int[] Seat(String che)//车厢座位号处理将String转化为整形数组
	{
		int seat[]=new int[2];
		seat[0]=Integer.valueOf((String)che.substring(0,2));
		seat[1]=Integer.valueOf((String)che.substring(2,4));
		return seat;
	}
	private String DS(int[] a)//将数组转换为String
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
	private String SS(int[] zhan)//车厢座位号处理将整形数组转换为String
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
	public ticket[] readTxt()//将文件中的属性读入到一个ticket的对象数组中
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
				chepiao[s].setOrderNumber(q[w]);//订单号
				chepiao[s].setTrainNumber(q[w+1]);//车次
				chepiao[s].setName(q[w+2]);//乘客
				//对日期处理
				int chutime[]=new int[5];
				chutime=this.Date(q[w+3]);
				chepiao[s].setTimeDeparture(chutime);//出发日期
				int daotime[]=new int[5];
				daotime=this.Date(q[w+4]);
				chepiao[s].setTimeArrival(daotime);//到达日期
				int xiatime[]=new int[5];
				xiatime=this.Date(q[w+5]);
				chepiao[s].setTimeOrder(xiatime);//下单日期
				chepiao[s].setstart(q[w+6]);//出发点
				chepiao[s].setbourn(q[w+7]);//目的地
				int che[]=new int[2];
				che=this.Seat(q[w+8]);
				chepiao[s].setSeat(che);//车厢号，座位号
				chepiao[s].setType(q[w+9]);//车票类型
				boolean pay=q[w+10].equals("true");
				chepiao[s].setPay(pay);//是否已支付
				boolean gout=q[w+11].equals("true");
				chepiao[s].setGout(gout);//是否已出行
				boolean can=q[w+12].equals("true");
				chepiao[s].setCandidate(can);//是否为候补车票
				boolean xin=q[w+13].equals("true");
				chepiao[s].setSccomplish(xin);
				chepiao[s].setPrice(Float.valueOf(q[w+14]));//车票价格
				w=w+15;		
			}
			
			t.close();
			nchepiao=chepiao;
			
			
		}
		catch(IOException iox)
		{
			System.out .println("文件读取失败");
		}
		return nchepiao;
		
	}
	public void Delete(String dindanhao)//根据订单号删除
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
				
		try //将对象数组存入文件中
		{
			BufferedWriter out=new BufferedWriter(new FileWriter(filename));
			for(int i=0;p[i].getName()!=null;i++) 
			{
				out.write(p[i].getOrderNumber());//订单号
				out.newLine();
				out.write(p[i].getTrainNumber());//车次
				out.newLine();
				out.write(p[i].getName());//乘客
				out.newLine();
				int s[]=new int[5];
				s=p[i].getTimeDeparture();//出发日期
				out.write(this.DS(s));
				out.newLine();
				s=p[i].getTimeArrival();//到达日期
				out.write(this.DS(s));
				out.newLine();
				s=p[i].getTimeOrder();//下单日期
				out.write(this.DS(s));
				out.newLine();
				out.write(p[i].getstart());//出发点
				out.newLine();
				out.write(p[i].getbourn());//目的地
				out.newLine();
				int s2[]=new int[2];
				s2=p[i].getSeat();//车厢号，座位号
				out.write(this.SS(s2));
				out.newLine();
				out.write(p[i].getType());//车票类型
				out.newLine();
				out.write(String.valueOf(p[i].getPay()));//是否支付
				out.newLine();
				out.write(String.valueOf(p[i].getGout()));//是否出行
				out.newLine();
				out.write(String.valueOf(p[i].getCandidate()));//是否为候补车票
				out.newLine();
				out.write(String.valueOf(p[i].getSccomplish()));//是否完成出行
				out.newLine();
				out.write(String.valueOf(p[i].getPrice()));//车票价格
				out.newLine();
				
			}
			out.close();
		}
		catch (IOException iox)
		{
		System.out.println("文件删除错误");
		}
		
	}
}