import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener () {
		this.setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());                                  
		c.add(btn);
		
		this.setSize(350,150);
		this.setVisible(true);
	}
	// 내부 클래스로 Action 리스너 작성
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); // 이벤트 소스 버튼 알아내기
			if(b.getText().equals("Action")) // 버튼문자열이 "Action"인지 비교
				b.setText("액션"); // 버튼의 문자열을 "액션"으로 변경
			else
				b.setText("Action"); // 버튼의 문자열을 "Action" 으로 변경
			
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText());
	  }
	}

	public static void main(String[] args) {
		new InnerClassListener();
	

	}
}

