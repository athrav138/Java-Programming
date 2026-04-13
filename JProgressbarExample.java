import javax.swing.*;
import java.awt.*;

public class JProgressbarExample
{
  public static void main(String[] args)
  {
    JFrame jf = new JFrame("Progress Bar Example");
    jf.setLayout(new FlowLayout());

    JProgressBar pb1 = new JProgressBar(SwingConstants.VERTICAL,0,100);
    pb1.setValue(50);
    jf.add(pb1);

    JProgressBar pb2 = new JProgressBar(SwingConstants.HORIZONTAL,0,100);
    pb2.setValue(70);
    pb2.setString("Marks");
    jf.add(pb2);

    jf.setSize(1000,2000);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pb2.setStringPainted(true);

  }
}