import java.util.Scanner;

public class greaterNum
{
  public static int greaterNum(int x,int y)
  {
    if(x>y)
    {
    return x;
    }
    else
    {
      return y;
    }
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a,b;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    System.out.print("Enter num2: ");
    b = sc.nextInt();

    System.out.print("The greater among "+a+" and "+b+" is: "+greaterNum(a,b));

  }
}