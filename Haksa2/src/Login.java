// 그림

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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame{
	JTextField tfId = null;
	JPasswordField tfPw = null;
	RoundedButton btnLogin = null;
	JButton btnSign = null;
	
	JLabel jlId = null;
	JLabel jlPw = null;
	JLabel jllogo = null;
	
	Font font = new Font("함초롬바탕", Font.BOLD, 12);
	

DefaultTableModel model=null;
JPanel panel2;
	Login(){
		
		  setTitle("학사관리시스템 로그인"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);
		  
		  this.jlId = new JLabel("아이디 ");
		  this.jlId.setLocation(195,350);
		  this.jlId.setSize(150,100);
		  this.jlId.setFont(font);
		  this.add(jlId);
		  
		  this.tfId = new JTextField();
		  this.tfId.setLocation(250,390);
		  this.tfId.setSize(150,25);
		  this.add(tfId);
		  
		  this.jlPw = new JLabel("비밀번호 ");
		  this.jlPw.setLocation(185,380);
		  this.jlPw.setSize(100,100);
		  this.jlPw.setFont(font);
		  this.add(jlPw);
		  
		  this.tfPw = new JPasswordField();
		  this.tfPw.setLocation(250,420);
		  this.tfPw.setSize(150,25);
		  this.add(tfPw);
		  this.tfPw.setEchoChar('*');
		  
		  
		  
		  this.btnLogin = new RoundedButton("로그인");
		  this.btnLogin.setFont(font);
		  this.btnLogin.setLocation(415,392);
		  this.btnLogin.setSize(75,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String pw = "";
				
				for(char cha : tfPw.getPassword()) {
					Character.toString(cha);
					pw+=(pw.equals("")) ? ""+cha+"" : ""+cha+"";
				}
				
				
				
				if(tfId.getText().equals("1") && pw.equals("1")) {
						JOptionPane.showMessageDialog(null, "환영합니다.", "로그인 완료", JOptionPane.INFORMATION_MESSAGE);
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
		  
// 회원가입 필요 없어보임
//		  this.btnSign = new JButton("아직 회원이 아니신가요 ?");
//		  this.btnSign.setLocation(240,460);
//		  this.btnSign.setSize(200,30);
//		  this.btnSign.setBackground(new Color(238, 238, 238));
//		  this.btnSign.setFont(new Font("굴림체", Font.PLAIN, 13));
//		  this.btnSign.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				panel2.removeAll(); //모든컴포넌트 삭제
//				panel2.revalidate(); //다시 활성화
//				panel2.repaint();    //다시 그리기
//				panel2.add(new SignUp()); //화면 생성.
//				panel2.setLayout(null);//레이아웃적용안함
//				
//			}});
		  
		  
//		  this.add(btnSign);
		  
		  this.jllogo = new JLabel("Welcome to Management!");
		  this.jllogo.setLocation(260,270);
		  this.jllogo.setSize(370,550);
		  this.jllogo.setFont(font);
		  this.add(jllogo);
		  
		  panel2=new JPanel();//panel생성
		  this.add(panel2);//프레임에 패널 추가
		  
		 

		  setSize(700,600);  
		  setVisible(true);
		
	}
	public static void main(String[] args) {
		  new Login();
	 }
}
