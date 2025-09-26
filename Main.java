import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int a = sc.nextInt();

    System.out.println("ENter an intger: ");
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println("The sum is: " + sum);

    System.out.println("Enter a string:");
    String str = sc.next();
    sc.close();

    System.out.println("Your entered string is: "+str);
  }
}