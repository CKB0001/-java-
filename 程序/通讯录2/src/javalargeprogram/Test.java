package javalargeprogram;

import javax.swing.JFrame;

public class Test {
	 public static void main(String[] args) {
	        JFrame f = new MyContacts();
	        f.setTitle(f.getClass().getSimpleName());
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setBounds(400, 200, 1000, 600);
	        f.setVisible(true);
	    }
}
