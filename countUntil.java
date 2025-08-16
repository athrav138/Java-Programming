import java.util.Scanner;

public class countUntil
{
  public static void count()
  { 
        Scanner sc = new Scanner(System.in);

    int a,n=1;
    int countz=0,countp=0,countn=0;

    while(n>0)
    {

    System.out.print("Enter 0 ot exit and any other to continue: ");
    n = sc.nextInt();

    switch(n){
      case 0:
      System.out.println("The number of positive numbers is: "+countp);
    System.out.println("The number of negative numbers is: "+countn);
    System.out.println("The number of zero numbers is: "+countz);
      return;
      
      default:
      System.out.print("Enter num :");
      a = sc.nextInt();
      if(a>0)
      {
        countp++;
      }
      else if(a<0)
      {
        countn++;
      }
      else
      {
        countz++;
      }
    }
    }

    

  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    count();

  }
}