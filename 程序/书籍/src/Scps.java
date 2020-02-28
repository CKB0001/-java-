
import java.util.Enumeration;
import java.util.Hashtable;
public class Scps {
	int booknummax=200,cdnummax=200,tapenummax=200;//book,CD,tape的最大储存量
	Book[] books=new Book[booknummax];
	
	Hashtable<String,Book> book=new Hashtable<String,Book>();
	
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
	
	
	public void shuchu()
	{
		for(int i=0;i<5;i++)
		System.out.println(books[i]);
	}
}
