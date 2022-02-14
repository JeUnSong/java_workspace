import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayoutEx Sample"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = this.getContentPane();
		
		// 컨텐트팬에 FlowLayout 배치 관리자 설정
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30, 40));
	
		c.add(new JButton("add"));
		c.add(new JButton("sub")); 
		c.add(new JButton("mul")); 
		c.add(new JButton("div")); 
		c.add(new JButton("Calculate")); 
		
		this.setSize(300,200); 
		this.setVisible(true); 
		
	}

	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}