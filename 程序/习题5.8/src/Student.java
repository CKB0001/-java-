
public class Student {
	int xuehao;//ѧ��
	String name;//����
	double yingyu;//Ӣ��ɼ�
	double shuxue;//��ѧ�ɼ�
	double jisuanji;//������ɼ�
	double num;//�ܳɼ�
	public Student()
	{
		xuehao=0;
		name="";
		yingyu=0;
		shuxue=0;
		jisuanji=0;
		num=0;		
	}
	public String toString() 
	{
		return("ѧ��:"+xuehao+"\t����:"+name+"\tӢ��ɼ�:"+yingyu+"\t��ѧ�ɼ�:"+shuxue+"\t������ɼ�:"+jisuanji+"\t�ܳɼ�:"+num+"\t�����ɼ���"+testScore());
	}
	public int compare(double num1,double num2)//�Ƚϳɼ�
	{
		if(num1>num2) 
			return(1);
		else if(num1==num2)
			return(0);
			else
				return(-1);
	}
	public double sum()//�ܳɼ�
	{
		num=yingyu+shuxue+jisuanji;
		return(num);
	}
	public int getxuehao()
	{
		return(xuehao);
	}
	public String getname()
	{
		return(name);
	}
	public double getyingyu()
	{
		return(yingyu);
	}
	public double getshuxue()
	{
		return(shuxue);
	}
	public double getjisuanji()
	{
		return(jisuanji);
	}
	public double getnum()
	{
		return(num);
	}
	public void setname(String name0)
	{
		name=name0;
	}
	public void setxuehao(int xuehao0)
	{
		xuehao=xuehao0;
	}
	public void setyingyu(double yingyu0)
	{
		yingyu=yingyu0;
		num=sum();
	}
	public void setshuxue(double shuxue0)
	{
		shuxue=shuxue0;
		num=sum();
	}
	public void setjisuanji(double jisuanji0)
	{
		jisuanji=jisuanji0;
		num=sum();
	}
	public String testScore() 
	{
		return((num/3+""));
	}
	public boolean equals(Object x)
	{
		return( this==x);
	}
	
}
