import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		this.setTitle("Mouse 이벤트 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX(); // 마우스 클릭 좌표 x
				int y = e.getY(); // 마우스 클릭 좌표 y
				la.setLocation(x, y); //레이블의 위치를 (x,y)로 이동
			}

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			});
		
		c.setLayout(null);  //컨텐트팬의 배치 관리자 삭제
		la.setSize(50, 20); // 레이블의 크기 50x20
		la.setLocation(30,30);// 레이블위치 30x30
		c.add(la); // 레이블 컴포넌트 삽입
		
		this.setSize(250, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
