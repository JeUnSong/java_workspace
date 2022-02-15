import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 레이블 생성
		JLabel textLabel = new JLabel("사랑해");
		
		// 이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); // 이미지 로딩
		JLabel imageLabel = new JLabel(beauty); // 이미지 레이블 생성
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // 이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화해", normalIcon, SwingConstants.CENTER); // 레이블 생성
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		this.setSize(400,600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();

	}

}
