import java.util.Scanner;

public class forloop{

  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

    int n;
    System.out.print("ENter the the number:");
    n=scan.nextInt();

    System.out.println("THe number of 1 to "+n+" are:");
    int i;
    for( i=1;i<=n;i++){
      System.out.print(" "+i);
    }

  }
}