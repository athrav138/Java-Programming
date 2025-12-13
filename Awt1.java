import java.awt.*;

public class Awt1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("HEllo World");

    Label l = new Label("Enter full name: ");
    TextField tf= new TextField(200);
    Label l1 = new Label("Enter Phone: ");
    TextField tf1 = new TextField(300);

    Button b = new Button("Submit");

    f.setLayout(new FlowLayout());
        f.add(l);
        f.add(tf);
        f.add(l1);
        f.add(tf1);
        f.add(b);

        f.setSize(300, 200);
        f.setVisible(false);

  }
}