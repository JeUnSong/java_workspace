import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame{
	JTextField tfId = null;
	JTextField tfPw = null;
	JButton btnLogin = null;
	JButton btnSign = null;

DefaultTableModel model=null;
JPanel panel2;
	Login(){
		
		  setTitle("학사관리시스템 로그인"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);

		  this.tfId = new JTextField("아이디");
		  this.tfId.setLocation(240,390);
		  this.tfId.setSize(150,25);
		  this.add(tfId);
		  
		  this.tfPw = new JTextField("비밀번호");
		  this.tfPw.setLocation(240,420);
		  this.tfPw.setSize(150,25);
		  this.add(tfPw);
		  //this.tfPw.setEchoChar('*');
		  
		  this.btnLogin = new JButton("로그인");
		  this.btnLogin.setLocation(405,392);
		  this.btnLogin.setSize(75,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			//DB에 있는 아이디 비밀번호 정보를 가지고 IF 조건문에 넣어야함
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tfId.getText().equals("테스트") && tfPw.getText().equals("테스트")) {
						dispose(); // 이전창 닫기
						panel2.removeAll(); //모든컴포넌트 삭제
						panel2.revalidate(); //다시 활성화
						panel2.repaint();    //다시 그리기
						panel2.add(new Haksa()); //화면 생성.
						panel2.setLayout(null);//레이아웃적용안함
				}else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해 주세요.", "로그인 오류", JOptionPane.ERROR_MESSAGE);
				}
			}});
		  this.add(btnLogin);
		  
		  this.btnSign = new JButton("아직 회원이 아니신가요 ?");
		  this.btnSign.setLocation(240,460);
		  this.btnSign.setSize(200,30);
		  this.btnSign.setBackground(new Color(238, 238, 238));
		  this.btnSign.setFont(new Font("굴림체", Font.PLAIN, 13));
		  this.btnSign.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				panel2.removeAll(); //모든컴포넌트 삭제
				panel2.revalidate(); //다시 활성화
				panel2.repaint();    //다시 그리기
				panel2.add(new SignUp()); //화면 생성.
				panel2.setLayout(null);//레이아웃적용안함
				
			}});
		  this.add(btnSign);
		  
		  panel2=new JPanel();//panel생성
		  this.add(panel2);//프레임에 패널 추가
		  
		  
		  setSize(700,600);  
		  setVisible(true);
		
	}
	public static void main(String[] args) {
		  
		  new Login();
	 }
}
