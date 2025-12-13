import java.awt.FlowLayout;
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Example");

        f.setLayout(new FlowLayout());
        f.add(new JLabel("Enter Full Name:"));
        f.add(new JTextField(20));

        f.add(new JLabel("Enter addresssfsdsadfafasdf: "));
        f.add(new JTextField(150));


        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
