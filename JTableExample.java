import javax.swing.*;

public class JTableExample
{
  public static void main(String[] args)
  {
    JFrame j = new JFrame("JTablel Example");

    Object [][]data =
    {
      {01,"Atharv"},
      {02,"Rucha"},
      {03,"Dipika"},
      {04,"Manali"},
      {05,"Namrata"}
    };

    String []col = {"Roll NO","Name"};

    JTable jt = new JTable(data,col);
    j.add(jt);
    j.setSize(1000,1500);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}