import java.util.Scanner;

class Arithmetic
{
  int a,b;

  Arithmetic(int a,int b)
  {
    int sum = a + b;
    System.out.println("The addition is:  "+sum);
  }


  
};

public class calculator
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    Arithmetic a1 = new Arithmetic(a,b);
    
  }
}