import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTree1
{
  public static void main(String[] args)
  {
    JFrame j = new JFrame("JTree Example");

    DefaultMutableTreeNode departments = new DefaultMutableTreeNode("Departments");
    
      DefaultMutableTreeNode sales = new DefaultMutableTreeNode("Sales");
        DefaultMutableTreeNode amol = new DefaultMutableTreeNode("Amol");
        DefaultMutableTreeNode sandip = new DefaultMutableTreeNode("Sandip");
        DefaultMutableTreeNode aakash = new DefaultMutableTreeNode("Aakash");

        sales.add(amol);
        sales.add(sandip);
        sales.add(aakash);

      DefaultMutableTreeNode marketing = new DefaultMutableTreeNode("Marketing");
        DefaultMutableTreeNode manali = new DefaultMutableTreeNode("Manali");
        DefaultMutableTreeNode teena = new DefaultMutableTreeNode("Teena");

        marketing.add(manali);
        marketing.add(teena);

      DefaultMutableTreeNode manufacturing = new DefaultMutableTreeNode("Manufacturing");
        DefaultMutableTreeNode kedar = new DefaultMutableTreeNode("Kedar");
        DefaultMutableTreeNode ajay = new DefaultMutableTreeNode("Ajay");

        manufacturing.add(kedar);
        manufacturing.add(ajay);

        departments.add(sales);
        departments.add(marketing);
        departments.add(manufacturing);

        JTree jt = new JTree(departments);

        j.add(jt);


    
    j.setSize(1000,2000);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}