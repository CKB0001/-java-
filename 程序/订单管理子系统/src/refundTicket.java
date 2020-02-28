
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class refundTicket 
{
	public refundTicket() 
	{		
		JFrame f=new JFrame("退票");
		Container c=f.getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"查找",TitledBorder.CENTER,TitledBorder.TOP));
		JLabel l=new JLabel("请输入订单号：");
		JTextField u=new JTextField();
		p.add(l);
		p.add(u);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		JButton b=new JButton("确认");
		p1.add(b);		
		JTextPane label=new JTextPane();
		b.addActionListener(
				new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JFrame f=new JFrame("");
				Container c=f.getContentPane();
				JPanel p=new JPanel();
				p.setLayout(new GridLayout(1,2));
				p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"",TitledBorder.CENTER,TitledBorder.TOP));
				JLabel l=new JLabel("                                                 退票成功");
				//**************************删除文件中的内容
				p.add(l);
				JPanel p1=new JPanel();
				p1.setLayout(new GridLayout(1,1));				
				JTextPane label=new JTextPane();
				c.add(p,BorderLayout.NORTH);
				c.add(p1,BorderLayout.SOUTH);			
				f.pack();
				f.setSize(400,100);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		c.add(p,BorderLayout.NORTH);
		c.add(p1,BorderLayout.SOUTH);
		
		f.getRootPane().setDefaultButton(b);
		f.pack();
		f.setSize(400,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
