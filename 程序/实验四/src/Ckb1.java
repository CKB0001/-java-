
public class Ckb1 {

	public static void main(String[] args) {
		int choice;
		boolean continue_e=true;
		while (continue_e) 
		{
			System.out.println("1:���� �����Ϣ;\n"+"2:����CD����Ϣ;\n"+"3:������̵���Ϣ;\n"+"4:�˳�ϵͳ;");
			System.out.println("\n ��ѡ����Ҫ���еĲ��� �������� 1-4�е���һ���֣���\n");			
			Tape t=new Tape("��",0,"��","��","��");
			Book shu=new Book("��",0,"��","��","��","��","��");
			CD cd=new CD("��",0,"��","��","��","��");
			choice=Read.readInt();
			switch(choice)
			{
				case 1:
				{
					 System.out.println("����������������");
					 shu.mediaName=Read.readString();
					 System.out.println("���������ļ۸�");
					 shu.price=Read.readDouble();
					 System.out.println("���������ĳ�����");
					 shu.press=Read.readString();
					 System.out.println("��������������");
					 shu.artist=Read.readString();
					 System.out.println("���������ı༭");
					 shu.editor=Read.readString();
					 System.out.println("����������ISBN");
					 shu.bookISBN=Read.readString();
					 System.out.println("���������ĳ�������");
					 shu.publishDate=Read.readString();
					 shu.PRINT();
					
				}
					break;
				case 2: 
				{
				     
				     System.out.println("������CD����");
				     cd.mediaName=Read.readString();
				     System.out.println("������CD�ļ۸�");
				     cd.price=Read.readDouble();
				     System.out.println("������CD�ĳ�����");
				     cd.press=Read.readString();
				     System.out.println("������CD������");
				     cd.artist=Read.readString();
				     System.out.println("������CD��ISRC");
				     cd.cdISRC=Read.readString();
				     System.out.println("������CD�ķ�����");
				     cd.cdpublisher=Read.readString();
				     cd.PRINT();
				}
					break;
				case 3:
				{
				     
				     System.out.println("������Ŵ������ƣ�");
				     t.mediaName=Read.readString();
				     System.out.println("������Ŵ��ļ۸�");
				     t.price=Read.readDouble();
				     System.out.println("������Ŵ��ĳ�����");
				     t.press=Read.readString();
				     System.out.println("������Ŵ�������");
				     t.artist=Read.readString();
				     System.out.println("������Ŵ���ISRC");
				     t.taprISRC=Read.readString();
				     t.PRINT();
				}
					break;
				default: 
				{ continue_e=false;
				System.out.println("�ټ���\n");
				}
				
			}
		}
	}

}
