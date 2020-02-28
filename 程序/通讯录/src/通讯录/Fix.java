package 通讯录;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fix extends JFrame implements ActionListener {
private DefaultListModel list1;
private static String old;
private static String name;

private static String path1=null;


private static final long serialVersionUID = 1L;


private JPanel jContentPane = null;


private JLabel jLabel = null;


private JLabel jLabel1 = null;


private JTextField jTextField = null;


private JTextField jTextField1 = null;


private JButton jButton = null;


private JButton jButton1 = null;


private JButton jButton2 = null;



public Fix(DefaultListModel list,String name,String old1) {
super();
this.list1 = list;
this.old=old1;
this.name=name;
path1=this.getClass().getResource("/").getPath()+"comm.txt";
initialize();
}


private void initialize() {
this.setBounds(180, 140, 290, 190);
this.setContentPane(getJContentPane());
this.setUndecorated(true);
// TODO Auto-generated method stub


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
jTextField = new JTextField(name);
jTextField.setBounds(new Rectangle(112, 29, 155, 33));
jTextField.setEditable(true);
}


return jTextField;
}


private JTextField getJTextField1() {
if (jTextField1 == null) {
jTextField1 = new JTextField(old);
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
replaceTxt(name+","+old+"\r\n",str3);
if (str1 != "") {
list1.addElement(str1);
} else {
list1.addElement(str2);
}
this.dispose();
} else {
JOptionPane.showMessageDialog(null, "undo", "系统提示",
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
public static void replaceTxt(String oldStr, String replaceStr) {
String temp = "";
try {
File file = new File(path1);
FileInputStream fis = new FileInputStream(file);
InputStreamReader isr = new InputStreamReader(fis);
BufferedReader br = new BufferedReader(isr);
StringBuffer buf = new StringBuffer();
// 保存该行前面的内容
for (int j = 1; (temp = br.readLine()) != null
&& !temp.equals(oldStr); j++) {
buf = buf.append(temp);
buf = buf.append(System.getProperty("line.separator"));
}
// 将内容插入
buf = buf.append(replaceStr);
// 保存该行后面的内容
while ((temp = br.readLine()) != null) {
buf = buf.append(System.getProperty("line.separator"));
buf = buf.append(temp);
}
br.close();
FileOutputStream fos = new FileOutputStream(file);
PrintWriter pw = new PrintWriter(fos);
pw.write(buf.toString().toCharArray());
pw.flush();
pw.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
