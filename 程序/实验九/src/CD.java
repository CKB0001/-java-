

public class CD extends Media{
	String cdISRC;//CDISRC
	String cdpublisher;//CD������	
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
		return(super.toString()+"\t"+"ISRC:"+cdISRC+"\t"+"�����̣�"+cdpublisher+"\n");
	}
	
	
}
