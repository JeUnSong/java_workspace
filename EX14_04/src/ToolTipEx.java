import java.awt.*;
import javax.swing.*;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	
	public ToolTipEx() {
		this.setTitle("툴팁 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		this.setSize(400,150);
		this.setVisible(true);
	}
	
	private void createToolBar() {
		
		JToolBar bar = new JToolBar("kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		bar.add(saveBtn);
		bar.add(new JLabel("Search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요.");
		bar.add(tf);
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("c#");
		combo.addItem("C");
		combo.addItem("C++");
		bar.add(combo);
		
		contentPane.add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();

	}

}
