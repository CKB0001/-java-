import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Zhu9_8 extends JFrame implements MouseListener{
	public JFrame jframe;
	public JList jlist1;
	public JList jlist2;
	public DefaultListModel listModel1;
	public DefaultListModel listModel2;
	@SuppressWarnings("rawtypes")
	public void init()
	{
		JFrame jframe=new JFrame("œ∞Ã‚9.8");
		Container pane=jframe.getContentPane();
		pane.setLayout(new GridLayout(1,2));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listModel1=new DefaultListModel();
		listModel1.addElement("First");
		listModel1.addElement("Second");
		listModel1.addElement("Third");
		listModel2 =new DefaultListModel();
		listModel2.addElement("one");
		listModel2.addElement("two");
		listModel2.addElement("three");
		jlist1=new JList(listModel1);
		
		jlist2=new JList(listModel2);
		jlist1.addMouseListener(this);
		jlist2.addMouseListener(this);
		pane.add(jlist1);
		pane.add(jlist2);
		jframe.pack();
		jframe.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		//TODO Auto-generated method stub
		if(e.getSource()==jlist1) 
		{
			int index=jlist1.locationToIndex(e.getPoint());
			Object o=jlist1.getModel().getElementAt(index);
			listModel2.addElement(o);
		}
		if(e.getSource()==jlist2)
		{
			int index=jlist2.locationToIndex(e.getPoint());
			Object o=jlist2.getModel().getElementAt(index);
			listModel1.addElement(o);
		}
	}
	@Override
	
	public void mousePressed(MouseEvent e)
	{
		//TODO Auto-generated method stub
	}
	public void mouseReleased(MouseEvent e)
	{
		//TODO Auto-generated method stub
	}
	public void mouseEntered(MouseEvent e)
	{
		//TODO Auto-generated method stub
	}
	public void mouseExited(MouseEvent e)
	{
		//TODO Auto-generated method stub
	}
	public static void main(String args[]) {
		new Zhu9_8().init();
	}
	
}
