import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo extends JFrame implements ActionListener
{
  JComboBox<String> cb;
  public ComboBoxDemo()
  {
    setTitle("ComboBox");
    setSize(100,200);
    setLayout(new FlowLayout());

    String items[] = {"C","C++","JAVA","Python"};
    cb = new JComboBox<>(items);
    add(cb);
    cb.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    System.out.println("Selected Item: "+cb.getSelectedItem());
    System.out.println("Selected Item INdex: "+cb.getSelectedIndex());
  }

  public static void main(String[] args)
  {
    new ComboBoxDemo();
  }
}