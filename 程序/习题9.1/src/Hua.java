import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Hua extends JFrame{
	public Hua()
	{
		super("œ∞Ã‚9.1");
		setSize(200,250);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		int q=40;
		for(int i=0;i<10;i++)
		{
		g.drawLine((q+10*i),40,(q+10*i),240);
		}
		for(int i=1;i<=6;i++)
		{
			g.drawLine(40,(q*i),130,(q*i));
		}
	}
	
}
