import java.awt.*;

class FileDialog2 {
    public static void main(String[] args) {

        Frame f = new Frame("File Dialog Example");

        Button b = new Button("Open File");
        b.setBounds(100,100,100,40);

        f.add(b);
        f.setLayout(null);
        f.setSize(300,200);
        f.setVisible(true);

        FileDialog fd = new FileDialog(f, "Select File", FileDialog.LOAD);

        fd.setVisible(true);
    }
}