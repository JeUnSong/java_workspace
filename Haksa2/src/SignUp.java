// �������� �ʱ���� 



//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.table.DefaultTableModel;
//
//public class SignUp extends JFrame {
//	
//	JTextField tfIdna = null;
//	JTextField tfPw = null;
//	JTextField tfId = null;
//	JTextField tfName = null;
//	JTextField tfEmail = null;
//	JTextField tfCernu = null;
//	
//	JLabel title = null;
//	JLabel jlIdna = null;
//	JLabel jlPw = null;
//	JLabel jlId = null;
//	JLabel jlName = null;
//	JLabel jlEmail = null;
//	JLabel jlCernu = null;
//	
//	JButton btnCertification = null;
//	JButton btnSummit = null;
//	
//	DefaultTableModel model=null;
//	
//	//���� ���� ���۱����� ����
//	//�׿� �ƹ��͵� ���� �ȵ�
//	//(�̸������� / ���ԿϷ�â �˾� �� ����ȭ������ �̵� / �ڷΰ��� / ��й�ȣ Ȯ�� / ���)
//	
//	
//	SignUp(){
//		
//		  
//		this.setLayout(null);
//		
//	    this.title = new JLabel("ȸ �� �� ��");
//	    this.title.setFont(new Font("���� ���", Font.BOLD, 20));
//	    this.title.setLocation(275,250);
//		this.title.setSize(150,25);
//		this.add(title);
//	    
//		this.jlIdna = new JLabel("���̵� ");
//	    this.jlIdna.setLocation(70,320);
//		this.jlIdna.setSize(150,25);
//		this.add(jlIdna);
//		
//		this.tfIdna = new JTextField(15);
//		this.tfIdna.setLocation(120,320);
//		this.tfIdna.setSize(150,25);
//		this.add(tfIdna);
//		
//		this.jlPw = new JLabel("��й�ȣ ");
//	    this.jlPw.setLocation(360,320);
//		this.jlPw.setSize(150,25);
//		this.add(jlPw);
//		
//		this.tfPw = new JTextField(15);
//		this.tfPw.setLocation(420,320);
//		this.tfPw.setSize(150,25);
//		this.add(tfPw);
//		
//		this.jlId = new JLabel("��    �� ");
//	    this.jlId.setLocation(70,360);
//		this.jlId.setSize(150,25);
//		this.add(jlId);
//		
//		this.tfId = new JTextField(15);
//		this.tfId.setLocation(120,360);
//		this.tfId.setSize(150,25);
//		this.add(tfId);
//		
//		this.jlName = new JLabel("��        �� ");
//	    this.jlName.setLocation(360,360);
//		this.jlName.setSize(150,25);
//		this.add(jlName);
//		
//		this.tfName = new JTextField(15);
//		this.tfName.setLocation(420,360);
//		this.tfName.setSize(150,25);
//		this.add(tfName);
//		
//		this.jlEmail = new JLabel("EMAIL ");
//	    this.jlEmail.setLocation(70,400);
//		this.jlEmail.setSize(150,25);
//		this.add(jlEmail);
//		
//		this.tfEmail = new JTextField(100);
//		this.tfEmail.setLocation(120,400);
//		this.tfEmail.setSize(150,25);
//		this.add(tfEmail);
//		
//		this.btnCertification = new JButton("��������(�̱���)");
//		this.btnCertification.setLocation(135,430);
//		this.btnCertification.setSize(120,25);
//	    this.add(btnCertification);
//		
//	    this.jlCernu = new JLabel("������ȣ ");
//	    this.jlCernu.setLocation(360,400);
//		this.jlCernu.setSize(150,25);
//		this.add(jlCernu);
//		
//		this.tfCernu = new JTextField("�̱���");
//		this.tfCernu.setLocation(420,400);
//		this.tfCernu.setSize(150,25);
//		this.add(tfCernu);
//		
//		this.btnSummit = new JButton("�����ϱ�");
//		this.btnSummit.setLocation(270,480);
//		this.btnSummit.setSize(120,30);
//		this.btnSummit.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
//					System.out.println("����Ϸ�");
//					
//					Statement stmt = conn.createStatement();
//		
//					stmt.executeUpdate("insert into member values('"+tfIdna.getText()+"','"+tfPw.getText()+"','"+tfId.getText()+"','"+tfName.getText()+"','"+tfEmail.getText()+"')");
//
//					ResultSet rs = stmt.executeQuery("select * from member");
//					
//					model.setRowCount(0); // ��� �ʱ�ȭ
//					while(rs.next()) {
//						String[] row=new String[5];
//						row[0]=rs.getString("tfIdna");
//						row[1]=rs.getString("tfPw");
//						row[2]=rs.getString("tfId");
//						row[3]=rs.getString("tfName");
//						row[4]=rs.getString("tfEmail");
//						model.addRow(row);
//					}
//					rs.close();
//					stmt.close();
//					conn.close();
//				}catch(Exception e1) {
//					e1.printStackTrace();
//				}
//				
//			}});
//				
//	    this.add(btnSummit);
//
//		this.setSize(700,600);
//		this.setVisible(true);
//		
//	
//	}
//}
