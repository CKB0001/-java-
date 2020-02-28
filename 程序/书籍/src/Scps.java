
import java.util.Enumeration;
import java.util.Hashtable;
public class Scps {
	int booknummax=200,cdnummax=200,tapenummax=200;//book,CD,tape����󴢴���
	Book[] books=new Book[booknummax];
	
	Hashtable<String,Book> book=new Hashtable<String,Book>();
	
	public void BookInput(int c)//�����鼮
	{	
		
		if(c>=booknummax)
		{
			System.out.println("������������");
		}
		else
		{
			books[c]=new Book();
			System.out .println("�������鼮������");
			books[c].mediaNameInput();
			System.out .println("�������鼮������");
			books[c].artistInput();
			System.out .println("�������鼮�ĳ�����");
			books[c].mediaPressInput();
			System.out .println("�������鼮��ISBN");
			books[c].bookISBNInput();
			System.out .println("�������鼮�ı༭");
			books[c].editorInput();
			System.out .println("�������鼮�ļ۸�");
			books[c].MediaPriceInput();	
			System.out .println("�������鼮������");
			books[c].publishDateInput();
			book.put(books[c].mediaName, books[c]);
		}
	}

		public void BookName()//��������鼮������
	{
		Enumeration<String> booknames =book.keys();
		System.out .println("���е��鼮������Ϊ��");
		while (booknames.hasMoreElements())
		{
			System.out .print("��"+booknames.nextElement()+"��"+"\t");
		}
		System.out .println("\n");
	}
	
	public void Booknamecha(String anname)//Book�����ֲ���
	{		
		if(book.get(anname)==null)
		{
			System.out .println("�ִ�������û�д���");
		}
		else
		{
		System.out.println(book.get(anname));
		}
	}
	
	public void BookISBNcha(String anISBN)//Book��ISBN����
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
			System.out .println("�ִ�������û�д���");
		}
	}
	
	public void BookPricecha(double anpricemax,double anpricemin)//��Book�۸����
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
			System.out .println("�ִ�������޴�����۸���鼮");
		}
	}
	
	public void BookRemove(String anname)//ɾ��Book
	{
		if(book.get(anname)==null)
		{
			System.out.println("����в��޴���");
		}
		else
		{
			book.remove(anname);
			System.out.println("�鼮��"+anname+"��"+"��ɾ��");
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
	
	public void Bookpaixu(int booknum)//Book�۸�����
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
