import java.util.Scanner;

public class function1
{
  public static void print(String name)
  {
    System.out.println("Name is=" +name);
    return;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the name: ");
    String name = sc.nextLine();

    print(name);

  }
}