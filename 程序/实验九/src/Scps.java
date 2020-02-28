
import java.util.Enumeration;
import java.util.Hashtable;
public class Scps {
	int booknummax=200,cdnummax=200,tapenummax=200;//book,CD,tape����󴢴���
	Book[] books=new Book[booknummax];
	CD[] cds=new CD[cdnummax];
	Tape[]  tapes=new Tape[tapenummax];
	Hashtable<String,Book> book=new Hashtable<String,Book>();
	Hashtable<String,CD> cd=new Hashtable<String,CD>();
	Hashtable<String,Tape> tape=new Hashtable<String,Tape>();	
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
	public void CDInput(int c)//����CD
	{	
		
		if (c>=cdnummax)
		{
			System.out.println("������������");
		}
		else
		{
			cds[c]=new CD();
			System.out .println("������CD������");
			cds[c].mediaNameInput();
			System.out .println("������CD������");
			cds[c].artistInput();			
			System.out .println("������CD�ĳ�����");
			cds[c].mediaPressInput();
			System.out .println("������CD�ļ۸�");			
			cds[c].MediaPriceInput();
			System.out .println("������CD��ISRC");
			cds[c].cdISRCInput();
			System.out .println("������CD�ķ�����");
			cds[c].cdpublisherInput();
			cd.put(cds[c].mediaName,cds[c]);
			
		}
	}
	public void TapeInput(int c)//����tape
	{
		
		if(c>=tapenummax)
		{
			System.out.println("������������");
		}
		else 
		{
			tapes[c]=new Tape();
			System.out .println("������Ŵ�������");
			tapes[c].mediaNameInput();
			System.out .println("������Ŵ�������");
			tapes[c].artistInput();
			System.out .println("������Ŵ��ĳ�����");
			tapes[c].mediaPressInput();
			System.out .println("������Ŵ��ļ۸�");
			tapes[c].MediaPriceInput();
			System.out .println("������Ŵ���ISRC");
			tapes[c].taprISRCInput();
			tape.put(tapes[c].mediaName, tapes[c]);
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
	public void CDName()//�������CD������
	{
		Enumeration<String> CDnames =book.keys();
		System.out.println("���е�CD����Ϊ��");
		while (CDnames.hasMoreElements())
		{
			System.out .print("��"+CDnames.nextElement()+"��"+"\t");
		}
		System.out.println("\n");
	}
	public void TapeName()//�������Tape������
	{
		Enumeration<String> Tapenames =book.keys();
		System.out .println("���еĴŴ�����Ϊ��");
		while (Tapenames.hasMoreElements())
		{
			System.out .println("��"+Tapenames.nextElement()+"��"+"\t");
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
	public void CDnamecha(String anname)//CD�����ֲ���
	{		
		if(cd.get(anname)==null)
		{
			System.out .println("�ִ��CD����û�д�CD");
		}
		else
		{
		System.out.println(cd.get(anname));
		}
	}
	public void Tapenamecha(String anname)//Tape�����ֲ���
	{		
		if(tape.get(anname)==null)
		{
			System.out .println("�ִ�ĴŴ�����û�д˴Ŵ�");
		}
		else
		{
		System.out.println(tape.get(anname));
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
	public void CDISRCcha(String anISRC)//CD��ISRC����
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
			System.out .println("�ִ��CD����û�д�CD");			
		}
		
	}
	public void TapeISBNcha(String anISRC)//Tape��ISRC����
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
			System.out .println("�ִ�Ŵ�����û�д˴Ŵ�");
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
	public void CDPricecha(double anpricemax,double anpricemin)//��CD�۸����
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
			System.out .println("CD�����޴˼۸������CD");
		}
	}
	public void TapePricecha(double anpricemax,double anpricemin)//��tape�۸����
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
			System.out .println("�ִ�Ŵ������޴˼۸�����ĴŴ�");
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
	public void CDRemove(String anname)//ɾ��CD
	{
		if(cd.get(anname)==null)
		{
			System.out.println("CD����û�д�CD");
		}
		else
		{
		cd.remove(anname);
		System.out.println("CD��"+anname+"��"+"��ɾ��");
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
	public void TapeRemove(String anname)//ɾ��Tape
	{
		if(tape.get(anname)==null)
		{
			System.out.println("�Ŵ���û�д˴Ŵ�");
		}
		else
		{
			tape.remove(anname);
			System.out.println("��"+anname+"��"+"��ɾ��");
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
	public void CDpaixu(int cdnum)//CD�۸�����
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
	public void Tapepaixu(int tapenum)//Tape�۸�����
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
