import java.awt.*;
import java.awt.event.*;

public class awt2 extends Frame implements ActionListener {

    Button b;

    public awt2() {
        setTitle("File Dialog Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        b = new Button("Open File");
        add(b);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        FileDialog fd = new FileDialog(this, "Select File", FileDialog.LOAD);
        fd.setVisible(true);

        String file = fd.getFile();
        String dir = fd.getDirectory();

        if (file != null) {
            System.out.println("Selected File: " + file);
            System.out.println("Directory: " + dir);
        }
    }

    public static void main(String[] args) {
        new awt2();
    }
}