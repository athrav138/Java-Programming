import java.awt.*;

public class FileDialog1
{
    public static void main(String[] args)
    {
        Frame f = new Frame("File Dialog Example");

        FileDialog fd = new FileDialog(f,"Select File",FileDialog.LOAD);
        fd.setVisible(true);
    
        String file = fd.getFile();
        String Directory =  fd.getDirectory();

        System.out.println("File: "+file);
        System.out.println("Directory:"+Directory);
        //System.out.println("Files:"+fd.getFiles());


    }
}