import java.util.*;


interface InterfaceA
{
  int a=10;
  void methodA();
}

interface InterfaceB
{
  int b=20;
  void methodB();
}

class addition implements InterfaceA, InterfaceB
{
  public void methodA()
  {
    System.out.println("Value of a: " + a);
  }
  
  public void methodB()
  {
    System.out.println("Value of b: " + b);
  }
  
  public void displaySum()
  {
    System.out.println("Sum of a and b: " + (a + b));
  }
}


public class Multiple_Inheritance
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    

    addition obj = new addition();
    obj.methodA();
    obj.methodB();
    obj.displaySum();

    scanner.close();
  }
}