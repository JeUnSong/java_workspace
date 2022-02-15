import javax.swing.*;
import java.awt.*;

public class RedioButtonEx extends JFrame {
	public RedioButtonEx() {
		this.setTitle("라디오버튼 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); //  해제 상태 이미지
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); // 선택 상태 이미지
		
		// 버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup();
		
		// 라디오버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		
		cherry.setBorderPainted(true); // 체크박스 외각선이 보이도록 설정
		cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록
		
		// 버튼 그룹에 3개의 라디오 버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// 컨텐트팬에 3개의 라디오버튼 삽입
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new RedioButtonEx();

	}

}