import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame {
private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx1() {
		this.setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		this.setSize(300, 420);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
			
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx1();

	}

}