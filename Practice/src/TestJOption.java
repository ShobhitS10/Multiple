import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestJOption extends WindowAdapter {
	JFrame f;
	public TestJOption() {
	    f=new JFrame();   
	    f.addWindowListener(this);  
	    f.setSize(0, 0);
	    f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
	    f.setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
		if(a==JOptionPane.YES_OPTION){  
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args) {
		new TestJOption();
	}

}
