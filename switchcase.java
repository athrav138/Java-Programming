import java.util.Scanner;

public class switchcase{
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number(1,2,3):");
    int num=sc.nextInt();

    switch(num){

      case 1:
      System.out.println("Hello!");
      break;

      case 2:
      System.out.println("Namaste!");
      break;

      case 3:
      System.out.println("Bonjour!");
      break;

      default:
      System.out.println("The choice is not correct.");
    }


  }
}