

public class CD extends Media{
	String cdISRC;//CDISRC
	String cdpublisher;//CD发行商	
	public CD()
	{		
		cdISRC="无";
		cdpublisher="无";
	}
	public String toString() 
	{
		return(super.toString()+"\tISRC:"+cdISRC+"\t发行商："+cdpublisher);
	}
	
	
}
