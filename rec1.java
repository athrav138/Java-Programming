import java.util.*;

public class rec1
{

  public static int print1(int n)
  {
    System.out.println(" "+n);
    if(n==1)
    {
      return 1;
    }
    else
      return print1(n-1);
  }

  public static int print2(int i,int n)
  {
    System.out.println(" "+i);

    if(i==n)
    {
      return n;
    }
    else
      return print2(i+1,n);
  }

  public static int sum(int n)
  {
    if(n==0)
    {
      return 0;
    }
    
    else
      return n+sum(n-1);
  }

  public static int fib(int n)
  {
    if(n==1)
    {
      return 1;
    }
    if(n==0)
    {
      return 0;
    }
    return fib(n-1) + fib(n-2);
  }

  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    // print1(5); // 5 to 1
    // print2(1,5);  // 1 to 5
    // System.out.print(sum(5));  //sum of 5 to 1

    for(int i=0;i<10;i++)
    {
      System.out.print(" "+fib(i));

    }
  }
}