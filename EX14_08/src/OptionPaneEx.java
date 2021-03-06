import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		this.setTitle("옵션 팬 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		this.setSize(500,200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		this.setVisible(true);
	}
	
	class MyPanel extends Panel {
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			this.setBackground(Color.LIGHT_GRAY);
			this.add(inputBtn);
			this.add(confirmBtn);
			this.add(messageBtn);
			this.add(tf);
			
			inputBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name != null)
						tf.setText(name);
					
				  }
				});
			
			confirmBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null,  "계속할 겁입니까 ?", "Confirm", JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
			
				   }
				});
			
			messageBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "Mesage",JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}
	}

	public static void main(String[] args) {
		new OptionPaneEx();

	}

}
