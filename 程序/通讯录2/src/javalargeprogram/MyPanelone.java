package javalargeprogram;



import javax.swing.*;
import java.awt.*;

//�������ѵ�MyPanel������ʵ�ֻ�ͼ
class MyPanelone extends JPanel {
    private String ss;
    private int x;
    private int y;
    private int size;

    public MyPanelone(String ss, int x, int y, int size) {
        this.ss = ss;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    //����JPanel��paint����
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("����", Font.BOLD, size));
        g.drawString(ss, x, y);
    }
}

