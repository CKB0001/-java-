
import java.awt.*;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import javax.swing.border.TitledBorder;
public class paidOrder 
{
	
	public paidOrder() 
	{		
		JFrame f=new JFrame("δ���ж���");
		Container c=f.getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"",TitledBorder.CENTER,TitledBorder.TOP));
		JLabel l=new JLabel("                                                    δ���ж�����");
		p.add(l);
		JPanel p1=new JPanel();	
		p1.setLayout(new GridLayout(1,1));
		JButton b=new JButton("��Ʊ");
		p1.add(b);
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,1));
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"��ʾ",TitledBorder.CENTER,TitledBorder.TOP));
		JTextPane label=new JTextPane();
		p2.add(label);
		label.setText(this.gets());
		b.addActionListener(
				new ActionListener() 
				{
					@Override //δ��ɶ����Ӳ˵�
					public void actionPerformed(ActionEvent e) 
					{
						new refundTicket();
					}
				}
		);
		c.add(p,BorderLayout.NORTH);
		c.add(p1,BorderLayout.SOUTH);
		c.add(p2,BorderLayout.CENTER);
		f.getRootPane().setDefaultButton(b);
		f.pack();
		f.setSize(400,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public String gets()
	{
		classifyTicket t=new classifyTicket();
		String s=t.untrivialTicket();
		return s;
	}
}
