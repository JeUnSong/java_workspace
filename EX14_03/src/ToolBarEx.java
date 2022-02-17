import java.awt.*;
import javax.swing.*;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	
	public ToolBarEx() {
		this.setTitle("툴바 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	private void createToolBar() {
		
		JToolBar toolBar = new JToolBar("kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("new"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("c#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarEx();

	}

}
