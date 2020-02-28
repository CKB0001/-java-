package ∑÷÷ß1;
import java.io.*;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Wenjian c=new Wenjian();
		Scanner sc=new Scanner(System.in);	
		File name=new File(sc.next());
		c.print(name);
		sc.close();
	}

}
