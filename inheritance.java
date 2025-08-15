import java.util.Scanner;

class d2
{
  int x,y;

  void display()
  {
    System.out.println("The x="+x+" y="+y+" .\n");
  }
};
class d3 extends d2
{
  int z;
@Override
  void display()
  {
    System.out.println("The x="+x+" y="+y+" z="+z+".\n");
  }
};

public class inheritance
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    d3 d = new d3();
    d.x=1;
    d.y=2;
    d.z=3;
    d.display();
  }
}