import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//2. 현재 시간을 구해서 
//12시 미만 : Good Morning
//12~18 : Good Afternoon
//18이후 : Good Evening
//메시지를 Label에 출력하시오.

public class Q2 extends JFrame {
	LocalTime now = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

	
	int hour = now.getHour();
	int minute = now.getMinute(); 
	int second = now.getSecond();
	


	
	
	public Q2() {
		
		this.setTitle("현재시간");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JButton btn1 = new JButton("클릭1");
		btn1.setSize(100,50);
		btn1.setLocation(50,100);
		JButton btn2 = new JButton("클릭2");
		btn2.setSize(100,50);
		btn2.setLocation(220,100);
		JButton btn3 = new JButton("클릭3");
		btn3.setSize(100,50);
		btn3.setLocation(400,100);
		JLabel ct = new JLabel("현재시간 : " + hour);
		ct.setSize(300,20);
		ct.setLocation(200,50);
		JLabel ct1 = new JLabel("현재시간 : " + now);
		ct1.setSize(300,20);
		ct1.setLocation(200,10);
		btn1.addActionListener(new Button1());
		//btn2.addActionListener(new Button2());
		btn3.addActionListener(new Button3());
		c.add(ct);
		c.add(ct1);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b2 = (JButton)e.getSource();
				if(b2.getText().equals("클릭2") && ct1.getText().equals("현재시간 : " + now)) {
					b2.setText("익명");
				ct1.setText(hour +"시"+ minute+"분" + second +"초");
				
				}else {
					b2.setText("클릭2");
					ct1.setText("현재시간 : " + now);
				}
			}
		});
		
		
		
		
		if(hour <= 12) {
			ct.setText("Good Mornig");
		}else if(hour >= 12 && hour < 18) {
			ct.setText("Good Afrernoon");
		}else {
			ct.setText("Good Evening");
		}
		
		this.setSize(600, 250);
		this.setVisible(true);
		
}
	
	private class Button1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b1 = (JButton)e.getSource();
			if(b1.getText().equals("클릭1"))
				b1.setText("내부");
			else
				b1.setText("클릭1");
		}
		
	}
	
	class Button3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b3 = (JButton)e.getSource();
			if(b3.getText().equals("클릭3"))
				b3.setText("독립");
			
			else
				b3.setText("클릭3");
			
		}
		
	}

	public static void main(String[] args) {
		new Q2();
		
	}

}
