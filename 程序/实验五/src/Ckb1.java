
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
			System.out.println("1:输入 书的信息;\n"+"2:输入CD的信息;\n"+"3:输入磁盘的信息;\n"+"4:查看;"+"5:退出系统");
			System.out.println("\n 请选择你要进行的操作 （请输入 1-5中的任一数字）：\n");			
			choice=Read.readInt();//选择功能数字
			shu[shunum]=new Book();
			cd[cdnum]=new CD();
			ci[cinum]=new Tape();
			switch(choice)
			{
				case 1://输入书籍
				{    
					 int z=shunum+1;
					 System.out.println("你正在输入第"+z+"书");
					 System.out.println("请输入该书的书名：");
					 shu[shunum].mediaName=Read.readString();
					 System.out.println("请输入该书的价格");
					 shu[shunum].MediaPrice();					 
					 System.out.println("请输入该书的出版社");
					 shu[shunum].press=Read.readString();
					 System.out.println("请输入该书的作者");
					 shu[shunum].artist=Read.readString();
					 System.out.println("请输入该书的编辑");
					 shu[shunum].editor=Read.readString();
					 System.out.println("请输入该书的ISBN");
					 shu[shunum].bookISBN=Read.readString();
					 System.out.println("请输入该书的出版日期");
					 shu[shunum].publishDate=Read.readString();
					 
					 shunum+=1;
					
				}
					break;
				case 2: //输入CD
				{
				     int z=cdnum+1;
				     System.out.println("你正在输入第"+z+"套CD");
				     System.out.println("请输入CD名称");
				     cd[cdnum].mediaName=Read.readString();
				     System.out.println("请输入CD的价格");
				     cd[cdnum].MediaPrice();
				     System.out.println("请输入CD的出版社");
				     cd[cdnum].press=Read.readString();
				     System.out.println("请输入CD的作者");
				     cd[cdnum].artist=Read.readString();
				     System.out.println("请输入CD的ISRC");
				     cd[cdnum].cdISRC=Read.readString();
				     System.out.println("请输入CD的发行商");
				     cd[cdnum].cdpublisher=Read.readString();
				     cdnum+=1;
				}
					break;
				case 3://输入磁带
				{
					 int z=cinum+1;
				     System.out.println("你正在输入第"+z+"卷磁带");
				     System.out.println("请输入磁带的名称：");
				     ci[cinum].mediaName=Read.readString();
				     System.out.println("请输入磁带的价格");
				     ci[cinum].MediaPrice();
				     System.out.println("请输入磁带的出版社");
				     ci[cinum].press=Read.readString();
				     System.out.println("请输入磁带的作者");
				     ci[cinum].artist=Read.readString();
				     System.out.println("请输入磁带的ISRC");
				     ci[cinum].taprISRC=Read.readString();
				     cinum+=1;
				}
					break;
				case 4://查看书籍  CD 磁带
					System.out.println("1-书籍   "+"2-CD "+"3-磁带   "+"4-退出查看    ");
					int chakan;
					System.out.println("请输入操作：");
					chakan=Read.readInt();
					switch(chakan) 
					{
						case 1:
							
							System.out.println("你当前有"+shunum+"本书");
							
							for(int w=0;w<shunum;w++)
							{   int z=w+1;
								System.out.println("第"+z+"本书为：");
								System.out.println(shu[w].toString());
							}
							break;
						case 2:
							System.out.println("你当前有"+cdnum+"套CD");
							for(int w=0;w<cdnum;w++) 
							{
								int z=w+1;
								System.out.println("第"+z+"套CD：");
								System.out.println(cd[w].toString());
							}
							break;
						case 3:
							System.out.println("你当前有"+cdnum+"卷磁带");
							for(int w=0;w<cinum;w++) 
							{
								int z=w+1;
								System.out.println("第"+z+"卷磁带：");
								System.out.println(ci[w].toString());
							}
							break;
						default:
							System.out.println("察看完毕，退出查看");
							break;
							
					
					}
					break;
				default: 
				{ continue_e=false;
				System.out.println("再见！\n");
				}
				
			}
		}
	}

}
