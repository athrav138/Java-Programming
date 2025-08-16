import java.util.Scanner;

public class sumOfOdd
{
  public static int sumOdd(int n)
  {
    int sum = 0;
    for(int i=1;i<=n;i++)
    {
      if(i%2!=0)
      {
      sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    

    System.out.print("The sum of 1 to "+a+" odd number is: "+sumOdd(a));

  }
}