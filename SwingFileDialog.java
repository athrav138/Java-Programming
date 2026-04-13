import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SwingFileDialog extends JFrame implements ActionListener {

    JButton b;

    public SwingFileDialog() {
        setTitle("File Chooser Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        b = new JButton("Open File");
        add(b);

        b.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println("Selected File: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        new awt2();
    }
}