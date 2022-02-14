import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); // 프레임 타이틀 달기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우 닫으면 프로그램을 종료하도록 설정
		
		Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다.
		contentPane.setBackground(Color.orange); // 컨텐트 팬의 색을 오랜지 색으로
		contentPane.setLayout(new FlowLayout()); // 컨텐트 팬에 FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("OK")); // 버튼 달기
		contentPane.add(new JButton("Cancel")); // 버튼달기
		contentPane.add(new JButton("Ignore")); // 버튼 달기
		
		this.setSize(300,150); // 프레임 크기 300x150 설정
		this.setVisible(true); // 화면에 프레임 출력
		
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
