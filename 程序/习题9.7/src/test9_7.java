
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class test9_7 extends JFrame implements ActionListener
{
	private JPanel jPanel;//���panel��
	private Button button1;
	private Button button2;
	private Button button3;
	private JScrollPane jScrollPane;//�ұ߹�����
	private JLabel label;//�������еı�ǩ
	public ImageIcon picture=null;//��ǩ�е�ͼ��
	public boolean whetherCroll=true;//�����л�����������ʾ
	public void init()
	{
		JFrame jFrame=new JFrame("��ϰʹ��JscrollPane");
		Container pane=jFrame.getContentPane();
		this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		//����������HPanel���3����ť
		jPanel=new JPanel(new GridLayout(3,1,0,30));
		button1=new  Button("����");
		button1.addActionListener(this);
		button2=new  Button("����");
		button1.addActionListener(this);
		button3=new  Button("�˳�");
		button1.addActionListener(this);
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);
		//��ȡͼƬ��Ϊͼ��
		picture=new ImageIcon("D:\\ѧϰ\\java\\����\\ϰ��9.7\\src\\����ͼ.jpg");
		//��ͼ�긳����ǩlabel
		label=new JLabel(picture);
		//�����������������ʾ������
		jScrollPane = new JScrollPane(label,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//���������ߵ��м���������JFrame��
		pane.add(jPanel,BorderLayout.WEST);
		pane.add(jScrollPane,BorderLayout.EAST);
		//�Ű���ʾ
		jFrame.pack();
		jFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="����")
		{
			if(whetherCroll)
			{
				jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				//��ֱ����ʾ
				jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				//ˮƽ����ʾ
				whetherCroll=false;
			}
			else
			{
				jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				//��ֱ��ʾ
				jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				//ˮƽ��ʾ
				whetherCroll=true;
			}
		}
		if(e.getActionCommand()=="����")
		{
			JOptionPane.showMessageDialog(this, "lalalalalalalala");
		}
		if(e.getActionCommand()=="�˳�")
		{
			System.exit(0);
		}
	}
	public static void main(String[] arge)
	{
		new test9_7().init();
	}

}
