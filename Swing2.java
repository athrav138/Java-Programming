import java.awt.*;
import javax.swing.*;

public class Swing2{
  public static void main(String[] args)
  {
    JFrame j = new JFrame("Swing Components");
    JButton jb = new JButton("Submit") ;
    JTextField jtf = new JTextField(30);
    JLabel jl = new JLabel("Name");
    JTextArea jta = new JTextArea();

    j.setSize(1000,2000);
    j.setLayout(new FlowLayout());
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    j.add(jb);
    j.add(jl);
    j.add(jta);
    j.add(jtf);
  }
}