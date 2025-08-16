import java.util.Scanner;

public class factNum
{
  public static int fact1Num(int x)
  {
    if(x<0){
      System.out.println("Invalid Input!");
      return 0;
        }
    /*if(x==0 || x==1){
      return 1;
    }

    else
    return x * fact1Num(x-1);*/

    int fact = 1;
    for(int i=1;i<=x;i++){
      fact *= i;
    }

    return fact;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

  
    System.out.print("The factorial of "+a+" is: "+fact1Num(a));
  }
}