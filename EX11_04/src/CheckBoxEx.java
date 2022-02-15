import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		this.setTitle("체크박스 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); //  해제 상태 이미지
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); // 체크 상태 이미지
		
		// 3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		
		cherry.setBorderPainted(true); // 체크박스 외각선이 보이도록 설정
		cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록
		
		// 컨텐트팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
