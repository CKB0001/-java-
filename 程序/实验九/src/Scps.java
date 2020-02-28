
import java.util.Enumeration;
import java.util.Hashtable;
public class Scps {
	int booknummax=200,cdnummax=200,tapenummax=200;//book,CD,tape的最大储存量
	Book[] books=new Book[booknummax];
	CD[] cds=new CD[cdnummax];
	Tape[]  tapes=new Tape[tapenummax];
	Hashtable<String,Book> book=new Hashtable<String,Book>();
	Hashtable<String,CD> cd=new Hashtable<String,CD>();
	Hashtable<String,Tape> tape=new Hashtable<String,Tape>();	
	public void BookInput(int c)//输入书籍
	{	
		
		if(c>=booknummax)
		{
			System.out.println("超出数据容量");
		}
		else
		{
			books[c]=new Book();
			System.out .println("请输入书籍的名称");
			books[c].mediaNameInput();
			System.out .println("请输入书籍的作者");
			books[c].artistInput();
			System.out .println("请输入书籍的出版社");
			books[c].mediaPressInput();
			System.out .println("请输入书籍的ISBN");
			books[c].bookISBNInput();
			System.out .println("请输入书籍的编辑");
			books[c].editorInput();
			System.out .println("请输入书籍的价格");
			books[c].MediaPriceInput();	
			System.out .println("请输入书籍的日期");
			books[c].publishDateInput();
			book.put(books[c].mediaName, books[c]);
		}
	}
	public void CDInput(int c)//输入CD
	{	
		
		if (c>=cdnummax)
		{
			System.out.println("超出数据容量");
		}
		else
		{
			cds[c]=new CD();
			System.out .println("请输入CD的名称");
			cds[c].mediaNameInput();
			System.out .println("请输入CD的作者");
			cds[c].artistInput();			
			System.out .println("请输入CD的出版社");
			cds[c].mediaPressInput();
			System.out .println("请输入CD的价格");			
			cds[c].MediaPriceInput();
			System.out .println("请输入CD的ISRC");
			cds[c].cdISRCInput();
			System.out .println("请输入CD的发行商");
			cds[c].cdpublisherInput();
			cd.put(cds[c].mediaName,cds[c]);
			
		}
	}
	public void TapeInput(int c)//输入tape
	{
		
		if(c>=tapenummax)
		{
			System.out.println("超出数据容量");
		}
		else 
		{
			tapes[c]=new Tape();
			System.out .println("请输入磁带的名称");
			tapes[c].mediaNameInput();
			System.out .println("请输入磁带的作者");
			tapes[c].artistInput();
			System.out .println("请输入磁带的出版社");
			tapes[c].mediaPressInput();
			System.out .println("请输入磁带的价格");
			tapes[c].MediaPriceInput();
			System.out .println("请输入磁带的ISRC");
			tapes[c].taprISRCInput();
			tape.put(tapes[c].mediaName, tapes[c]);
		}
		
	}
	public void BookName()//输出所有书籍的名字
	{
		Enumeration<String> booknames =book.keys();
		System.out .println("所有的书籍的名称为：");
		while (booknames.hasMoreElements())
		{
			System.out .print("《"+booknames.nextElement()+"》"+"\t");
		}
		System.out .println("\n");
	}
	public void CDName()//输出所有CD的名字
	{
		Enumeration<String> CDnames =book.keys();
		System.out.println("所有的CD名称为：");
		while (CDnames.hasMoreElements())
		{
			System.out .print("《"+CDnames.nextElement()+"》"+"\t");
		}
		System.out.println("\n");
	}
	public void TapeName()//输出所有Tape的名字
	{
		Enumeration<String> Tapenames =book.keys();
		System.out .println("所有的磁带名称为：");
		while (Tapenames.hasMoreElements())
		{
			System.out .println("《"+Tapenames.nextElement()+"》"+"\t");
		}
		System.out .println("\n");
	}
	public void Booknamecha(String anname)//Book按名字查找
	{		
		if(book.get(anname)==null)
		{
			System.out .println("现存的书库中没有此书");
		}
		else
		{
		System.out.println(book.get(anname));
		}
	}
	public void CDnamecha(String anname)//CD按名字查找
	{		
		if(cd.get(anname)==null)
		{
			System.out .println("现存的CD库中没有此CD");
		}
		else
		{
		System.out.println(cd.get(anname));
		}
	}
	public void Tapenamecha(String anname)//Tape按名字查找
	{		
		if(tape.get(anname)==null)
		{
			System.out .println("现存的磁带库中没有此磁带");
		}
		else
		{
		System.out.println(tape.get(anname));
		}
	}
	public void BookISBNcha(String anISBN)//Book按ISBN查找
	{		
		Enumeration<String> key=book.keys();
		boolean bi=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(book.get(x).getBookISBN().equalsIgnoreCase(anISBN))
			{
				System.out.println(book.get(x));
				bi=false;
			}			
		}
		if(bi)
		{
			System.out .println("现存的书库中没有此书");
		}
	}
	public void CDISRCcha(String anISRC)//CD按ISRC查找
	{		
		Enumeration<String> key=cd.keys();	
		boolean ci=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(cd.get(x).cdISRC.equalsIgnoreCase(anISRC))
			{
				System.out.println(cd.get(x));
				ci=false;
			}
			
		}
		if(ci) 
		{
			System.out .println("现存的CD库中没有此CD");			
		}
		
	}
	public void TapeISBNcha(String anISRC)//Tape按ISRC查找
	{		
		Enumeration<String> key=tape.keys();
		boolean ti=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(tape.get(x).taprISRC.equalsIgnoreCase(anISRC))
			{
				System.out.println(tape.get(x));
				ti=false;
			}
			
		}
		if(ti)
		{
			System.out .println("现存磁带库中没有此磁带");
		}
	}
	public void BookPricecha(double anpricemax,double anpricemin)//按Book价格查找
	{
		Enumeration<String> key=book.keys();
		boolean bi=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(book.get(x).price>=anpricemin && book.get(x).price<=anpricemax)
			{
				System.out.println(book.get(x));
				bi=false;
			}
			
		}
		if(bi)
		{
			System.out .println("现存书库中无此区间价格的书籍");
		}
	}
	public void CDPricecha(double anpricemax,double anpricemin)//按CD价格查找
	{
		Enumeration<String> key=cd.keys();	
		boolean ci=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(anpricemin<=cd.get(x).price && cd.get(x).price<=anpricemax)
			{
				System.out.println(cd.get(x));
				ci=false;
			}			
		}
		if(ci)
		{
			System.out .println("CD库中无此价格区间的CD");
		}
	}
	public void TapePricecha(double anpricemax,double anpricemin)//按tape价格查找
	{
		Enumeration<String> key=tape.keys();	
		boolean ti=true;
		while (key.hasMoreElements())
		{
			String x=(String)key.nextElement();			
			if(anpricemin<=tape.get(x).price && tape.get(x).price<=anpricemax)
			{
				System.out.println(tape.get(x));
				ti=false;
			}			
		}
		if(ti)
		{
			System.out .println("现存磁带库中无此价格区间的磁带");
		}
	}	
	public void BookRemove(String anname)//删除Book
	{
		if(book.get(anname)==null)
		{
			System.out.println("书库中查无此书");
		}
		else
		{
			book.remove(anname);
			System.out.println("书籍《"+anname+"》"+"已删除");
			Enumeration<String> key=book.keys();  
			int i=0;
			String b[]=new String[booknummax];
			while(key.hasMoreElements())
			{
				
				String x=key.nextElement();	
				b[i]=x;				
				i++;
			}
			int b1=i;
			for(int w=0;i>0;i--,w++)
			{
				if(b[i-1].compareTo(books[w].mediaName)!=0)
				{
					books[w]=books[w+1];
				}
			}			
			for(;b1<booknummax;b1++)
			{
				books[b1]=null;
			}
		
		}
	}
	public void CDRemove(String anname)//删除CD
	{
		if(cd.get(anname)==null)
		{
			System.out.println("CD库中没有此CD");
		}
		else
		{
		cd.remove(anname);
		System.out.println("CD《"+anname+"》"+"已删除");
		Enumeration<String> key=cd.keys();  
		int i=0;
		String c[]=new String[cdnummax];
		while(key.hasMoreElements())
		{
			
			String x=key.nextElement();	
			c[i]=x;
			i++;
		}
		int c1=i;
		for(int w=0;i>0;i--,w++)
		{
			if(c[i-1].compareTo(cds[w].mediaName)!=0)
			{
				cds[w]=cds[w+1];
			}
		}
		for(;c1<cdnummax;c1++)
		{
			cds[c1]=null;
		}
		}
	}
	public void TapeRemove(String anname)//删除Tape
	{
		if(tape.get(anname)==null)
		{
			System.out.println("磁带中没有此磁带");
		}
		else
		{
			tape.remove(anname);
			System.out.println("《"+anname+"》"+"已删除");
			Enumeration<String> key=tape.keys();  
			int i=0;
			String t[]=new String[tapenummax];
			while(key.hasMoreElements())
			{
				
				String x=key.nextElement();	
				t[i]=x;								
				i++;
			}
			int c1=i;
			for(int w=0;i>0;i--,w++)
			{
				if(t[i-1].compareTo(tapes[w].mediaName)!=0)
				{
					tapes[w]=tapes[w+1];
				}
			}
			for(;c1<tapenummax;c1++)
			{
				tapes[c1]=null;
			}
		}
	}
	public void Bookpaixu(int booknum)//Book价格排序
	{
		Book t=new Book();
		for(int j=0;j<booknum-1;j++)
		{
			for(int i=0;i<booknum-1-j;i++)
			{
				if(books[i].price>books[i+1].price)
				{
					t=books[i];
					books[i]=books[i+1];
					books[i+1]=t;
				}
			}
		}
		for(int i=0;i<booknum;i++)
		{
			System.out.println(books[i]);
		}
	}
	public void CDpaixu(int cdnum)//CD价格排序
	{
		CD t=new CD();
		for(int j=0;j<cdnum-1;j++)
		{
			for(int i=0;i<cdnum-1-j;i++)
			{
				if(cds[i].price>cds[i+1].price)
				{
					t=cds[i];
					cds[i]=cds[i+1];
					cds[i+1]=t;
				}
			}
		}
		for(int i=0;i<cdnum;i++)
		{
			System.out.println(cds[i]);
		}
	}
	public void Tapepaixu(int tapenum)//Tape价格排序
	{
		Tape t=new Tape();
		for(int j=0;j<tapenum-1;j++)
		{
			for(int i=0;i<tapenum-1-j;i++)
			{
				if(tapes[i].price>tapes[i+1].price)
				{
					t=tapes[i];
					tapes[i]=tapes[i+1];
					tapes[i+1]=t;
				}
			}
		}
		for(int i=0;i<tapenum;i++)
		{
			System.out.println(tapes[i]);
		}
	}
	
	public void shuchu()
	{
		for(int i=0;i<5;i++)
		System.out.println(books[i]);
	}
}
