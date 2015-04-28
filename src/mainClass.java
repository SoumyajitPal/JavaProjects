import javax.swing.JFrame;


public class mainClass extends JFrame {

	public static void main(String args[]){
		GUI g = new GUI();
		g.setVisible(true);
		g.setSize(750, 300);
		g.setLocation(300, 250);
		g.setResizable(false);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
	}
	
}
