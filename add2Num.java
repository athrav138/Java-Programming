import java.util.Scanner;

public class add2Num
{
  public static int addNum(int x,int y)
  {
    return x + y;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a,b;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    System.out.print("Enter num2: ");
    b = sc.nextInt();

    System.out.print("The sum of "+a+" and "+b+" is: "+addNum(a,b));

  }
}