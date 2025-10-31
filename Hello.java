import java.util.*;


class Base
{
  public int sum;

  public int add(int a,int b)
  {
    sum = a+b;
    return sum;
  }
}

class Derived extends Base
{
    public int mul;

    public int multi(int a,int b)
    {
      mul = a * b;
      return mul;
    }
}

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

    Derived d1 = new Derived();
    System.out.println("The sum is: "+d1.add(a, b));
    System.out.println("The multiplication is: "+d1.multi(a, b));

  }
}