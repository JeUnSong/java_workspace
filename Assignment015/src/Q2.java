import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Q2 extends JFrame {
	private JLabel cLabel = new JLabel();
	private JPanel cPanel = new JPanel();
	
	public Q2() {
		this.setTitle("Menu에 Action 리스너 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();	
		getContentPane().add(cLabel, BorderLayout.CENTER);
		getContentPane().add(cPanel, BorderLayout.CENTER);
		cPanel.setBackground(Color.GRAY);
		this.setSize(250,220);
		this.setVisible(true);
	}

	private void createMenu() {
		
		
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem [4];
		String[] itemTitle = {"red","green", "blue", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "red" :
				if(cLabel.getText() == "red")
					return;
				cPanel.setBackground(Color.RED);
				System.out.println("좆같다");
				break;
			case "green" :
				cPanel.setBackground(Color.GREEN);;
				break;
			case "blue" :
				cPanel.setBackground(Color.BLUE);;
				break;
			case "Exit" :
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Q2();

	}

}