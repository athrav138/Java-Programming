import java.util.*;

class College
{
  public int a;

  public void  input(Scanner sc)
  {
    System.out.print("Enter a: ");
    a = sc.nextInt();
  }
}


public class Student1
{
    void sum(int a,int b)
{
  System.out.println("The sum of a and b is: "+(a+b));
}

  public static void main(String []args)
  {

    Scanner sc = new Scanner (System.in);

     int b;

     System.out.print("Enter the number: ");
     b = sc.nextInt();

     College c = new College();
     c.input(sc);
     Student1 s = new Student1();
     s.sum(c.a,b);

  }
}