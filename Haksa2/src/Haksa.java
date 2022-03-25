import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Haksa extends JFrame{
JLabel jllogo = null;
Font font = new Font("함초롬바탕", Font.PLAIN, 12);	
JPanel panel;  // 메뉴별 화면이 출력되는 패널
 
 Haksa(){
  setTitle("학사관리시스템"); 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼 누르면 프로그램 종료
  
  Toolkit toolkit = Toolkit.getDefaultToolkit();
  Image img = toolkit.getImage("images/icon2.png");
  setIconImage(img);
  
  JMenuBar bar=new JMenuBar();
  
  JMenu m_main=new JMenu("    홈    ");//File메뉴
  m_main.setFont(font);
  bar.add(m_main);
  JMenuItem m_mainlist=new JMenuItem("홈으로");
  m_mainlist.setFont(font);
  m_main.add(m_mainlist);
  
  m_mainlist.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.removeAll(); //모든컴포넌트 삭제
	    panel.revalidate(); //다시 활성화
	    panel.repaint();    //다시 그리기
	    panel.add(new Home()); //화면 생성.
	    panel.setLayout(null);//레이아웃적용안함
		
	}});
  
  JMenu m_student=new JMenu("학생관리");//File메뉴
  m_student.setFont(font);
  bar.add(m_student);
  JMenu m_book=new JMenu("도서관리");//Edit메뉴
  m_book.setFont(font);
  bar.add(m_book);
  
  JMenuItem mi_list=new JMenuItem("학생정보");
  mi_list.setFont(font);
  m_student.add(mi_list);
  
  mi_list.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //모든컴포넌트 삭제
    panel.revalidate(); //다시 활성화
    panel.repaint();    //다시 그리기
    panel.add(new Student()); //화면 생성.
    panel.setLayout(null);//레이아웃적용안함
    
   }});
   
  JMenuItem mi_bookRent=new JMenuItem("대출목록");
  mi_bookRent.setFont(font);
  m_book.add(mi_bookRent);
  
  mi_bookRent.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //모든컴포넌트 삭제
    panel.revalidate(); //다시 활성화
    panel.repaint();    //다시 그리기
    panel.add(new BookRent()); //화면 생성.
    panel.setLayout(null);//레이아웃적용안함
    
   }});
  
	this.jllogo = new JLabel("Welcome to Management!");
	this.jllogo.setLocation(80,195);
	this.jllogo.setSize(360,550);
	this.jllogo.setFont(font);
	this.add(jllogo);
  
  panel=new JPanel();//panel생성
  add(panel);//프레임에 패널 추가

  
  setJMenuBar(bar);
  setSize(315,550);  
  setVisible(true);
 }
 public static void main(String[] args) {
  
  new Haksa();
 }

}