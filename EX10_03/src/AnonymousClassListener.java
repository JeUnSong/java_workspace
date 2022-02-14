import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener () {
		this.setTitle("Action 이벤트 리스너 작성");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource(); 
				if(b.getText().equals("Action")) {
					b.setText("액션"); 
				}else {
					b.setText("Action"); 
				}
				// AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수있음
			}
		});
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
