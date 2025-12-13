import java.awt.*;

public class Awt1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("Student Info");
    Frame f1 = new Frame("College Info");

    Label l = new Label("Enter full name: ");
    TextField tf= new TextField(50);
    Label l1 = new Label("Enter Adress: ");
    TextField tf1 = new TextField(20);

    Label l2 = new Label("Enter College name: ");
    TextField tf2 = new TextField(50);
    Label l3 = new Label ("Enter College adress: ");
    TextField tf3 = new TextField(30);


    Button b = new Button("Submit");

    f.setLayout(new FlowLayout());
        f.add(l);
        f.add(tf);
        f.add(l1);
        f.add(tf1);
        f.add(b);

    f1.setLayout(new FlowLayout());
        f1.add(l2);
        f1.add(tf2);
        f1.add(l3);
        f1.add(tf3);
        f1.add(b);

        f.setSize(300, 200);
        f.setVisible(true);

  }
}