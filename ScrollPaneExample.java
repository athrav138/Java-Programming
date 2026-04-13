import javax.swing.*;
import java.awt.*;

public class ScrollPaneExample
{
  public static void main(String[] args)
  {
    JFrame jf = new JFrame("Scroll Pane Example");

    JTextArea jt = new JTextArea(10,20);
    jf.setLayout(new FlowLayout());
    JScrollPane js = new JScrollPane(jt,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    jf.add(new JLabel("Write text"));
    jf.add(new JButton("Open"));
    jf.add(js);
    
    jf.setSize(400,300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
  }
}