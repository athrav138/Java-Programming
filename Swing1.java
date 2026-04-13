import java.awt.*;
import javax.swing.*;


public class Swing1
{
  public Swing1()
  {
    JFrame j = new JFrame("Swing Components");
    j.setSize(1000,2000);
    j.setVisible(true);
    j.setLayout(new FlowLayout());
    j.add(new JLabel("Name:"));
    j.add(new JTextField(30));
    j.add(new JLabel("Adress:"));
    JTextArea a = new JTextArea();
    j.add(new TextField(30));
    j.add(new JButton("Submit"));
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args)
  {
    new Swing1();
  }
}