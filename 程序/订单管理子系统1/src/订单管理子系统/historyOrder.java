package 订单管理子系统;
import java.awt.*;
import java.io.File;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.net.*;
import java.awt.event.*;
public class historyOrder 
{
	public historyOrder() 
	{		
		JFrame f=new JFrame("历史订单");
		Container c=f.getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"",TitledBorder.CENTER,TitledBorder.TOP));
		JLabel l=new JLabel("                                                     历史订单");
		p.add(l);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,1));
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"显示",TitledBorder.CENTER,TitledBorder.TOP));
		JTextPane label=new JTextPane();
		p2.add(label);
		classifyTicket o=new classifyTicket();
		String s="";
		if(o.y!=0)
		{		
			int yy=0;
			ticket t[]=new ticket[o.y];	
			for(int i=0;i<o.y;i++)
				t[i]=new ticket();	
			for(int i=0;i<1000;i++)
			{
				if(o.T[i].getPay()==true&&o.T[i].getSccomplish()==true&&o.T[i].getOrderNumber()!=null)	//历史订单
				{
					t[yy]=o.T[i];
					yy++;
				}
			}
			for(int i=0;i<o.y;i++)	
			{
				s=s+"订单号："+t[i].getOrderNumber()+" "+t[i].getTrainNumber()+" "+t[i].getstart()+"站-"+t[i].getbourn()+"站\n"+
					 " 发车时间："+t[i].getstart()+" "+t[i].getTimeDeparture()[0]+"-"+t[i].getTimeDeparture()[1]+"-"+t[i].getTimeDeparture()[2]+" "+t[i].getTimeDeparture()[3]+":"+t[i].getTimeDeparture()[4]+"开"+"\n"			 					
					 +" 乘客："+t[i].getName()+" "+t[i].getSeat()[0]+"车厢"+t[i].getSeat()[1]+"坐"+"\n";		
			} 
		}
		else 
			s="无票！";		
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
