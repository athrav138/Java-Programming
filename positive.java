import java.util.Scanner;

public class positive 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    if(n>0)
    {
      System.out.println("THe number "+n+" is positive.");
    }
    else
    {
      System.out.println("The number "+n+" is negative");
    }
  }
}