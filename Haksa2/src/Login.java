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
	
	Font font = new Font("���ʷҹ���", Font.BOLD, 12);
	

DefaultTableModel model=null;
JPanel panel2;
	Login(){
		
		  setTitle("�л�����ý��� �α���"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);
		  
		  this.jlId = new JLabel("���̵� ");
		  this.jlId.setLocation(185,350);
		  this.jlId.setSize(150,100);
		  this.jlId.setFont(font);
		  this.add(jlId);
		  
		  this.tfId = new JTextField();
		  this.tfId.setLocation(240,390);
		  this.tfId.setSize(150,25);
		  this.add(tfId);
		  
		  this.jlPw = new JLabel("��й�ȣ ");
		  this.jlPw.setLocation(175,380);
		  this.jlPw.setSize(100,100);
		  this.jlPw.setFont(font);
		  this.add(jlPw);
		  
		  this.tfPw = new JPasswordField();
		  this.tfPw.setLocation(240,420);
		  this.tfPw.setSize(150,25);
		  this.add(tfPw);
		  this.tfPw.setEchoChar('*');
		  
		  
		  
		  this.btnLogin = new RoundedButton("�α���");
		  this.btnLogin.setFont(font);
		  this.btnLogin.setLocation(405,392);
		  this.btnLogin.setSize(75,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String pw = "";
				
				for(char cha : tfPw.getPassword()) {
					Character.toString(cha);
					pw+=(pw.equals("")) ? ""+cha+"" : ""+cha+"";
				}
				
				
				
				if(tfId.getText().equals("zzangjh5") && pw.equals("1q2w3e4r!")) {
						JOptionPane.showMessageDialog(null, "ȯ���մϴ�.", "�α��� �Ϸ�", JOptionPane.INFORMATION_MESSAGE);
						dispose(); // ����â �ݱ�
						panel2.removeAll(); //���������Ʈ ����
						panel2.revalidate(); //�ٽ� Ȱ��ȭ
						panel2.repaint();    //�ٽ� �׸���
						panel2.add(new Haksa()); //ȭ�� ����.
						panel2.setLayout(null);//���̾ƿ��������
						
				}else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ���� �ּ���.", "�α��� ����", JOptionPane.ERROR_MESSAGE);
				}
			}});
		  this.add(btnLogin);
		  
// ȸ������ �ʿ� �����
//		  this.btnSign = new JButton("���� ȸ���� �ƴϽŰ��� ?");
//		  this.btnSign.setLocation(240,460);
//		  this.btnSign.setSize(200,30);
//		  this.btnSign.setBackground(new Color(238, 238, 238));
//		  this.btnSign.setFont(new Font("����ü", Font.PLAIN, 13));
//		  this.btnSign.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				panel2.removeAll(); //���������Ʈ ����
//				panel2.revalidate(); //�ٽ� Ȱ��ȭ
//				panel2.repaint();    //�ٽ� �׸���
//				panel2.add(new SignUp()); //ȭ�� ����.
//				panel2.setLayout(null);//���̾ƿ��������
//				
//			}});
		  
		  
//		  this.add(btnSign);
		  
		  panel2=new JPanel();//panel����
		  this.add(panel2);//�����ӿ� �г� �߰�
		  
		 



		
		  
		  
		  setSize(700,600);  
		  setVisible(true);
		
	}
	public static void main(String[] args) {
		  new Login();
	 }
}
