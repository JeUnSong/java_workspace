import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineEx() {
		this.setTitle("drawString 사용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel); // 생성한 panel 패널을 컨텐트맨으로 사용
		
		this.setSize(1000, 800);
		this.setVisible(true);
	}
	
	//JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			g.drawLine(20, 20, 100, 100);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
