package ����2_4;

public class AddressTester2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Address address1=new Address(), address2=new Address();
		address1.name="Zhang Li";
		address1.gateNumber  =15;
		address1.streeName="Tsinghua East Road";
		address1.city ="Beijing";
		address1.province="Beijing";
		address1.postalCode ="100084";
		address2.name ="Li Hong";
		address2.gateNumber =2;
		address2.streeName ="BeiNong";
		address2.city="Beijing";
		address2.province ="Beijing";
		address2.postalCode ="102206";
		// ...do something interesting
			//�Լ�������ʾ����
			System.out.println(address1.toString());
			System.out.println(address2.toString());
	}

}
