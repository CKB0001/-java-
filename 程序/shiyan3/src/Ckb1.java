
public class Ckb1 {

	public static void main(String[] args) {
		int i;
		while (true) 
		{
			System.out.println("1-�鼮     2-CD  3-�Ŵ�     0-�˳�");
			System.out.print("������˵�����Ҫִ�еĹ��ܵ����֣�");
			Tape t=new Tape();
			Book shu=new Book();
			CD cd=new CD();
			i=Read.readInt();
			if(i==1)
			{
				 
				 System.out.println("����������������");
				 shu.mediaNameInput();
				 System.out.println("���������ļ۸�");
				 shu.mediaPriceInput();
				 System.out.println("���������ĳ�����");
				 shu.mediaPressInput();
				 System.out.println("��������������");
				 shu.artistInput();
				 System.out.println("���������ı༭");
				 shu.editorInput();
				 System.out.println("����������ISBN");
				 shu.ISBNInput();
				 System.out.println("���������ĳ�������");
				 shu.publishDateINPUT();
				 shu.PRINT();
			}
			if(i==2) 
			{
			     
			     System.out.println("������CD����");
			     cd.mediaNameInput();
			     System.out.println("������CD�ļ۸�");
			     cd.mediaPriceInput();
			     System.out.println("������CD�ĳ�����");
			     cd.mediaPressInput();
			     System.out.println("������CD������");
			     cd.artistInput();
			     System.out.println("������CD��ISRC");
			     cd.cdISRCinput();
			     System.out.println("������CD�ķ�����");
			     cd.cdpublisherinput();
			     cd.PRINT();
			}
			if(i==3)
			{
			     
			     System.out.println("������Ŵ������ƣ�");
			     t.mediaNameInput();
			     System.out.println("������Ŵ��ļ۸�");
			     t.mediaPriceInput();
			     System.out.println("������Ŵ��ĳ�����");
			     t.mediaPressInput();
			     System.out.println("������Ŵ�������");
			     t.artistInput();
			     System.out.println("������Ŵ���ISRC");
			     t.taprISRCINPUT();
			     t.PRINT();
			}
			if(i==0)
			{
				break;
			}
     
		}
	}

}
