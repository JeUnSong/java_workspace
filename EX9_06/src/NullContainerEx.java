import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		this.setTitle("Null Container Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 제거
		
		//JLabel 컴포넌트 생성하고 위치와 크기를 직접 지정한다.
		JLabel la =new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		// 9개의 버튼 컴포넌트를 생성하고 모두 동일한 크기로 설정한다.
		//위치는 서로 다르게 지정
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i*15, i*15); // 버튼의 위치 설정
			b.setSize(50, 20);
			c.add(b);
		}
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();

	}

}
