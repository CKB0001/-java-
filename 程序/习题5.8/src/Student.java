
public class Student {
	int xuehao;//学号
	String name;//姓名
	double yingyu;//英语成绩
	double shuxue;//数学成绩
	double jisuanji;//计算机成绩
	double num;//总成绩
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
		return("学号:"+xuehao+"\t姓名:"+name+"\t英语成绩:"+yingyu+"\t数学成绩:"+shuxue+"\t计算机成绩:"+jisuanji+"\t总成绩:"+num+"\t测评成绩："+testScore());
	}
	public int compare(double num1,double num2)//比较成绩
	{
		if(num1>num2) 
			return(1);
		else if(num1==num2)
			return(0);
			else
				return(-1);
	}
	public double sum()//总成绩
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
