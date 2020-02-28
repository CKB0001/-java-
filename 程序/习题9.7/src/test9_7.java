
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class test9_7 extends JFrame implements ActionListener
{
	private JPanel jPanel;//左边panel框
	private Button button1;
	private Button button2;
	private Button button3;
	private JScrollPane jScrollPane;//右边滚动条
	private JLabel label;//滚动框中的标签
	public ImageIcon picture=null;//标签中的图标
	public boolean whetherCroll=true;//用于切换滚动条的显示
	public void init()
	{
		JFrame jFrame=new JFrame("练习使用JscrollPane");
		Container pane=jFrame.getContentPane();
		this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		//定义左边镶板HPanel框和3个按钮
		jPanel=new JPanel(new GridLayout(3,1,0,30));
		button1=new  Button("滚动");
		button1.addActionListener(this);
		button2=new  Button("试试");
		button1.addActionListener(this);
		button3=new  Button("退出");
		button1.addActionListener(this);
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);
		//读取图片作为图标
		picture=new ImageIcon("D:\\学习\\java\\程序\\习题9.7\\src\\测试图.jpg");
		//将图标赋给标签label
		label=new JLabel(picture);
		//定义滚动条，总是显示滚动条
		jScrollPane = new JScrollPane(label,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//将左右两边的中间容器放弃JFrame中
		pane.add(jPanel,BorderLayout.WEST);
		pane.add(jScrollPane,BorderLayout.EAST);
		//排版显示
		jFrame.pack();
		jFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="滚动")
		{
			if(whetherCroll)
			{
				jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				//垂直不显示
				jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				//水平不显示
				whetherCroll=false;
			}
			else
			{
				jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				//垂直显示
				jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				//水平显示
				whetherCroll=true;
			}
		}
		if(e.getActionCommand()=="试试")
		{
			JOptionPane.showMessageDialog(this, "lalalalalalalala");
		}
		if(e.getActionCommand()=="退出")
		{
			System.exit(0);
		}
	}
	public static void main(String[] arge)
	{
		new test9_7().init();
	}

}
