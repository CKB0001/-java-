

public class CD extends Media{
	String cdISRC;//CDISRC
	String cdpublisher;//CD������	
	public CD()
	{		
		cdISRC="��";
		cdpublisher="��";
	}
	public String toString() 
	{
		return(super.toString()+"\tISRC:"+cdISRC+"\t�����̣�"+cdpublisher);
	}
	
	
}
