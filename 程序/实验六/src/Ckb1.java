

public class Ckb1 {

	public static void main(String[] args) {
		int choice;
		int shunum=0,cdnum=0,cinum=0;
		boolean continue_e=true;
		Book shu[]=new Book[100];
		CD cd[]=new CD[100];
		Tape ci[]=new Tape[100];
		while (continue_e) 
		{
			System.out.println("1:���������Ϣ;\n"+"2:����CD����Ϣ;\n"+"3:������̵���Ϣ;\n"+"4:�鿴;\n"+"5:�˳�ϵͳ");
			System.out.println("\n ��ѡ����Ҫ���еĲ��� �������� 1-5�е���һ���֣���\n");			
			choice=Read.readInt();//ѡ��������
			
			
			ci[cinum]=new Tape();
			switch(choice)
			{
				case 1://�����鼮
					boolean bk=true;
					while(bk)
				{
					 shu[shunum]=new Book();
					 System.out.println("�����������"+(shunum+1)+"����");
					 System.out.println("����������������");
					 shu[shunum].mediaNameInput();
					 System.out.println("���������ļ۸�");
					 shu[shunum].MediaPrice();			 
					 System.out.println("���������ĳ�����");
					 shu[shunum].mediaPressInput();
					 System.out.println("��������������");
					 shu[shunum].artistInput();
					 System.out.println("���������ı༭");
					 shu[shunum].editor=Read.readString();
					 System.out.println("����������ISBN");
					 shu[shunum].bookISBN=Read.readString();
					 System.out.println("���������ĳ�������");
					 shu[shunum].publishDate=Read.readString();
					 shunum+=1;
				     System.out.println("�Ƿ���������鼮��1-���룬0-�˳���");
					 int q;
					 q=Read.readInt();
					 if(q==0)
						   bk=false;
				}
					 break; 
				
				case 2: //����CD
					boolean cp=true;
					while(cp)
				{
					 cd[cdnum]=new CD();
				     System.out.println("�����������"+(cdnum+1)+"��CD");
				     System.out.println("������CD����");
				     cd[cdnum].mediaNameInput();
				     System.out.println("������CD�ļ۸�");
				     cd[cdnum].MediaPrice();
				     System.out.println("������CD�ĳ�����");
				     cd[cdnum].mediaPressInput();
				     System.out.println("������CD������");
				     cd[cdnum].artistInput();
				     System.out.println("������CD��ISRC");
				     cd[cdnum].cdISRC=Read.readString();
				     System.out.println("������CD�ķ�����");
				     cd[cdnum].cdpublisher=Read.readString();
				     cdnum+=1;
				     System.out.println("�Ƿ��������CD��1-���룬0-�˳���");
				     int q;
					 q=Read.readInt();
					 if(q==0)
						   cp=false;
				}
					break;
				case 3://����Ŵ�
					boolean tp=true;
					while(tp)
				{
					 
				     System.out.println("�����������"+(cinum+1)+"��Ŵ�");
				     System.out.println("������Ŵ������ƣ�");
				     ci[cinum].mediaNameInput();
				     System.out.println("������Ŵ��ļ۸�");
				     ci[cinum].MediaPrice();
				     System.out.println("������Ŵ��ĳ�����");
				     ci[cinum].mediaPressInput();
				     System.out.println("������Ŵ�������");
				     ci[cinum].artistInput();
				     System.out.println("������Ŵ���ISRC");
				     ci[cinum].taprISRC=Read.readString();
				     cinum+=1;
				     System.out.println("�Ƿ��������Ŵ���1-���룬0-�˳���");
				     int q;
					 q=Read.readInt();
					 if(q==0)
						   tp=false;
				}
					break;
				case 4://�鿴�鼮  CD �Ŵ�
					System.out.println("1-�鼮   "+"2-CD "+"3-�Ŵ�   "+"4-�˳��鿴    ");
					int chakan;
					System.out.println("�����������");
					chakan=Read.readInt();
					switch(chakan) 
					{
						case 1:
							
							System.out.println("�㵱ǰ��"+shunum+"����");
							
							for(int w=0;w<shunum;w++)
							{   int z=w+1;
								System.out.println("��"+z+"����Ϊ��");
								System.out.println(shu[w].toString());
							}
							break;
						case 2:
							System.out.println("�㵱ǰ��"+cdnum+"��CD");
							for(int w=0;w<cdnum;w++) 
							{
								int z=w+1;
								System.out.println("��"+z+"��CD��");
								System.out.println(cd[w].toString());
							}
							break;
						case 3:
							System.out.println("�㵱ǰ��"+cdnum+"��Ŵ�");
							for(int w=0;w<cinum;w++) 
							{
								int z=w+1;
								System.out.println("��"+z+"��Ŵ���");
								System.out.println(ci[w].toString());
							}
							break;
						default:
							System.out.println("�쿴��ϣ��˳��鿴");
							break;
							
					
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
