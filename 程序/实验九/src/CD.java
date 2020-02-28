

public class CD extends Media{
	String cdISRC;//CDISRC
	String cdpublisher;//CD发行商	
	public CD()
	{		
		cdISRC=null;
		cdpublisher=null;
	}
	public void cdISRCInput()
	{
		cdISRC=Read.readString();
	}
	public void cdpublisherInput()
	{
		cdpublisher=Read.readString();
	}
	public String toString() 
	{
		return(super.toString()+"\t"+"ISRC:"+cdISRC+"\t"+"发行商："+cdpublisher+"\n");
	}
	
	
}
