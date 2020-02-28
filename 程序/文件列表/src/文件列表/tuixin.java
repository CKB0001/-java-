package 文件列表;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
public class tuixin implements ActionListener{
	JTextField user;
	JPasswordField passWd;
	JButton b;
	JLabel z;
	JTextPane c;
	JComboBox q;
	JList w;
	Container di;
	JDialog d;
	JFrame f;
	
	public tuixin() 
	{
		d=new JDialog();
		d.setTitle("请输入你所要查询的文件列表路径");
		di=d.getContentPane();
		di.setLayout(new GridLayout(3,2));
		di.add(new JLabel("文件路径"),SwingConstants.CENTER);
		user=new JTextField();
		di.add(user);
		di.add(new JLabel("文件列表"),SwingConstants.CENTER);
		/*z=new JLabel();*/
		c=new JTextPane();
		di.add(c);
		
		
		/*q=new JComboBox();
		di.add(q);*/
		
		b=new JButton("查询");
		di.add(b);
		b.addActionListener(this);
		d.setBounds(100, 150,500 ,500);
		d.getRootPane().setDefaultButton(b);
		d.setVisible(true);
		this.f=f;
		}
	String name0="";
	String name3[]=new String[1000];
	public  String print(File file)
	{
		
		if(file.isDirectory()) 
		{
			File result[]=file.listFiles();
			if(result!=null)
			{
				for(int x=0;x<result.length;x++)
				{
					print(result[x]);
					
				}
			}
		}
		String t=String.valueOf(file);
		name0=name0+t+"\n";
		return(name0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		String cmd=e.getActionCommand();
		
		if(cmd.equals("查询"))
		{
			String name=user.getText();
			File name1=new File(name);
			
			c.setText(print(name1));
			 return;
		}
	}
	public static void main(String args[])
	{
		new tuixin();
	}
	
}
