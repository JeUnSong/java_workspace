import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	
	JTextField tfidna = null;
	JTextField tfpw = null;
	JTextField tfid = null;
	JTextField tfname = null;
	JTextField tfemail = null;
	JTextField tfcernu = null;
	
	JLabel title = null;
	JLabel jlidna = null;
	JLabel jlpw = null;
	JLabel jlid = null;
	JLabel jlname = null;
	JLabel jlemail = null;
	JLabel jlcernu = null;
	
	JButton btnCertification = null;
	JButton btnSummit = null;
	
	SignUp(){
		
		  
		this.setLayout(null);
		
	    this.title = new JLabel("회 원 가 입");
	    this.title.setFont(new Font("맑은 고딕", Font.BOLD, 20));
	    this.title.setLocation(275,250);
		this.title.setSize(150,25);
		this.add(title);
	    
		this.jlidna = new JLabel("아이디 ");
	    this.jlidna.setLocation(70,320);
		this.jlidna.setSize(150,25);
		this.add(jlidna);
		
		this.tfidna = new JTextField(15);
		this.tfidna.setLocation(120,320);
		this.tfidna.setSize(150,25);
		this.add(tfidna);
		
		this.jlpw = new JLabel("비밀번호 ");
	    this.jlpw.setLocation(360,320);
		this.jlpw.setSize(150,25);
		this.add(jlpw);
		
		this.tfpw = new JTextField(15);
		this.tfpw.setLocation(420,320);
		this.tfpw.setSize(150,25);
		this.add(tfpw);
		
		this.jlid = new JLabel("학    번 ");
	    this.jlid.setLocation(70,360);
		this.jlid.setSize(150,25);
		this.add(jlid);
		
		this.tfid = new JTextField(15);
		this.tfid.setLocation(120,360);
		this.tfid.setSize(150,25);
		this.add(tfid);
		
		this.jlname = new JLabel("이        름 ");
	    this.jlname.setLocation(360,360);
		this.jlname.setSize(150,25);
		this.add(jlname);
		
		this.tfname = new JTextField(15);
		this.tfname.setLocation(420,360);
		this.tfname.setSize(150,25);
		this.add(tfname);
		
		this.jlemail = new JLabel("EMAIL ");
	    this.jlemail.setLocation(70,400);
		this.jlemail.setSize(150,25);
		this.add(jlemail);
		
		this.tfemail = new JTextField(100);
		this.tfemail.setLocation(120,400);
		this.tfemail.setSize(150,25);
		this.add(tfemail);
		
		this.btnCertification = new JButton("인증메일 받기");
		this.btnCertification.setLocation(135,430);
		this.btnCertification.setSize(120,25);
	    this.add(btnCertification);
		
	    this.jlcernu = new JLabel("인증번호 ");
	    this.jlcernu.setLocation(360,400);
		this.jlcernu.setSize(150,25);
		this.add(jlcernu);
		
		this.tfcernu = new JTextField(15);
		this.tfcernu.setLocation(420,400);
		this.tfcernu.setSize(150,25);
		this.add(tfcernu);
		
		this.btnSummit = new JButton("가입하기");
		this.btnSummit.setLocation(270,480);
		this.btnSummit.setSize(120,30);
	    this.add(btnSummit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setSize(700,600);
		this.setVisible(true);
		
	}

}
