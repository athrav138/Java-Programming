import javax.swing.*;
import java.awt.*;

public class JToolTipExample
{
  public static void main(String[] args)
  {
    JFrame jf = new JFrame("JTooltip Example");
    
    jf.setLayout(new FlowLayout());
    jf.setSize(1000,2000);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton b = new JButton("Submit");
    
    b.setToolTipText("Submit the Form");
    jf.add(b);
    jf.setVisible(true);

  }
}