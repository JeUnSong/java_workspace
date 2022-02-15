import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx( ) {
		this.setTitle("이미지 버튼 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedicon = new ImageIcon("images/pressedicon.gif");
		
		// 3개의 이미지를 가진 버튼 생성
		JButton btn = new JButton("call~~", normalIcon); // normalIcon용 이미지 등록
		btn.setPressedIcon(pressedicon); // pressedicon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		c.add(btn);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
