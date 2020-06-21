import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestJOption2 {
	public static void main(String[] args) {
		int a = JOptionPane.showConfirmDialog(new JFrame(),"Are you sure?");
		while(true) {
			if(a==JOptionPane.YES_OPTION){
				System.out.println("It's a Yes!");
			    break;
			}
			if(a==JOptionPane.NO_OPTION) {
				System.out.println("Sorry, try next time!");
				break;
			}
			if(a==JOptionPane.CANCEL_OPTION) {
				System.out.println("We'll let you know!");
				break;
			}
		}
	}
}
