

public class ticket 
{
	private String orderNumber;//������
	private String trainNumber;//����
	private String name;//�˿�
	private int timeDeparture[]=new int[5]; //��������
	private int timeArrival[]=new int[5];//��������
	private int timeOrder[]=new int[5];//�µ�����
	private String start;//������
	private String bourn;//Ŀ�ĵ�
	//private String station[]=new String[2];//վ��	
	private int seat[]=new int[2];//����ţ���λ��
	private String type;//��Ʊ����
	private boolean pay;//�Ƿ���֧��
	private boolean gout;//�Ƿ��ѳ���
	private boolean candidate;//�Ƿ�Ϊ�󲹳�Ʊ
	private boolean accomplish;//�Ƿ���ɳ���
	private float price;//��Ʊ�۸�
	
	ticket()//�޲ι��췽��******************************************************************************************
	{
		orderNumber=null;//������
		trainNumber=null;//����
		name=null;//�˿�
		for(int i=0;i<4;i++)
		{
			timeDeparture[i]=0; //��������
			timeArrival[i]=0;//��������
			timeOrder[i]=0;//�µ�����
		}
		for(int i=0;i<2;i++)
		{
			
			seat[i]=0;//����ţ���λ��
		}
		start=null;
		bourn=null;
		type=null;//��Ʊ����
		pay=false;//�Ƿ���֧��
		gout=false;//�Ƿ��ѳ���
		candidate=false;//�Ƿ�Ϊ�󲹳�Ʊ
		accomplish=false;//�Ƿ���ɳ���
		price=0;//��Ʊ�۸�
		
	}
	
	//get����************************************************************************************************
	public  String getOrderNumber()
	{
		return orderNumber;
	}//������
	public String getTrainNumber()
	{
		return trainNumber;
	}//����
	public String getName()
	{
		return name;
	}//�˿�
	public int[] getTimeDeparture()
	{
		return timeDeparture;
	} //��������
	public int[] getTimeArrival()
	{
		return timeArrival;
	}//��������
	public int[] getTimeOrder()
	{
		return timeOrder;
	}//�µ�����
	/*public String[] getStation()
	{
		return station;
	}//վ��*/
	public String getstart()
	{
		return start;
	}//������
	public String getbourn()
	{
		return bourn;
	}//Ŀ�ĵ�
	public int[] getSeat()
	{
		return seat;
	}//����ţ���λ��
	public String getType()
	{
		return type;
	}//��Ʊ����
	public boolean getPay()
	{
		return pay;
	}//�Ƿ���֧��
	public boolean getGout()
	{
		return gout;
	};//�Ƿ��ѳ���
	public boolean getCandidate()
	{
		return candidate;
	}//�Ƿ�Ϊ�󲹳�Ʊ
	public boolean getSccomplish()
	{
		return accomplish;
	}//�Ƿ���ɳ���
	public float getPrice()
	{
		return price;
	}//��Ʊ�۸�
	
	//set����******************************************************************************************************
	public void setOrderNumber(String norderNumber)
	{
		orderNumber=norderNumber;
	}//������
	public void setTrainNumber(String ntrainNumber)
	{
		trainNumber=ntrainNumber;
	}//����
	public void setName(String nname)
	{
		name=nname;
	}//�˿�
	public void setTimeDeparture(int[] ntimeDeparture)
	{
		timeDeparture=ntimeDeparture;
	} //��������
	public void setTimeArrival(int[] ntimeArrival)
	{
		timeArrival=ntimeArrival;
	}//��������
	public void setTimeOrder(int[] ntimeOrder)
	{
		timeOrder=ntimeOrder;
	}//�µ�����
	/*public void setStation(String[] nstation)
	{
		station=nstation;
	}//վ��*/
	public void setstart(String nstart)	
	{
		start=nstart;
	}//������
	public void setbourn(String nbourn)
	{
		bourn=nbourn;
	}//Ŀ�ĵ�
	public void setSeat(int[] nseat)
	{
		seat=nseat;
	}//����ţ���λ��
	public void setType(String ntype)
	{
		type=ntype;
	}//��Ʊ����
	public void setPay(boolean npay)
	{
		pay=npay;
	}//�Ƿ���֧��
	public void setGout(boolean ngout)
	{
		gout=ngout;
	};//�Ƿ��ѳ���
	public void setCandidate(boolean nncandidate)
	{
		candidate=nncandidate;
	}//�Ƿ�Ϊ�󲹳�Ʊ
	public void setSccomplish(boolean naccomplish)
	{
		accomplish=naccomplish;
	}//�Ƿ���ɳ���
	public void setPrice(float nprice)
	{
		price=nprice;
	}//��Ʊ�۸�
	public String toString()
	{
		return orderNumber+"\n"+trainNumber+"\n"+name+"\n"+timeDeparture[0]+"\n"+timeArrival[0]+"\n"+timeOrder[0]+"\n"+start+"\n"+bourn+"\n"+seat[0]+"\n"+type+"\n"+pay+"\n"+gout+"\n"+candidate+"\n"+accomplish+"\n"+price+"\n";
	}
}
