package ����2_4;

public class Address {
	String name;
	int gateNumber;
	String streeName;
	String city;
	String province;
	String postalCode;
	//������Ա��
		//�Լ�tostring����
		public String toString ()
		{
			String s;
			s="name:"+name+"\tgateNumber:"+gateNumber+"\tstreeName:"+streeName+"\tcity:"+city+"\tprovince:"+province+"\tpostalCode:"+postalCode;
			return s;
		}
}
