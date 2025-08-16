import java.util.Scanner;

public class power
{
  public static int power(int a,int b)
  {
    int pow = 1;
    for(int i=1;i<=b;i++)
    {
      pow *= a;
    }

    return pow;
    
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a,b;

    System.out.print("Enter number: ");
    a = sc.nextInt();

    System.out.print("Enter power: ");
    b = sc.nextInt();

    System.out.println("The "+b+"th power of "+a+" is : "+power(a,b));

  }
}