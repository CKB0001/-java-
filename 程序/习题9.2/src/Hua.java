import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class Hua extends JFrame{ 
	public Hua() 
	{
		super("Ã‚9.2");
		setSize(480,480);
		setVisible(true);
	}
	Color d=new Color(3,2,1);
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.black);
		int x[]=new int[4];
		int y[]=new int [4];
		for(int i=0;i<3;i++) 
		{
			x[i]=(int)(Math.random()*480);
			y[i]=(int)(Math.random()*480);
		}	
		x[3]=x[0];
		y[3]=y[0];
		g.fillPolygon(x, y, 4);
		
		g.setColor(Color.blue);
		int w[]=new int[4];
		int q[]=new int [4];
		for(int i=0;i<3;i++) 
		{
			w[i]=(int)(Math.random()*480);
			q[i]=(int)(Math.random()*480);
		}	
		w[3]=w[0];
		q[3]=q[0];
		g.fillPolygon(w, q, 4);
		g.setColor(Color.gray);
		int a[]=new int[4];
		int b[]=new int [4];
		for(int i=0;i<3;i++) 
		{
			a[i]=(int)(Math.random()*480);
			b[i]=(int)(Math.random()*480);
		}	
		a[3]=a[0];
		b[3]=b[0];
		g.fillPolygon(a, b, 4);
		
	}
	
}
