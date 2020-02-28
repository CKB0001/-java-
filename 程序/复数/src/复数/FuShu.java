package 复数;

public class FuShu {
	float a1,b1,a2,b2;
	
public FuShu(float ia,float ib,float ia2,float ib2)
{a1=ia;
 b1=ib;
 a2=ia2;
 b2=ia2;
}

public String toString()
{   
	float z=0,d=0,w=0,q=0,r=0,y=0;
	z=a1+a2;
	d=b1+b2;
	w=a1-a2;
	q=b1-b2;
	r=a1*a2-b1*b2;
	y=b1*a1+a1*b2;
	return("加法运算结果为： "+z+"+("+d+")i"+"  "+"减法运算结果为： "+w+"+("+q+")i"+"  "+"乘法运算结果为： "+r+"+("+y+")i");
	
}
}
