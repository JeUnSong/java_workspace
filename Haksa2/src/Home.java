import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel{

	JLabel hh2 = null;
	
	public Home() {
		this.setLayout(null);
		
		ImageIcon mImg2 = new ImageIcon("images/hh2.png");
		this.hh2 = new JLabel(mImg2);
		this.hh2.setLocation(30,10);
		this.hh2.setSize(250,430);
		this.add(hh2);

		this.setSize(280, 530);
		this.setVisible(true);
	}
}
