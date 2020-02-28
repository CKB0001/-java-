

public class zhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book sw[]=new Book[20];
		for(int j=0;j<2;j++)
		{
		sw[j]=new Book();
		System.out.println("wwq");
		sw[j].mediaName=Read.readString();
		System.out.println("www");
		sw[j].price=Read.readDouble();
		}
		for(int i=0;i<2;i++) 
		{
			System.out.println(sw[i].mediaName);
			System.out.println(sw[i].price);
			System.out.println("saf");
		}
		
	}

}
