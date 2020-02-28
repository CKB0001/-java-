
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class test9 extends JFrame implements ItemListener {
	public JFrame jFrame;
	private JLabel jLabel;
	private JComboBox jComboBox;
	private String[] fintSize= {"8","14","20","28","32","40"};
	public void init() {
		jFrame=new JFrame("练习ComboBox");
		Container container=jFrame.getContentPane();
		container.setLayout(new GridLayout(2,1));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jLabel=new JLabel("你好吗？");
		jLabel.setFont(new Font("",0,10));//设置字体大小
		jComboBox=new JComboBox(fintSize);
		jComboBox.setEditable(true);//设置复选框可以输入
		jComboBox.addItemListener(this);//添加ItemListener监听
		//添加两个组件
		container.add(jLabel);
		container.add(jComboBox);
		jFrame.pack();//排版
		jFrame.setVisible(true);//显示
	}
	public void itemStateChanged(ItemEvent e) {
		//使用这个判断的目的是为了避免触发事件总是执行两次的问题
		if(e.getStateChange()==ItemEvent.SELECTED) {
			try {
				String s=jComboBox.getSelectedItem().toString();
				int intFontSize=Integer.parseInt(s);
				jLabel.setFont(new Font("",0,intFontSize));
				//System.out.println(intFontSize);
			}catch(NumberFormatException  r) {
				JOptionPane.showMessageDialog(this,"请输入整数");
			}
		}
	}
	public static void main(String[] args) {
		new test9().init();
	}
}
