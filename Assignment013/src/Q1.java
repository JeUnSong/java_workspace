import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q1 extends JFrame {
	
	private ImageIcon [] image = {
				new ImageIcon("images/apple.jpg"),
				new ImageIcon("images/pear.jpg"),
				new ImageIcon("images/cherry.jpg")};
	
	private JLabel imageLabel = new JLabel(image[0]);
	private JButton btnLeft = new JButton("<<");
	private JButton btnRight = new JButton(">>");
	private JPanel pnlSouth = new JPanel(new BorderLayout());
	private int index = 0;
	
	public Q1 () {
		this.setTitle("°¶·¯¸®");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		pnlSouth.add(btnRight, BorderLayout.EAST);
		pnlSouth.add(btnLeft, BorderLayout.WEST);
		pnlSouth.setBackground(Color.GRAY);
		c.add(pnlSouth, BorderLayout.SOUTH);
		c.add(imageLabel,BorderLayout.CENTER);
		
		btnLeft.addActionListener(new MyActionListener());
		btnRight.addActionListener(new MyActionListener());
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			if(jb == btnLeft) {
				if(index == 0)
				index = image.length -1;
				else
			    index -= 1;
				
			}else {
				if (index == image.length -1)
					index = 0; 
				else
					index += 1; 
			}
			imageLabel.setIcon(image[index]);

		}
	}
				
	public static void main(String[] args) {
		new Q1();

	}

}
