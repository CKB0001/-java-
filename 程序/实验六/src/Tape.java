
public class Tape extends Media {
	
	String taprISRC;//�Ŵ���ISRC
	public Tape() 
	{
		
		taprISRC="��";
	}
	public String toString() 
	{
		return(super.toString()+"\tISRC:"+taprISRC);
	}
	
	
}
