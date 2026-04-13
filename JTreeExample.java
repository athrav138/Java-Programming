import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample 
{
  public static void main(String[] args)
  {
    JFrame j = new JFrame("Tree Structure in Java");

    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Top");
    
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
    DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
    DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
    DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A3");

    a.add(a1);
    a.add(a2);
    a.add(a3);

    DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
    DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
    DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
    DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");

    b.add(b1);
    b.add(b2);
    b.add(b3);

    top.add(a);
    top.add(b);

    JTree jt = new JTree(top);

    j.add(jt);

    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setSize(100,200);
    j.setVisible(true);
  }
}