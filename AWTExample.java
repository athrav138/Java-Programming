import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");

        Label l = new Label("Enter your full Name:");
        TextField tf = new TextField(20);
        Button b = new Button("Submit");

        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
