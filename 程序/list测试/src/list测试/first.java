package list≤‚ ‘;



import java.util.Hashtable;


public class first {
	public static void main(String[] args) {
	/*ArrayList<Object> l=new ArrayList<Object>();*/
		Hashtable<String,Book> l=new Hashtable<String,Book>();
	Book[] b=new Book[3];
	System.out.println("ckb");
	for(int i=0;i<2;i++)
	{
		b[i]=new Book();
		b[i].artistInput();
		b[i].mediaNameInput();
		b[i].mediaPressInput();
		b[i].MediaPriceInput();
		b[i].bookISBNinput();		
	}
	for(int i=0;i<2;i++)
	{
		
		l.put(b[i].mediaName,b[i]);
	}
	
	System.out.println(l);
	System.out.println("ckb");
	
	
}
}