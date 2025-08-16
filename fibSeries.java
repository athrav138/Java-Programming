import java.util.Scanner;

public class fibSeries
{
  public static int fibSeries(int x)
  {
    if(x==0){
      return 0;
    }

    else if(x==1){
      return 1;
    }

    else
    return fibSeries(x-1) + fibSeries(x-2);
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    System.out.println("The fibbonacci series is :");
    for(int i=0;i<a;i++)
    {
    System.out.print(" "+fibSeries(i));
    }
  }
}