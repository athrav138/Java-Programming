import java.util.*;


public class Hello
{

  static int add(int a,int b)
  {
    return a+b;
  }

  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    int a,b;

    System.out.println("Enter a number: ");
    a = sc.nextInt();

    System.out.println("Enter a number: ");
    b = sc.nextInt();

    int sum = add(a,b);

    System.out.println("The sum of a="+a+" and b="+b+" is: "+sum);

  }
}