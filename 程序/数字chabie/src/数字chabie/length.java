package Êý×Öchabie;


public class length {
	public static void main(String args[]) {
	String A="10566063667271542763773722126425570441112767011124703700263123340435434076516733372024";
	String B="00000000064042235640975155117310274771932083755136637533499687061408327255432019864722";
		
	System.out.println((A.length()-B.length()));

	int j=0;
	for(int i=0;i<A.length();i++)
	{
		char t,y;
		t=A.charAt(i);
		y=B.charAt(i);
		if(t!=y)
		{
			j++;
		}
	}
	System.out.println(j);
 }
}
