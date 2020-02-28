
public class Ckb1 {

	public static void main(String[] args) {
		int choice;
		boolean continue_e=true;
		while (continue_e) 
		{
			System.out.println("1:输入 书的信息;\n"+"2:输入CD的信息;\n"+"3:输入磁盘的信息;\n"+"4:退出系统;");
			System.out.println("\n 请选择你要进行的操作 （请输入 1-4中的任一数字）：\n");			
			Tape t=new Tape("无",0,"无","无","无");
			Book shu=new Book("无",0,"无","无","无","无","无");
			CD cd=new CD("无",0,"无","无","无","无");
			choice=Read.readInt();
			switch(choice)
			{
				case 1:
				{
					 System.out.println("请输入该书的书名：");
					 shu.mediaName=Read.readString();
					 System.out.println("请输入该书的价格");
					 shu.price=Read.readDouble();
					 System.out.println("请输入该书的出版社");
					 shu.press=Read.readString();
					 System.out.println("请输入该书的作者");
					 shu.artist=Read.readString();
					 System.out.println("请输入该书的编辑");
					 shu.editor=Read.readString();
					 System.out.println("请输入该书的ISBN");
					 shu.bookISBN=Read.readString();
					 System.out.println("请输入该书的出版日期");
					 shu.publishDate=Read.readString();
					 shu.PRINT();
					
				}
					break;
				case 2: 
				{
				     
				     System.out.println("请输入CD名称");
				     cd.mediaName=Read.readString();
				     System.out.println("请输入CD的价格");
				     cd.price=Read.readDouble();
				     System.out.println("请输入CD的出版社");
				     cd.press=Read.readString();
				     System.out.println("请输入CD的作者");
				     cd.artist=Read.readString();
				     System.out.println("请输入CD的ISRC");
				     cd.cdISRC=Read.readString();
				     System.out.println("请输入CD的发行商");
				     cd.cdpublisher=Read.readString();
				     cd.PRINT();
				}
					break;
				case 3:
				{
				     
				     System.out.println("请输入磁带的名称：");
				     t.mediaName=Read.readString();
				     System.out.println("请输入磁带的价格");
				     t.price=Read.readDouble();
				     System.out.println("请输入磁带的出版社");
				     t.press=Read.readString();
				     System.out.println("请输入磁带的作者");
				     t.artist=Read.readString();
				     System.out.println("请输入磁带的ISRC");
				     t.taprISRC=Read.readString();
				     t.PRINT();
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
