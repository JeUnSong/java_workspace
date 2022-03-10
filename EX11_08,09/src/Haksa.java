import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Haksa extends JFrame{
	JTextField tfid = null;
	JTextField tfName = null;
	JTextField tfDepartment = null;
	JTextField tfAddress = null;
	JTextArea taList = null;
	JButton btnSave = null;   // insert - > Create
	JButton btnList = null;   // select - > Read
	JButton btnModify = null; // update - > Update
	JButton btnRemove = null; // delete - > Delete
	                          // DB 용어 CRUD
	
	JMenuItem menuItem1 = null;// 학생정보
	
	public Haksa() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		
		
		
		
		
		JMenuBar mb = new JMenuBar();
		JMenu menu1 = new JMenu("학생관리");
		this.menuItem1 = new JMenuItem("학생정보");
		menu1.add(this.menuItem1);
		mb.add(menu1);
		this.setJMenuBar(mb);
		
		this.menuItem1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 화면 전환
				System.out.println("학생정보 화면 로딩 ");
				
			}
		});
		

		this.add(new JLabel("학번 "));
		this.tfid = new JTextField(20);
		this.add(tfid);
		this.add(new JLabel("이름 "));
		this.tfName = new JTextField(20);
		this.add(tfName);
		this.add(new JLabel("학과 "));
		this.tfDepartment = new JTextField(20);
		this.add(tfDepartment);
		this.add(new JLabel("주소 "));
		this.tfAddress = new JTextField(20);
		this.add(tfAddress);
		
		this.taList = new JTextArea(17,23);
		this.add(new JScrollPane(taList));
		
		this.btnSave = new JButton("등록");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("등록");
				
			}});
		
		this.btnList = new JButton("목록");
		this.add(this.btnList);
		this.btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("연결완료");
					
		Statement stmt = conn.createStatement();

					ResultSet rs = stmt.executeQuery("select * from student");
					
					taList.setText(""); //목록 초기화
					
					taList.append("학번\t이름\t학과\n");
					taList.append("====================================\n");
					while(rs.next()) {
						//System.out.print(rs.getString("id")+"\t");
						//System.out.print(rs.getString("name")+"\t");
						//System.out.println(rs.getString("dept"));
						taList.append(rs.getString("id") + "\t");
						taList.append(rs.getString("name") + "\t");
						taList.append(rs.getString("dept")+ "\n");
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		
		this.btnModify = new JButton("수정");
		this.add(this.btnModify);
		this.btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("수정");
				
			}});
		
		this.btnRemove = new JButton("삭제");
		this.add(this.btnRemove);
		this.btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "삭제 하시겠습니까?,","Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION) {
					//삭제처리
					JOptionPane.showMessageDialog(null, "삭제되었습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}});
		
		
		
		this.setSize(300, 530);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();

	}

}
