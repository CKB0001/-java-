
public class Ckb1 {

	public static void main(String[] args) {
		int i;
		while (true) 
		{
			System.out.println("1-书籍     2-CD  3-磁带     0-退出");
			System.out.print("请输入菜单里想要执行的功能的数字：");
			Tape t=new Tape();
			Book shu=new Book();
			CD cd=new CD();
			i=Read.readInt();
			if(i==1)
			{
				 
				 System.out.println("请输入该书的书名：");
				 shu.mediaNameInput();
				 System.out.println("请输入该书的价格");
				 shu.mediaPriceInput();
				 System.out.println("请输入该书的出版社");
				 shu.mediaPressInput();
				 System.out.println("请输入该书的作者");
				 shu.artistInput();
				 System.out.println("请输入该书的编辑");
				 shu.editorInput();
				 System.out.println("请输入该书的ISBN");
				 shu.ISBNInput();
				 System.out.println("请输入该书的出版日期");
				 shu.publishDateINPUT();
				 shu.PRINT();
			}
			if(i==2) 
			{
			     
			     System.out.println("请输入CD名称");
			     cd.mediaNameInput();
			     System.out.println("请输入CD的价格");
			     cd.mediaPriceInput();
			     System.out.println("请输入CD的出版社");
			     cd.mediaPressInput();
			     System.out.println("请输入CD的作者");
			     cd.artistInput();
			     System.out.println("请输入CD的ISRC");
			     cd.cdISRCinput();
			     System.out.println("请输入CD的发行商");
			     cd.cdpublisherinput();
			     cd.PRINT();
			}
			if(i==3)
			{
			     
			     System.out.println("请输入磁带的名称：");
			     t.mediaNameInput();
			     System.out.println("请输入磁带的价格");
			     t.mediaPriceInput();
			     System.out.println("请输入磁带的出版社");
			     t.mediaPressInput();
			     System.out.println("请输入磁带的作者");
			     t.artistInput();
			     System.out.println("请输入磁带的ISRC");
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
