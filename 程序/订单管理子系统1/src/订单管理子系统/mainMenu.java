package ����������ϵͳ;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
public class mainMenu 
{
	private static final LayoutManager GridLayout = null;
	public static void main(String[] args) 
	{	
		final JFrame fr =new JFrame("����");
		fr.setLayout(GridLayout);
		fr.setBounds(100, 180, 400, 300);
		
		Button a = new Button("δ���");
		a.setBounds(0, 0, 400, 100);
		a.setFont(new Font("����",Font.PLAIN,16));
		a.setForeground(Color.BLUE);
		fr.add(a);
		
		Button b = new Button("��֧��");
		b.setBounds(0, 100,400, 100);
		b.setFont(new Font("����",Font.PLAIN,16));
		b.setForeground(Color.BLUE);
		fr.add(b);
		
		Button c = new Button("��");
		c.setBounds(0, 200, 400, 100);
		c.setFont(new Font("����",Font.PLAIN,16));
		c.setForeground(Color.BLUE);
		fr.add(c);
			
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a.addActionListener
		(   //δ��ɶ���
			new ActionListener() 
			{
				@Override //δ��ɶ����Ӳ˵�
				public void actionPerformed(ActionEvent e) 
				{
					new backlogOfUnfilledOrders();
				}
			}
				   
	    );		
		b.addActionListener(  //��֧������ģ��
				new ActionListener() 
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{						
							final JFrame fr =new JFrame("��֧��");
							fr.setLayout(GridLayout);
							fr.setBounds(100, 180, 400, 200);							
							Button a = new Button("δ���ж���");
							a.setBounds(0, 0, 400, 100);
							a.setFont(new Font("����",Font.PLAIN,16));
							a.setForeground(Color.BLUE);
							fr.add(a);							
							Button b = new Button("��ʷ����");
							b.setBounds(0, 100,400, 100);
							b.setFont(new Font("����",Font.PLAIN,16));
							b.setForeground(Color.BLUE);
							fr.add(b);							
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);							
							a.addActionListener
							(   //δ���ж���
								new ActionListener() 
								{
									@Override //δ���ж����Ӳ˵�
									public void actionPerformed(ActionEvent e) 
									{										
										new paidOrder();					
									}
								}
									   
						    );
							b.addActionListener
							(   //��ʷ����
								new ActionListener() 
								{
									@Override //δ��ɶ����Ӳ˵�
									public void actionPerformed(ActionEvent e) 
									{
										new historyOrder();
									}
								}
									   
						    );
					}
				}
				);
		c.addActionListener(  //�򲹶���ģ��
				new ActionListener() 
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						new alternateOrder();
					}
				}
				);						
	}
}
