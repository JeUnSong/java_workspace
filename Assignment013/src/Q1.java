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
	int img;
	
	public Q1 () {
		this.setTitle("갤러리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		pnlSouth.add(btnRight, BorderLayout.EAST);
		pnlSouth.add(btnLeft, BorderLayout.WEST);
		pnlSouth.setBackground(Color.GRAY);
		c.add(pnlSouth, BorderLayout.SOUTH);
		c.add(imageLabel,BorderLayout.CENTER);
		
		btnLeft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				img --; 
				img += image.length;	
				img %= image.length; 
				if(img == 0) {
					btnLeft.setEnabled(false);
					System.out.print("끝");
				}
				imageLabel.setIcon(image[img]); // 이미지 레이블에 이미지 변경
				
			}});
		btnRight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				img ++;
				img %= image.length;  
				if(img == 0) {
					btnRight.setEnabled(false);
					System.out.print("끝");
				}
				imageLabel.setIcon(image[img]); 
				
			}});
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
		
	public static void main(String[] args) {
		new Q1();

	}

}
