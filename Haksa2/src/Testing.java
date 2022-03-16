import java.awt.*;
import javax.swing.*;
class Testing extends JFrame
{
  Font font = new Font("monospaced",Font.ITALIC,10);
  public Testing()
  {
    setLocation(200,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JFileChooser  fc = new JFileChooser(".");
    setFileChooserFont(fc.getComponents());
    fc.showOpenDialog(this);
  }
  public void setFileChooserFont(Component[] comp)
  {
    for(int x = 0; x < comp.length; x++)
    {
      if(comp[x] instanceof Container) setFileChooserFont(((Container)comp[x]).getComponents());
      try{comp[x].setFont(font);}
      catch(Exception e){}//do nothing
    }
  }
  public static void main(String[] args){new Testing().setVisible(true);}
}