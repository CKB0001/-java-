package 通讯录;



import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


import javax.swing.JTextField;
import javax.swing.JButton;


public class Contacts extends JFrame implements ActionListener {
private DefaultListModel list1;


private static final long serialVersionUID = 1L;


private JPanel jContentPane = null;


private JLabel jLabel = null;


private JLabel jLabel1 = null;


private JTextField jTextField = null;


private JTextField jTextField1 = null;


private JButton jButton = null;


private JButton jButton1 = null;

private JButton jButton2 = null;


public Contacts(DefaultListModel list) {
super();
this.list1 = list;
initialize();
}


private void initialize() {
this.setBounds(180, 140, 290, 190);
this.setContentPane(getJContentPane());
this.setUndecorated(true);


}


private JPanel getJContentPane() {
if (jContentPane == null) {
jLabel1 = new JLabel();
jLabel1.setBounds(new Rectangle(12, 74, 85, 31));
jLabel1.setText("   电话号码:");
jLabel = new JLabel();
jLabel.setBounds(new Rectangle(12, 31, 85, 31));
jLabel.setText("      姓 名:");
jContentPane = new JPanel();
jContentPane.setLayout(null);
jContentPane.add(jLabel, null);
jContentPane.add(jLabel1, null);
jContentPane.add(getJTextField(), null);
jContentPane.add(getJTextField1(), null);
jContentPane.add(getJButton(), null);
jContentPane.add(getJButton1(), null);
jContentPane.add(getJButton2(), null);
}
return jContentPane;
}


private JTextField getJTextField() {
if (jTextField == null) {
jTextField = new JTextField();
jTextField.setBounds(new Rectangle(112, 29, 155, 33));
jTextField.setEditable(true);
}


return jTextField;
}


private JTextField getJTextField1() {
if (jTextField1 == null) {
jTextField1 = new JTextField();
jTextField1.setBounds(new Rectangle(112, 73, 155, 33));
jTextField1.setEditable(true);
}
return jTextField1;
}


private JButton getJButton() {
if (jButton == null) {
jButton = new JButton();
jButton.setBounds(new Rectangle(20, 120, 80, 50));
jButton.setText("保存");
jButton.addActionListener(this);
}
return jButton;
}


private JButton getJButton1() {
if (jButton1 == null) {
jButton1 = new JButton();
jButton1.setBounds(new Rectangle(105, 120, 80, 50));
jButton1.setText("清除");
jButton1.addActionListener(this);
}
return jButton1;
}

private JButton getJButton2() {
if (jButton2 == null) {
jButton2 = new JButton();
jButton2.setBounds(new Rectangle(190, 120, 80, 50));
jButton2.setText("退出");
jButton2.addActionListener(this);
}
return jButton2;
}




public void actionPerformed(ActionEvent e) {
if (e.getSource() == jButton) {
String str1 = jTextField.getText();
String str2 = jTextField1.getText();
if (!(str1.equals("") && str2.equals(""))) {
String str3 = str1 + "," + str2 + "\r\n";
try {
File f = new File(this.getClass().getResource("/").getPath()+"comm.txt");
FileWriter out = new FileWriter(f, true);
out.write(str3);
out.close();
} catch (IOException e1) {
e1.toString();
}
if (str1 != "") {
list1.addElement(str1);
} else {
list1.addElement(str2);
}
this.dispose();
} else {
JOptionPane.showMessageDialog(null, "null", "系统提示",
JOptionPane.WARNING_MESSAGE);
System.out.println("********************");
this.dispose();
}

}
if (e.getSource() == jButton1) {
jTextField.setText("");
jTextField1.setText("");


}

if (e.getSource() == jButton2) {
this.dispose();


}


}


}
