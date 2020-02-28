package javalargeprogram;



import javax.swing.*;
import java.awt.*;

//定义自已的MyPanel，用于实现画图
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

    //覆盖JPanel的paint方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("宋体", Font.BOLD, size));
        g.drawString(ss, x, y);
    }
}

