

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	
		Scps d=new Scps();		
		int numbook=0,numcd=0,numtape=0;
		boolean choice_z=true;
		while(choice_z)
		{
			System.out.println("1-����\n2-����\n3-ɾ��\n4-���۸�����\n5-�鿴\n0-�˳�\n");
			System.out.println("�����빦��ѡ��");
			int x_z=Read.readInt();
			switch(x_z)
			{
			case 1://����
				boolean choice_r=true;
				while (choice_r)
				{
					System.out.println("1-�����鼮\n2-����CD\n3-����Ŵ�\n0-�˳�\n");
					System.out.println("�����빦��ѡ��");
					int x_r=Read.readInt();
					switch(x_r)
					{
					case 1://�����鼮
						boolean choice_br=true;
						while(choice_br)
						{
							System.out.println("��������������еĵ�"+(numbook+1)+"����");
							d.BookInput(numbook);
							numbook++;
							System.out.println("�Ƿ���������鼮���˳��鼮������ѡ0,���������鼮��ѡ��������");
							if(Read.readInt()==0)
							{
								choice_br=false;
								System.out.println("�˳��鼮����");
							}							
						}
						
						break;
					case 2://����CD
						boolean choice_cr=true;
						while(choice_cr)
						{		
							System.out.println("����������CD���еĵ�"+(numcd+1)+"��CD");
							d.CDInput(numcd);
							numcd++;
							System.out.println("�Ƿ��������CD���˳�CD������ѡ0,��������CD��ѡ��������");
							if(Read.readInt()==0)
							{
								choice_cr=false;
								System.out.println("�˳�CD����");
							}							
						}
						break;
					case 3://����tape
						boolean choice_tr=true;
						while(choice_tr)
						{
							System.out.println("����������Ŵ��еĵ�"+(numtape+1)+"�״Ŵ�");
							d.TapeInput(numtape);
							numtape++;
							System.out.println("�Ƿ��������Ŵ����˳��Ŵ�������ѡ0,��������Ŵ���ѡ��������");
							if(Read.readInt()==0)
							{
								choice_tr=false;
								System.out.println("�˳��Ŵ�����");
							}							
						}
						break;
					case 0:
						System.out.println("�˳�����");
						choice_r=false;
						break;
					default:
						System.out.println("��������ȷ�Ĳ���������");
						break;
					}
				}
				break;
			case 2://����
				
				boolean choice_c=true;
				while (choice_c)
				{
					System.out .println("1-�����鼮\n2-����CD\n3-���ҴŴ�\n0-�˳�\n");				
					System.out.println("�����빦��ѡ��");
					int x_c=Read.readInt();
					switch (x_c)
					{
					case 1://�����鼮
						boolean choice_cb=true;
						while(choice_cb)
						{
							System.out .println("1-�����������鼮\n2-��ISBN�����鼮\n3-���۸���������鼮\n0-�˳�\n");	
							System.out.println("�����빦��ѡ��");
							int x_cb=Read.readInt();
							switch(x_cb)
							{
							case 1://�����������鼮
								System.out.println("����������Ҫ���ҵ��鼮������");
								String namebook=Read.readString();
								d.Booknamecha(namebook);
								break;
							case 2://��ISBN����
								System.out.println("����������Ҫ���ҵ��鼮��ISBN");
								String ISBNbook=Read.readString();
								d.BookISBNcha(ISBNbook);
								break;
							case 3://���۸��������
								System.out.println("����������Ҫ���ҵ��鼮��߼�");
								int bookpricemax=Read.readInt();
								System.out.println("����������Ҫ���ҵ��鼮��ͼ�");
								int bookpricemin=Read.readInt();
								d.BookPricecha(bookpricemax, bookpricemin);
								break;
							case 0:
								choice_cb=false;
								System.out.println("�˳��鼮����");
								break;
							default:
								System.out.println("��������ȷ�Ĳ���������");
								break;									
							}							
						}
						break;
					case 2://����CD
						boolean choice_cc=true;
						while(choice_cc)
						{
							System.out .println("1-��CD������CD\n2-��ISRC����CD\n3-���۸��������CD\n0-�˳�\n");	
							System.out.println("�����빦��ѡ��");
							int x_cb=Read.readInt();
							switch(x_cb)
							{
							case 1://��CD�������鼮
								System.out.println("����������Ҫ���ҵ�CD������");
								String namecd=Read.readString();
								d.CDnamecha(namecd);
								break;
							case 2://��ISRS����
								System.out.println("����������Ҫ���ҵ�CD��ISBN");
								String ISRCCD=Read.readString();
								d.CDISRCcha(ISRCCD);
								break;
							case 3://���۸��������
								System.out.println("����������Ҫ���ҵ�CD��߼�");
								int cdpricemax=Read.readInt();
								System.out.println("����������Ҫ���ҵ�CD��ͼ�");
								int cdpricemin=Read.readInt();
								d.CDPricecha(cdpricemax, cdpricemin);
								break;
							case 0:
								choice_cc=false;
								System.out.println("�˳�CD����");
								break;
							default:
								System.out.println("��������ȷ�Ĳ���������");
								break;									
							}							
						}
						break;
					case 3://tape����
						boolean choice_ct=true;
						while(choice_ct)
						{
							System.out .println("1-���Ŵ������ҴŴ�\n2-��ISRC���ҴŴ�\n3-���۸�������ҴŴ�\n0-�˳�\n");	
							System.out.println("�����빦��ѡ��");
							int x_ct=Read.readInt();
							switch(x_ct)
							{
							case 1://��tape�������鼮
								System.out.println("����������Ҫ���ҵĴŴ�������");
								String nametape=Read.readString();
								d.Tapenamecha(nametape);
								break;
							case 2://��ISRS����
								System.out.println("����������Ҫ���ҵĴŴ���ISBN");
								String ISRCtape=Read.readString();
								d.TapeISBNcha(ISRCtape);
								break;
							case 3://���۸��������
								System.out.println("����������Ҫ���ҵĴŴ���߼�");
								int tapepricemax=Read.readInt();
								System.out.println("����������Ҫ���ҵĴŴ���ͼ�");
								int tapepricemin=Read.readInt();
								d.TapePricecha(tapepricemax, tapepricemin);
								break;
							case 0:
								choice_ct=false;
								System.out.println("�˳��Ŵ�����");
								break;
							default:
								System.out.println("��������ȷ�Ĳ���������");
								break;									
							}							
						}
						break;
					case 0:
						choice_c=false;
						System.out.println("�˳�����");
						break;
					default:
						System.out.println("��������ȷ�Ĳ���������");
						break;						
					}					
				}
				break;
			case 3://ɾ��
				boolean choice_s=true;
				while (choice_s)
				{
					System.out.println("1-ɾ���鼮\n2-ɾ��CD\n3-ɾ���Ŵ�\n0-�˳�\n");
					System.out.println("����������ѡ��Ĺ���");
					int x_s=Read.readInt();
					switch(x_s)
					{
					case 1://ɾ���鼮
						System.out.println("������ɾ���鼮������");
						String bookname=Read.readString();
						d.BookRemove(bookname);
						numbook--;
						break;
					case 2://ɾ��CD
						System.out.println("������ɾ��CD������");
						String cdname=Read.readString();
						d.CDRemove(cdname);
						numcd--;
						break;
					case 3://ɾ���Ŵ�
						System.out.println("������ɾ���Ŵ�������");
						String tapename=Read.readString();
						d.TapeRemove(tapename);
						numtape--;
						break;
					case 0:
						choice_s=false;
						System.out.println("�˳�ɾ��");
						break;
					default:
						System.out.println("��������ȷ�Ĳ���������");
						break;	
					}				
				}				
				break;
			case 4://����
				boolean choice_p=true;
				while(choice_p)
				{
					System.out.println("1-���۸������鼮\n2-���۸�����CD\n3-���۸�����Ŵ�\n0-�˳�");
					System.out.println("����������ѡ��Ĺ���");
					int x_p=Read.readInt();
					switch(x_p)
					
					{
					case 1:
						d.Bookpaixu(numbook);
						
						break;
					case 2:
						d.CDpaixu(numcd);
						break;
					case 3:
						d.Tapepaixu(numtape);
						break;
					case 0:
						System.out .println("�˳�����");
						choice_p=false;
						break;
					default:
						System.out.println("��������ȷ�Ĳ���������");
						break;	
					}
				}
				break;
			case 5://�鿴
				boolean choice_k=true;
				while(choice_k)
				{
					System.out.println("1-�鿴�鼮\n2-�鿴CD\n3-�鿴�Ŵ�\n0-�˳�\n");
					System.out.println("����������ѡ��Ĺ���");
					int x_k=Read.readInt();
					switch(x_k)
					{
					case 1:
						d.BookName();
						break;
					case 2:
						d.CDName();
						break;
					case 3:
						d.TapeName();
						break;
					case 0:
						choice_k=false;
						break;
					default:
						System.out.println("��������ȷ�Ĳ���������");
						break;
					}
				}
				break;
			case 0:
				choice_z=false;
				System.out.println("�˳�ϵͳ����лʹ�ã�");
				break;
			default:
				System.out.println("��������ȷ�Ĳ���������");
				break;
			}	
		}
	}
}
