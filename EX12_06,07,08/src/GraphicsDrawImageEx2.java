import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx2 extends JFrame {
private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx2() {
		this.setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		this.setSize(200, 300);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx2();

	}

}