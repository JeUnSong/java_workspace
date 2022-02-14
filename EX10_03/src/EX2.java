import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX2 extends JFrame implements ActionListener {
	public EX2 () {
		this.setTitle("Action 이벤트 리스너 작성");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(this);
		c.add(btn);
		
			
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); 
		if(b.getText().equals("Action")) {
			b.setText("액션"); 
		}else {
			b.setText("Action"); 
		}
		
	}

}
