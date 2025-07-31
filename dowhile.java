import java.util.Scanner;

public class dowhile
{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

    int n;
    System.out.print("ENter the the number:");
    n=scan.nextInt();

    System.out.println("THe number of 1 to "+n+" are:");
    int i=1;
    
    do{
      System.out.print(" "+i);
      i++;
    }while(i<=n);

  }
}