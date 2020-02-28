package 复数;
import java.util.Scanner;
public class zhu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    
    Scanner sc=new Scanner(System.in);
    FuShu num=new FuShu(0,0,0,0);
    System.out.println("复数的格式为a+bi");
    System.out.println("请输入复数的a"); 
    num.a1=sc.nextFloat();
    System.out.println("请输入复数的b"); 
    num.b1=sc.nextFloat();
    System.out.println("请输入另一个复数的a"); 
    num.a2=sc.nextFloat();
    System.out.println("请输入另一个复数的b"); 
    num.b2=sc.nextFloat();
    
    System.out.println(num.toString());
    	sc.close();
	}

}
