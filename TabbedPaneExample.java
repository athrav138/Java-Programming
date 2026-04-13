import javax.swing.*;

public class TabbedPaneExample
{
  public static void main(String[] args)
  {
    JFrame j= new JFrame("Tabbed Pane Example");

    JTabbedPane jtp = new JTabbedPane();
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    p1.add(new JLabel("Panel 1"));
    p2.add(new JLabel("Panel 2"));
    p3.add(new JLabel("Panel 3"));
    p4.add(new JLabel("Panel 4"));
 
    jtp.add("First Tab",p1);
    jtp.add("Second Tab",p2);
    jtp.add("Third Tab",p3);
    jtp.add("Fourth Tab",p4);
    
    j.add(jtp);
  
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setSize(1000,2000);
    j.setVisible(true);
  }
}