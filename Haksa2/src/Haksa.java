import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Haksa extends JFrame{
	JTextField tfid = null;
	JTextField tfpw = null;
	JButton btnLogin = null;
	
 JPanel panel;  // 메뉴별 화면이 출력되는 패널
 Haksa(){
  setTitle("학사관리시스템"); 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼 누르면 프로그램 종료
  
  JMenuBar bar=new JMenuBar();
  
  JMenu m_student=new JMenu("학생관리");//File메뉴
  bar.add(m_student);
  JMenu m_book=new JMenu("도서관리");//Edit메뉴
  bar.add(m_book);
  
  JMenuItem mi_list=new JMenuItem("학생정보");
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
  
  panel=new JPanel();//panel생성
  add(panel);//프레임에 패널 추가
  
  Container c= getContentPane();
  c.setLayout(null);
  
  tfid = new JTextField("아이디");
  tfid.setLocation(280,350);
  tfid.setSize(150,25);
  c.add(tfid);
  
  tfpw = new JTextField("비밀번호");
  tfpw.setLocation(280,380);
  tfpw.setSize(150,25);
  c.add(tfpw);
  
  btnLogin = new JButton("로그인");
  btnLogin.setLocation(445,352);
  btnLogin.setSize(75,50);
  c.add(btnLogin);
  
  //아이디 비밀번호 로그인 있으니 아무것도 실행안됨
  
  setJMenuBar(bar);
  setSize(800,600);  
  setVisible(true);
 }
 public static void main(String[] args) {
  
  new Haksa();
 }

}