

public class ticket 
{
	private String orderNumber;//订单号
	private String trainNumber;//车次
	private String name;//乘客
	private int timeDeparture[]=new int[5]; //出发日期
	private int timeArrival[]=new int[5];//到达日期
	private int timeOrder[]=new int[5];//下单日期
	private String start;//出发点
	private String bourn;//目的地
	//private String station[]=new String[2];//站点	
	private int seat[]=new int[2];//车厢号，座位号
	private String type;//车票类型
	private boolean pay;//是否已支付
	private boolean gout;//是否已出行
	private boolean candidate;//是否为后补车票
	private boolean accomplish;//是否完成出行
	private float price;//车票价格
	
	ticket()//无参构造方法******************************************************************************************
	{
		orderNumber=null;//订单号
		trainNumber=null;//车次
		name=null;//乘客
		for(int i=0;i<4;i++)
		{
			timeDeparture[i]=0; //出发日期
			timeArrival[i]=0;//到达日期
			timeOrder[i]=0;//下单日期
		}
		for(int i=0;i<2;i++)
		{
			
			seat[i]=0;//车厢号，座位号
		}
		start=null;
		bourn=null;
		type=null;//车票类型
		pay=false;//是否已支付
		gout=false;//是否已出行
		candidate=false;//是否为后补车票
		accomplish=false;//是否完成出行
		price=0;//车票价格
		
	}
	
	//get方法************************************************************************************************
	public  String getOrderNumber()
	{
		return orderNumber;
	}//订单号
	public String getTrainNumber()
	{
		return trainNumber;
	}//车次
	public String getName()
	{
		return name;
	}//乘客
	public int[] getTimeDeparture()
	{
		return timeDeparture;
	} //出发日期
	public int[] getTimeArrival()
	{
		return timeArrival;
	}//到达日期
	public int[] getTimeOrder()
	{
		return timeOrder;
	}//下单日期
	/*public String[] getStation()
	{
		return station;
	}//站点*/
	public String getstart()
	{
		return start;
	}//出发点
	public String getbourn()
	{
		return bourn;
	}//目的地
	public int[] getSeat()
	{
		return seat;
	}//车厢号，座位号
	public String getType()
	{
		return type;
	}//车票类型
	public boolean getPay()
	{
		return pay;
	}//是否已支付
	public boolean getGout()
	{
		return gout;
	};//是否已出行
	public boolean getCandidate()
	{
		return candidate;
	}//是否为后补车票
	public boolean getSccomplish()
	{
		return accomplish;
	}//是否完成出行
	public float getPrice()
	{
		return price;
	}//车票价格
	
	//set方法******************************************************************************************************
	public void setOrderNumber(String norderNumber)
	{
		orderNumber=norderNumber;
	}//订单号
	public void setTrainNumber(String ntrainNumber)
	{
		trainNumber=ntrainNumber;
	}//车次
	public void setName(String nname)
	{
		name=nname;
	}//乘客
	public void setTimeDeparture(int[] ntimeDeparture)
	{
		timeDeparture=ntimeDeparture;
	} //出发日期
	public void setTimeArrival(int[] ntimeArrival)
	{
		timeArrival=ntimeArrival;
	}//到达日期
	public void setTimeOrder(int[] ntimeOrder)
	{
		timeOrder=ntimeOrder;
	}//下单日期
	/*public void setStation(String[] nstation)
	{
		station=nstation;
	}//站点*/
	public void setstart(String nstart)	
	{
		start=nstart;
	}//出发点
	public void setbourn(String nbourn)
	{
		bourn=nbourn;
	}//目的地
	public void setSeat(int[] nseat)
	{
		seat=nseat;
	}//车厢号，座位号
	public void setType(String ntype)
	{
		type=ntype;
	}//车票类型
	public void setPay(boolean npay)
	{
		pay=npay;
	}//是否已支付
	public void setGout(boolean ngout)
	{
		gout=ngout;
	};//是否已出行
	public void setCandidate(boolean nncandidate)
	{
		candidate=nncandidate;
	}//是否为后补车票
	public void setSccomplish(boolean naccomplish)
	{
		accomplish=naccomplish;
	}//是否完成出行
	public void setPrice(float nprice)
	{
		price=nprice;
	}//车票价格
	public String toString()
	{
		return orderNumber+"\n"+trainNumber+"\n"+name+"\n"+timeDeparture[0]+"\n"+timeArrival[0]+"\n"+timeOrder[0]+"\n"+start+"\n"+bourn+"\n"+seat[0]+"\n"+type+"\n"+pay+"\n"+gout+"\n"+candidate+"\n"+accomplish+"\n"+price+"\n";
	}
}
