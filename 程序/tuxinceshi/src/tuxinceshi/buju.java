package tuxinceshi;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class buju implements MouseListener {
	JFrame f;
	public buju() 
	{
		f=new JFrame();
		f.setSize(300,150);
		f.setVisible(true);
		f.addMouseListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		f.setTitle("shi "+arg0.getX()+"    "+arg0.getY());
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		//f.setTitle("shi "+arg0.getX()+"    "+arg0.getY());
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		//f.setTitle("shi "+arg0.getX()+"    "+arg0.getY());
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		//f.setTitle("shi "+arg0.getX()+"    "+arg0.getY());
	}
	public static void main(String args[])
	{
		new buju();
	}
	
}
