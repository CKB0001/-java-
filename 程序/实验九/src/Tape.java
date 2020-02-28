
public class Tape extends Media {
	
	String taprISRC;//´Å´øµÄISRC
	public Tape() 
	{
		
		taprISRC=null;
	}
	public void taprISRCInput()
	{
		taprISRC=Read.readString();
	}
 	public String toString() 
	{
		return(super.toString()+"\t"+"ISRC:"+taprISRC+"\n");
	}
	
	
}
