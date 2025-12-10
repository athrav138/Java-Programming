package College;
import java.util.*;

 class Student123
{
  int roll;
  String name;

  public Student123(Scanner sc)
  {
  System.out.println("Enter roll no: ");
  roll = sc.nextInt();
  System.out.println("Enter name: "); 
  name = sc.next();
  }

  public void display()
  {
    System.out.println("Roll no: " + roll);
    System.out.println("Name: " + name);
  }
};

public class st1udent
{
    public static void main(String[] args)
    {
      System.out.println("Package");
        
    }
}
