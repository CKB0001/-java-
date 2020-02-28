package javalargeprogram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyContacts extends JFrame{
    private MyPanelone myPaneone;
    private JPanel[] jPanels = new JPanel[7];
    private JButton[] jButtons = new JButton[4];
    private JTextField[] jTextFields = new JTextField[6];
    private JLabel[] jLabels = new JLabel[6];
    private String[] texts = new String[6];

    private class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean flag = true;
            StringBuilder s = new StringBuilder();
            String actionCommand = e.getActionCommand();
            if(actionCommand == "添加") {
                for (int i = 0; i < 6; i++) {
                    texts[i] = new String();
                    texts[i] = jTextFields[i].getText();
                    //System.out.println(texts[i]);
                    if(texts[i].equals("") || texts[i] == null) {
                        flag = false;
                        break;
                    }
                    if(i == 0) {
                        s.append(texts[i]);
                    }
                    else {
                        s.append(",").append(texts[i]);
                    }
                }
                if(flag) {
                    s.append("\n");
                    //将文本域中的内容写成一个字符串
                    String ss = s.toString();
                    //将字符串写入文件
                    FileRW.fileWrite(ss);
                    for(int i=0;i<6;i++) {
                        jTextFields[i].setText("");
                    }
                    //System.out.println(ss);
                    JFrame jFrame = new JFrame();
                    jFrame.setBounds(500, 300, 300, 300);
                    MyPanelone myPanelone = new MyPanelone("添加成功", 100, 100, 20);
                    jFrame.add(myPanelone);
                    jFrame.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            e.getWindow().dispose();
                        }
                    });
                    jFrame.setVisible(true);
                }
                else {
                    JFrame jFrame = new JFrame();
                    jFrame.setBounds(500, 300, 300, 300);
                    MyPanelone myPanelone = new MyPanelone("请把所有内容都填写完整", 60, 100, 15);
                    jFrame.add(myPanelone);
                    jFrame.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            e.getWindow().dispose();
                        }
                    });
                    jFrame.setVisible(true);
                }


            }
            else if(actionCommand == "清空") {
                for(int i=0;i<6;i++) {
                    jTextFields[i].setText("");
                }
            }
            else if(actionCommand == "退出") {
                System.exit(0);
            }
            else if(actionCommand == "查找") {
                JFrame frame = new JFrame("输入");

                JPanel jPanel = new JPanel();
                JPanel jPanel1 = new JPanel();
                JLabel jLabel = new JLabel("输入查找人的名字");
                JButton jButton = new JButton("确定");
                JTextField jTextField = new JTextField(30);
                jPanel.add(jLabel);
                jPanel.add(jTextField);
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String actionCommand1 = e.getActionCommand();
                        String dest = jTextField.getText();
                        String findresult = FileRW.fileRead(dest);
                        if(findresult == null) {
                            for(int i=0;i<6;i++) {
                                jTextFields[i].setText("");
                            }
                            JFrame jFrame = new JFrame();
                            jFrame.setBounds(500, 300, 300, 300);
                            MyPanelone myPanelone = new MyPanelone("未找到该用户", 100, 100, 20);
                            jFrame.add(myPanelone);
                            jFrame.addWindowListener(new WindowAdapter() {
                                @Override
                                public void windowClosing(WindowEvent e) {
                                    e.getWindow().dispose();
                                }
                            });
                            jFrame.setVisible(true);
                            frame.dispose();
                        }
                        else {
                            String[] tempdest = findresult.split(",");
                            for(int i=0;i<6;i++) {
                                jTextFields[i].setText(tempdest[i]);
                            }
                            frame.dispose();
                        }

                    }
                });
                jPanel1.add(jButton);
                frame.add(jPanel, BorderLayout.CENTER);
                frame.add(jPanel1, BorderLayout.SOUTH);
                frame.setBounds(500, 300, 400, 300);
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        e.getWindow().dispose();
                    }
                });
                frame.setVisible(true);
            }
        }
    }

    MyContacts() {
        myPaneone = new MyPanelone("communication", 250, 60, 60);
        //myPaneone.setSize(1000, 150);
        this.add(myPaneone);
        for(int i=0;i<7;i++) {
            jPanels[i] = new JPanel();
        }

        jLabels[0] = new JLabel("姓名");
        jLabels[1] = new JLabel("邮政编码");
        jLabels[2] = new JLabel("通信地址");
        jLabels[3] = new JLabel("电话");
        jLabels[4] = new JLabel("手机");
        jLabels[5] = new JLabel("电子邮件");

        jButtons[0] = new JButton("添加");
        jButtons[1] = new JButton("查找");
        jButtons[2] = new JButton("清空");
        jButtons[3] = new JButton("退出");

        for(int i=0;i<6;i++) {
            jTextFields[i] = new JTextField(50);
        }

        //设置布局管理
        this.setLayout(new GridLayout(8, 1));

        //加入各个组件
        for(int i=0;i<6;i++) {
            jPanels[i].add(jLabels[i]);
            jPanels[i].add(jTextFields[i]);
            this.add(jPanels[i]);
        }
        for(int i=0;i<4;i++) {
            jButtons[i].addActionListener(new MyActionListener());
            jPanels[6].add(jButtons[i]);
        }
        this.add(jPanels[6]);
    }



   
}