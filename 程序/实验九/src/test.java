

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
		Scps d=new Scps();		
		int numbook=0,numcd=0,numtape=0;
		boolean choice_z=true;
		while(choice_z)
		{
			System.out.println("1-输入\n2-查找\n3-删除\n4-按价格排序\n5-查看\n0-退出\n");
			System.out.println("请输入功能选项");
			int x_z=Read.readInt();
			switch(x_z)
			{
			case 1://输入
				boolean choice_r=true;
				while (choice_r)
				{
					System.out.println("1-输入书籍\n2-输入CD\n3-输入磁带\n0-退出\n");
					System.out.println("请输入功能选项");
					int x_r=Read.readInt();
					switch(x_r)
					{
					case 1://输入书籍
						boolean choice_br=true;
						while(choice_br)
						{
							System.out.println("你正在输入书库中的第"+(numbook+1)+"本书");
							d.BookInput(numbook);
							numbook++;
							System.out.println("是否继续输入书籍（退出书籍输入请选0,继续输入书籍请选非零数）");
							if(Read.readInt()==0)
							{
								choice_br=false;
								System.out.println("退出书籍输入");
							}							
						}
						
						break;
					case 2://输入CD
						boolean choice_cr=true;
						while(choice_cr)
						{		
							System.out.println("你正在输入CD库中的第"+(numcd+1)+"套CD");
							d.CDInput(numcd);
							numcd++;
							System.out.println("是否继续输入CD（退出CD输入请选0,继续输入CD请选非零数）");
							if(Read.readInt()==0)
							{
								choice_cr=false;
								System.out.println("退出CD输入");
							}							
						}
						break;
					case 3://输入tape
						boolean choice_tr=true;
						while(choice_tr)
						{
							System.out.println("你正在输入磁带中的第"+(numtape+1)+"套磁带");
							d.TapeInput(numtape);
							numtape++;
							System.out.println("是否继续输入磁带（退出磁带输入请选0,继续输入磁带请选非零数）");
							if(Read.readInt()==0)
							{
								choice_tr=false;
								System.out.println("退出磁带输入");
							}							
						}
						break;
					case 0:
						System.out.println("退出输入");
						choice_r=false;
						break;
					default:
						System.out.println("请输入正确的操作！！！");
						break;
					}
				}
				break;
			case 2://查找
				
				boolean choice_c=true;
				while (choice_c)
				{
					System.out .println("1-查找书籍\n2-查找CD\n3-查找磁带\n0-退出\n");				
					System.out.println("请输入功能选项");
					int x_c=Read.readInt();
					switch (x_c)
					{
					case 1://查找书籍
						boolean choice_cb=true;
						while(choice_cb)
						{
							System.out .println("1-按书名查找书籍\n2-按ISBN查找书籍\n3-按价格区间查找书籍\n0-退出\n");	
							System.out.println("请输入功能选项");
							int x_cb=Read.readInt();
							switch(x_cb)
							{
							case 1://按书名查找书籍
								System.out.println("请输入你想要查找的书籍的名字");
								String namebook=Read.readString();
								d.Booknamecha(namebook);
								break;
							case 2://按ISBN查找
								System.out.println("请输入你想要查找的书籍的ISBN");
								String ISBNbook=Read.readString();
								d.BookISBNcha(ISBNbook);
								break;
							case 3://按价格区间查找
								System.out.println("请输入你想要查找的书籍最高价");
								int bookpricemax=Read.readInt();
								System.out.println("请输入你想要查找的书籍最低价");
								int bookpricemin=Read.readInt();
								d.BookPricecha(bookpricemax, bookpricemin);
								break;
							case 0:
								choice_cb=false;
								System.out.println("退出书籍查找");
								break;
							default:
								System.out.println("请输入正确的操作！！！");
								break;									
							}							
						}
						break;
					case 2://查找CD
						boolean choice_cc=true;
						while(choice_cc)
						{
							System.out .println("1-按CD名查找CD\n2-按ISRC查找CD\n3-按价格区间查找CD\n0-退出\n");	
							System.out.println("请输入功能选项");
							int x_cb=Read.readInt();
							switch(x_cb)
							{
							case 1://按CD名查找书籍
								System.out.println("请输入你想要查找的CD的名字");
								String namecd=Read.readString();
								d.CDnamecha(namecd);
								break;
							case 2://按ISRS查找
								System.out.println("请输入你想要查找的CD的ISBN");
								String ISRCCD=Read.readString();
								d.CDISRCcha(ISRCCD);
								break;
							case 3://按价格区间查找
								System.out.println("请输入你想要查找的CD最高价");
								int cdpricemax=Read.readInt();
								System.out.println("请输入你想要查找的CD最低价");
								int cdpricemin=Read.readInt();
								d.CDPricecha(cdpricemax, cdpricemin);
								break;
							case 0:
								choice_cc=false;
								System.out.println("退出CD查找");
								break;
							default:
								System.out.println("请输入正确的操作！！！");
								break;									
							}							
						}
						break;
					case 3://tape查找
						boolean choice_ct=true;
						while(choice_ct)
						{
							System.out .println("1-按磁带名查找磁带\n2-按ISRC查找磁带\n3-按价格区间查找磁带\n0-退出\n");	
							System.out.println("请输入功能选项");
							int x_ct=Read.readInt();
							switch(x_ct)
							{
							case 1://按tape名查找书籍
								System.out.println("请输入你想要查找的磁带的名字");
								String nametape=Read.readString();
								d.Tapenamecha(nametape);
								break;
							case 2://按ISRS查找
								System.out.println("请输入你想要查找的磁带的ISBN");
								String ISRCtape=Read.readString();
								d.TapeISBNcha(ISRCtape);
								break;
							case 3://按价格区间查找
								System.out.println("请输入你想要查找的磁带最高价");
								int tapepricemax=Read.readInt();
								System.out.println("请输入你想要查找的磁带最低价");
								int tapepricemin=Read.readInt();
								d.TapePricecha(tapepricemax, tapepricemin);
								break;
							case 0:
								choice_ct=false;
								System.out.println("退出磁带查找");
								break;
							default:
								System.out.println("请输入正确的操作！！！");
								break;									
							}							
						}
						break;
					case 0:
						choice_c=false;
						System.out.println("退出查找");
						break;
					default:
						System.out.println("请输入正确的操作！！！");
						break;						
					}					
				}
				break;
			case 3://删除
				boolean choice_s=true;
				while (choice_s)
				{
					System.out.println("1-删除书籍\n2-删除CD\n3-删除磁带\n0-退出\n");
					System.out.println("请输入你所选择的功能");
					int x_s=Read.readInt();
					switch(x_s)
					{
					case 1://删除书籍
						System.out.println("请输入删除书籍的名字");
						String bookname=Read.readString();
						d.BookRemove(bookname);
						numbook--;
						break;
					case 2://删除CD
						System.out.println("请输入删除CD的名字");
						String cdname=Read.readString();
						d.CDRemove(cdname);
						numcd--;
						break;
					case 3://删除磁带
						System.out.println("请输入删除磁带的名字");
						String tapename=Read.readString();
						d.TapeRemove(tapename);
						numtape--;
						break;
					case 0:
						choice_s=false;
						System.out.println("退出删除");
						break;
					default:
						System.out.println("请输入正确的操作！！！");
						break;	
					}				
				}				
				break;
			case 4://排序
				boolean choice_p=true;
				while(choice_p)
				{
					System.out.println("1-按价格排序书籍\n2-按价格排序CD\n3-按价格排序磁带\n0-退出");
					System.out.println("请输入你所选择的功能");
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
						System.out .println("退出排序");
						choice_p=false;
						break;
					default:
						System.out.println("请输入正确的操作！！！");
						break;	
					}
				}
				break;
			case 5://查看
				boolean choice_k=true;
				while(choice_k)
				{
					System.out.println("1-查看书籍\n2-查看CD\n3-查看磁带\n0-退出\n");
					System.out.println("请输入你所选择的功能");
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
						System.out.println("请输入正确的操作！！！");
						break;
					}
				}
				break;
			case 0:
				choice_z=false;
				System.out.println("退出系统，感谢使用！");
				break;
			default:
				System.out.println("请输入正确的操作！！！");
				break;
			}	
		}
	}
}
