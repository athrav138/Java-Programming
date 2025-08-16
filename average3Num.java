import java.util.Scanner;

public class average3Num
{
  public static int averageNum(int x,int y,int z)
  {
    return (x + y + z)/3;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a,b,c;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    System.out.print("Enter num2: ");
    b = sc.nextInt();

    System.out.print("Enter num3: ");
    c = sc.nextInt();

    System.out.print("The average of "+a+", "+b+" and "+c+" is: "+averageNum(c,a,b));

  }
}