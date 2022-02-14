import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//1.예제9-5 화면을 FlowLayout을 사용하여 작성하시오.
public class MouseAdapertEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapertEx() {
		this.setTitle("Mouse 이벤트 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MyMouseAdapert()); // z컨텐트팬에 Mouse 이벤트 리스너 달기
			
		
		c.setLayout(null);
		la.setSize(50, 20); 
		la.setLocation(30,30);
		c.add(la); 
		
		this.setSize(250, 250);
		this.setVisible(true);
	}
	
	// MouseAdapter를 상속받아 리스너 구현
	class MyMouseAdapert extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
		int x = e.getX(); // 마우스 클릭 좌표 x
		int y = e.getY(); // 마우스 클릭 좌표 y
		la.setLocation(x, y); //레이블의 위치를 (x,y)로 이동
	}
}
	
	public static void main(String[] args) {
		new MouseAdapertEx();

	}

}
