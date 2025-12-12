import java.util.Scanner;

interface Car
{
  int highSpeed = 200;

  void speedup(int n);
  void speeddown(int n);
}

class Audi implements Car
{

  int speed = 0;

  public void speedup(int n)
  {
    speed += n;
  }

  public void speeddown(int n)
  {
    speed -= n;
  } 

  void display()
  {
    System.out.println("Speed: "+speed);
  }
}
public class Interface1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    Audi a1 = new Audi();
    a1.display();
    a1.speedup(12);
    a1.display();
    a1.speeddown(3);
    a1.display();
    
  }
}