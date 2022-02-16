import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	JTextField tf1 = (new JTextField(10));
	JTextField tf2 = (new JTextField(10));
	JTextField tf3 = (new JTextField(10));
	JTextField tf4 = (new JTextField(10));
	JLabel lb1 = (new JLabel("apple"));
	JLabel lb2 = (new JLabel("cherry"));
	JLabel lb3 = (new JLabel("strawberry"));
	JLabel lb4 = (new JLabel("prune"));
	
	
	public Q3() {
		this.setTitle("차트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel pl = new JPanel();
		pl.add(lb1);
		pl.add(tf1);
		pl.add(lb2);
		pl.add(tf2);
		pl.add(lb3);
		pl.add(tf3);
		pl.add(lb4);
		pl.add(tf4);
		pl.setBackground(Color.GRAY);
		container.add(pl, BorderLayout.NORTH);
		container.add(panel, BorderLayout.CENTER);
		
		tf1.addActionListener(new MyActionListener());
		tf2.addActionListener(new MyActionListener());
		tf3.addActionListener(new MyActionListener());
		tf4.addActionListener(new MyActionListener());
		
		//여기서부터
		double a = Integer.parseInt(tf1.getText());
		double c = Integer.parseInt(tf2.getText());
		double s = Integer.parseInt(tf3.getText());
		double p = Integer.parseInt(tf4.getText());
		
		double all = a+c+s+p;
                                                                //어떻게 처리하냐 씨발
		double apple = a/all*100;
		double cherry = c/all*100;
		double strawberry = s/all*100;
		double prune = p/all*100;	
		
		//System.out.println ((int)Math.round(apple));
		//System.out.println((int)Math.round(cherry));
		//System.out.println((int)Math.round(strawberry));
		//System.out.println((int)Math.round(prune));
		// 여기까지 
		
		this.setSize(800,800);
		this.setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			
		   }
		
	}
	 class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			

			g.setColor(Color.RED);
			g.setFont(new Font("Times New Roman",Font.ITALIC,30));
			g.drawString("apple"+"%", 80, 50);
			
			g.setColor(Color.BLUE);
			g.setFont(new Font("Times New Roman",Font.ITALIC,30));
			g.drawString("cherry"+"%", 220, 50);
			
			g.setColor(Color.MAGENTA);
			g.setFont(new Font("Times New Roman",Font.ITALIC,30));
			g.drawString("strawberry"+"%", 380, 50);
			
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Times New Roman",Font.ITALIC,30));
			g.drawString("prune"+"%", 600, 50);
			
		}
	 
	}

	public static void main(String[] args) {
		new Q3();

	}

}
