package ����������ϵͳ;
import java.awt.*;
import java.io.File;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class backlogOfUnfilledOrders 
{
	public backlogOfUnfilledOrders()
	{
		
		JFrame f=new JFrame("δ��ɶ���");
		Container c=f.getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"",TitledBorder.CENTER,TitledBorder.TOP));
		JLabel l=new JLabel("                                                    δ��ɶ�����");
		p.add(l);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,1));
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"��ʾ",TitledBorder.CENTER,TitledBorder.TOP));
		JTextPane label=new JTextPane();
		p2.add(label);
		classifyTicket o=new classifyTicket();
		String s="";
		if(o.x!=0)
		{		
			int xx=0;
			ticket t[]=new ticket[o.x];	
			for(int i=0;i<o.x;i++)
				t[i]=new ticket();	
			for(int i=0;i<1000;i++)
			{
				if(o.T[i].getPay()==false&&o.T[i].getOrderNumber()!=null)	//δ��ɶ�������
				{
					t[xx]=o.T[i];
					xx++;
				}
			}
			for(int i=0;i<o.x;i++)	
			{
				s=s+"�����ţ�"+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"վ-"+t[i].getbourn()+"վ\n"+
					 " ����ʱ�䣺"+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"��"+"\n"			 					
					 +" �˿ͣ�"+t[i].getName()+" "+t[i].getSeat()[0]+"����"+t[i].getSeat()[1]+"��"+"\n";		
			} 
		}
		else 
			s="��Ʊ��";		
		label.setText(s);
		c.add(p,BorderLayout.NORTH);
		c.add(p1,BorderLayout.SOUTH);
		c.add(p2,BorderLayout.CENTER);
		f.pack();
		f.setSize(400,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
