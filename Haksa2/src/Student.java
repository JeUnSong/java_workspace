import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel{
	JTextField tfId = null;
	JTextField tfName = null;
	JTextField tfDepartment = null;
	JTextField tfAddress = null;
	JTextArea taList = null;
	RoundedButton btnSave = null;   // insert - > Create
	RoundedButton btnList = null;   // select - > Read
	RoundedButton btnModify = null; // update - > Update
	RoundedButton btnRemove = null; // delete - > Delete
	                          // DB 용어 CRUD
	RoundedButton btnSearch=null;
	
	DefaultTableModel model=null; // 테이블에 들어가는 데이터
	JTable table=null;            // 테이블
	
	JMenuItem menuItem1 = null; // 학생정보
	
	
	Font font = new Font("함초롬바탕", Font.PLAIN, 10);
	public Student() {
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("학번 "));
		this.tfId = new JTextField(15);
		this.add(tfId);
		
		this.btnSearch = new RoundedButton("검색");
		this.add(this.btnSearch);
		this.btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();

					ResultSet rs = stmt.executeQuery("select * from student where id='"+tfId.getText()+"'");
					
					model.setRowCount(0); // 목록 초기화
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
						
						tfId.setText(rs.getString("id"));
						tfName.setText(rs.getString("name"));
						tfDepartment.setText(rs.getString("dept"));
						tfAddress.setText(rs.getString("address"));
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});

		this.add(new JLabel("이름 "));
		this.tfName = new JTextField(20);
		this.add(tfName);
		
		this.add(new JLabel("학과 "));
		this.tfDepartment = new JTextField(20);
		this.add(tfDepartment);
		
		this.add(new JLabel("주소 "));
		this.tfAddress = new JTextField(20);
		this.add(tfAddress);
		
		 String colName[]={"학번","이름","학과","주소"};
		 this.model=new DefaultTableModel(colName,0);
		 this.table = new JTable(this.model);
		 this.table.setPreferredScrollableViewportSize(new Dimension(250,280));// 테이블 크기 330px x 200px
		 this.table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				    table=(JTable)e.getComponent();//클릭한 테이블 구하기
				    model=(DefaultTableModel)table.getModel();//테이블의 모델 구하기
				    
				    String no=(String)model.getValueAt(table.getSelectedRow(), 0); // 학번
			        tfId.setText(no);
			        
	        	    String name=(String)model.getValueAt(table.getSelectedRow(), 1); // 이름
				    tfName.setText(name);
				    
				    String dept_id=(String)model.getValueAt(table.getSelectedRow(), 2); // 학과
				    tfDepartment.setText(dept_id);
				    
				    String address=(String)model.getValueAt(table.getSelectedRow(), 3); // 주소
				    tfAddress.setText(address);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			});
		 
		 JScrollPane sp=new JScrollPane(this.table);
		 this.add(sp);
		 
		this.btnSave = new RoundedButton("등록");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();
		
					stmt.executeUpdate("insert into student values('"+tfId.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"','"+tfAddress.getText()+"')");

					ResultSet rs = stmt.executeQuery("select * from student");
					
					model.setRowCount(0); // 목록 초기화
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// 버튼 이미지 변경필요
		this.btnList = new RoundedButton("목록");
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
					
					model.setRowCount(0); // 목록 초기화
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// 버튼 이미지 변경필요
		this.btnModify = new RoundedButton("수정");
		this.add(this.btnModify);
		this.btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("연결완료");
					
					Statement stmt = conn.createStatement();
					
					stmt.executeUpdate("update student set name='"+tfName.getText()+"',dept='"+tfDepartment.getText()+"',address='"+tfAddress.getText()+"'where id='"+tfId.getText()+"'");

					ResultSet rs = stmt.executeQuery("select * from student");
					
					model.setRowCount(0); // 목록 초기화
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);


					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// 버튼 이미지 변경필요
		this.btnRemove = new RoundedButton("삭제");
		this.add(this.btnRemove);
		this.btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "삭제 하시겠습니까?,","Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION) {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
						System.out.println("연결완료");
						
						Statement stmt = conn.createStatement();
						
						stmt.executeUpdate("delete from student where id='"+tfId.getText()+"'");

						ResultSet rs = stmt.executeQuery("select * from student");
						
						model.setRowCount(0); // 목록 초기화
						while(rs.next()) {
							String[] row=new String[4];
							row[0]=rs.getString("id");
							row[1]=rs.getString("name");
							row[2]=rs.getString("dept");
							row[3]=rs.getString("address");
							model.addRow(row);
						}
						rs.close();
						stmt.close();
						conn.close();
						
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "삭제되었습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}});	
		this.setSize(280, 530);
		this.setVisible(true);
	}

}
