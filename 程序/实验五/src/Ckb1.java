
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
			System.out.println("1:���� �����Ϣ;\n"+"2:����CD����Ϣ;\n"+"3:������̵���Ϣ;\n"+"4:�鿴;"+"5:�˳�ϵͳ");
			System.out.println("\n ��ѡ����Ҫ���еĲ��� �������� 1-5�е���һ���֣���\n");			
			choice=Read.readInt();//ѡ��������
			shu[shunum]=new Book();
			cd[cdnum]=new CD();
			ci[cinum]=new Tape();
			switch(choice)
			{
				case 1://�����鼮
				{    
					 int z=shunum+1;
					 System.out.println("�����������"+z+"��");
					 System.out.println("����������������");
					 shu[shunum].mediaName=Read.readString();
					 System.out.println("���������ļ۸�");
					 shu[shunum].MediaPrice();					 
					 System.out.println("���������ĳ�����");
					 shu[shunum].press=Read.readString();
					 System.out.println("��������������");
					 shu[shunum].artist=Read.readString();
					 System.out.println("���������ı༭");
					 shu[shunum].editor=Read.readString();
					 System.out.println("����������ISBN");
					 shu[shunum].bookISBN=Read.readString();
					 System.out.println("���������ĳ�������");
					 shu[shunum].publishDate=Read.readString();
					 
					 shunum+=1;
					
				}
					break;
				case 2: //����CD
				{
				     int z=cdnum+1;
				     System.out.println("�����������"+z+"��CD");
				     System.out.println("������CD����");
				     cd[cdnum].mediaName=Read.readString();
				     System.out.println("������CD�ļ۸�");
				     cd[cdnum].MediaPrice();
				     System.out.println("������CD�ĳ�����");
				     cd[cdnum].press=Read.readString();
				     System.out.println("������CD������");
				     cd[cdnum].artist=Read.readString();
				     System.out.println("������CD��ISRC");
				     cd[cdnum].cdISRC=Read.readString();
				     System.out.println("������CD�ķ�����");
				     cd[cdnum].cdpublisher=Read.readString();
				     cdnum+=1;
				}
					break;
				case 3://����Ŵ�
				{
					 int z=cinum+1;
				     System.out.println("�����������"+z+"��Ŵ�");
				     System.out.println("������Ŵ������ƣ�");
				     ci[cinum].mediaName=Read.readString();
				     System.out.println("������Ŵ��ļ۸�");
				     ci[cinum].MediaPrice();
				     System.out.println("������Ŵ��ĳ�����");
				     ci[cinum].press=Read.readString();
				     System.out.println("������Ŵ�������");
				     ci[cinum].artist=Read.readString();
				     System.out.println("������Ŵ���ISRC");
				     ci[cinum].taprISRC=Read.readString();
				     cinum+=1;
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
