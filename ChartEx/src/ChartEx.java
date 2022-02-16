import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChartEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ChartEx() {
		this.setTitle("Chart");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.GRAY);
		this.setContentPane(panel); // panel을 컨테이너로 설정
		
		this.setSize(600, 500);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int height=20;
			int gep=10;
			int q1=250;
			int q2=200;
			int q3=100;
			int q4=270;
			
			int gap2=50;
			
			g.drawString("1/4분기", 40, 60);
			g.fillRect(100, 50, q1, height);
			
			g.drawString("2/4분기", 40, 60+(height+gep));
			g.fillRect(100, 50+height+gep, q2, height);
			
			g.drawString("3/4분기", 40, 60+(height+gep)*2);
			g.fillRect(100, 50+(height+gep)*2, q3, height);
			
			g.drawString("3/4분기", 40, 60+(height+gep)*3);
			g.fillRect(100, 50+(height+gep)*3, q4, height);
			
			
			g.drawLine(100, 400, 100+gap2, 450-q1);
			
			g.drawLine(100+50, 450-q1, 100+gap2*2, 450-q2);

			g.drawLine(100+gap2*2, 450-q2, 100+gap2*3, 450-q3);
			
			g.drawLine(100+gap2*3, 450-q3, 100+gap2*4, 450-q4);
			
			g.setColor(Color.RED);
			g.fillArc(500, 300, 300, 300, 0, 110);
			g.setColor(Color.GREEN);
			g.fillArc(500, 300, 300, 300, 110, 85);
			g.setColor(Color.BLUE);
			g.fillArc(500, 300, 300, 300, 110+85, 45);
			g.setColor(Color.YELLOW);
			g.fillArc(500, 300, 300, 300, 110+85+45, 120);
		}
		
	}

	public static void main(String[] args) {
		new ChartEx();

	}

}
