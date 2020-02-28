
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
		jFrame=new JFrame("��ϰComboBox");
		Container container=jFrame.getContentPane();
		container.setLayout(new GridLayout(2,1));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jLabel=new JLabel("�����");
		jLabel.setFont(new Font("",0,10));//���������С
		jComboBox=new JComboBox(fintSize);
		jComboBox.setEditable(true);//���ø�ѡ���������
		jComboBox.addItemListener(this);//���ItemListener����
		//����������
		container.add(jLabel);
		container.add(jComboBox);
		jFrame.pack();//�Ű�
		jFrame.setVisible(true);//��ʾ
	}
	public void itemStateChanged(ItemEvent e) {
		//ʹ������жϵ�Ŀ����Ϊ�˱��ⴥ���¼�����ִ�����ε�����
		if(e.getStateChange()==ItemEvent.SELECTED) {
			try {
				String s=jComboBox.getSelectedItem().toString();
				int intFontSize=Integer.parseInt(s);
				jLabel.setFont(new Font("",0,intFontSize));
				//System.out.println(intFontSize);
			}catch(NumberFormatException  r) {
				JOptionPane.showMessageDialog(this,"����������");
			}
		}
	}
	public static void main(String[] args) {
		new test9().init();
	}
}
