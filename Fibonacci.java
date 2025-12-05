
public class Fibonacci{

  public static int fibo(int n)
  {
    if(n==0)
    {
      return 0;
    }
    else if(n==1)
    {
      return 1;
    }
    else
      return fibo(n-1) + fibo(n-2);
  }

  public  static void main(String[] args)
  {

    System.out.println("The Fibonacci series is: ");
    for(int i=0;i<10;i++)
    {
      System.out.print(" "+fibo(i));
    }

    System.out.println("\nTHe series of fibonacci is: ");
    System.out.print(" 0 1");
    int p1 = 0;
    int p2 = 1;
    for(int i=1;i<9;i++)
    {
    
      int next = p1 + p2;
      p1 = p2;
      p2 = next;
      System.out.print(" "+next);
    }
  }
  
}
