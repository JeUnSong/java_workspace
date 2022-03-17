import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

Font font = new Font("���ʷҹ���", Font.PLAIN, 12);	
 JPanel panel;  // �޴��� ȭ���� ��µǴ� �г�
 Haksa(){
  setTitle("�л�����ý���"); 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư ������ ���α׷� ����
  
  Toolkit toolkit = Toolkit.getDefaultToolkit();
  Image img = toolkit.getImage("images/icon2.png");
  setIconImage(img);
  
  JMenuBar bar=new JMenuBar();
  
  
  JMenu m_student=new JMenu("�л�����");//File�޴�
  m_student.setFont(font);
  bar.add(m_student);
  JMenu m_book=new JMenu("��������");//Edit�޴�
  m_book.setFont(font);
  bar.add(m_book);
  
  JMenuItem mi_list=new JMenuItem("�л�����");
  mi_list.setFont(font);
  m_student.add(mi_list);
  
  mi_list.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //���������Ʈ ����
    panel.revalidate(); //�ٽ� Ȱ��ȭ
    panel.repaint();    //�ٽ� �׸���
    panel.add(new Student()); //ȭ�� ����.
    panel.setLayout(null);//���̾ƿ��������
    
   }});
   
  JMenuItem mi_bookRent=new JMenuItem("������");
  mi_bookRent.setFont(font);
  m_book.add(mi_bookRent);
  
  mi_bookRent.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //���������Ʈ ����
    panel.revalidate(); //�ٽ� Ȱ��ȭ
    panel.repaint();    //�ٽ� �׸���
    panel.add(new BookRent()); //ȭ�� ����.
    panel.setLayout(null);//���̾ƿ��������
    
   }});
  
  
  panel=new JPanel();//panel����
  add(panel);//�����ӿ� �г� �߰�
  

  setJMenuBar(bar);
  setSize(800,600);  
  setVisible(true);
 }
 public static void main(String[] args) {
  
  new Haksa();
 }

}