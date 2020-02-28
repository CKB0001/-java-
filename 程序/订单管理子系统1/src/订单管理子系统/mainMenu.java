package 订单管理子系统;
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
		final JFrame fr =new JFrame("订单");
		fr.setLayout(GridLayout);
		fr.setBounds(100, 180, 400, 300);
		
		Button a = new Button("未完成");
		a.setBounds(0, 0, 400, 100);
		a.setFont(new Font("宋体",Font.PLAIN,16));
		a.setForeground(Color.BLUE);
		fr.add(a);
		
		Button b = new Button("已支付");
		b.setBounds(0, 100,400, 100);
		b.setFont(new Font("宋体",Font.PLAIN,16));
		b.setForeground(Color.BLUE);
		fr.add(b);
		
		Button c = new Button("候补");
		c.setBounds(0, 200, 400, 100);
		c.setFont(new Font("宋体",Font.PLAIN,16));
		c.setForeground(Color.BLUE);
		fr.add(c);
			
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a.addActionListener
		(   //未完成订单
			new ActionListener() 
			{
				@Override //未完成订单子菜单
				public void actionPerformed(ActionEvent e) 
				{
					new backlogOfUnfilledOrders();
				}
			}
				   
	    );		
		b.addActionListener(  //已支付订单模块
				new ActionListener() 
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{						
							final JFrame fr =new JFrame("已支付");
							fr.setLayout(GridLayout);
							fr.setBounds(100, 180, 400, 200);							
							Button a = new Button("未出行订单");
							a.setBounds(0, 0, 400, 100);
							a.setFont(new Font("宋体",Font.PLAIN,16));
							a.setForeground(Color.BLUE);
							fr.add(a);							
							Button b = new Button("历史订单");
							b.setBounds(0, 100,400, 100);
							b.setFont(new Font("宋体",Font.PLAIN,16));
							b.setForeground(Color.BLUE);
							fr.add(b);							
							fr.setVisible(true);
							fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);							
							a.addActionListener
							(   //未出行订单
								new ActionListener() 
								{
									@Override //未出行订单子菜单
									public void actionPerformed(ActionEvent e) 
									{										
										new paidOrder();					
									}
								}
									   
						    );
							b.addActionListener
							(   //历史订单
								new ActionListener() 
								{
									@Override //未完成订单子菜单
									public void actionPerformed(ActionEvent e) 
									{
										new historyOrder();
									}
								}
									   
						    );
					}
				}
				);
		c.addActionListener(  //候补订单模块
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
