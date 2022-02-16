import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		this.setTitle("drawString 사용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel); // 생성한 panel 패널을 컨텐트맨으로 사용
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	//JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바는 ㅈ같다~~", 30, 30); // 패널 (30, 30) 위치에 문자열 출력
			g.drawString("얼마나? 하늘만큼 땅만큼 ~ " , 60, 60); // 패널 (60,60) 위치에 문자열 출력
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
