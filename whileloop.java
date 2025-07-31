import java.util.Scanner;

public class whileloop
{

  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

    int n;
    System.out.print("ENter the the number:");
    n=scan.nextInt();

    System.out.println("THe number of 1 to "+n+" are:");
    int i=1;
    
    while(i<=n){
      System.out.print(" "+i);
      i++;
    }

  }
}