import javax.swing.*;
import java.awt.*;
//1.예제9-5 화면을 FlowLayout을 사용하여 작성하시오.
public class Q1 extends JFrame {
	public Q1() {
		this.setTitle("Assignment012_1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		Container in= this.getContentPane();
		
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField("",10));
		
		this.setSize(180,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Q1();

	}

}