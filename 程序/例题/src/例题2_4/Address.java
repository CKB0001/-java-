package 例题2_4;

public class Address {
	String name;
	int gateNumber;
	String streeName;
	String city;
	String province;
	String postalCode;
	//方法成员略
		//自加tostring方法
		public String toString ()
		{
			String s;
			s="name:"+name+"\tgateNumber:"+gateNumber+"\tstreeName:"+streeName+"\tcity:"+city+"\tprovince:"+province+"\tpostalCode:"+postalCode;
			return s;
		}
}
