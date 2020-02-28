

import java.awt.Event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
public  class Test9_10 extends JFrame implements MouseListener{
	private JTable jTable;
	private Object[][] cellDate= {{"姓名",new String("林楚金")},{"学号",new String("200905")},{"语文成绩",new String("86")},{"数学成绩",new String("96")},{"总分",new String("点击出总分")}};
    private String[] columnNames= {"coll","col2"};
    
    public Test9_10() {
    	DefaultTableModel Model=new DefaultTableModel(cellDate,columnNames) {
    		public boolean isCellEdiaable(int row,int column) {
    			return false;
    		}
    	};
    	jTable=new JTable(Model);
    	jTable.addMouseListener(this);
    	this.add(jTable);
    	this.setTitle("表格演示");
    	this.setSize(300,350);
    	this.setLocation(200,200);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }
public void mouseClicked(MouseEvent e) {
	DefaultTableModel tableModel=(DefaultTableModel)jTable.getModel();
	int row=jTable.getSelectedRow();
	int column=jTable.getSelectedColumn();
	if(row==4&&column==1) {
		String yuwen=(String)tableModel.getValueAt(2,column);
		String shuxue=(String)tableModel.getValueAt(3,column);
		Integer count=Integer.parseInt(yuwen)+Integer.parseInt(shuxue);
		tableModel.setValueAt(count ,row, column);
	}
}
public void mouseEntered(MouseEvent e) {
	
}
public void mouseExited(MouseEvent e) {
	
}
public void mousepressed(MouseEvent e) {
	
}
public void mouseRelesed(MouseEvent e) {
	
}
public static void main(String[] aygs) {
	new Test9_10();
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}



}

