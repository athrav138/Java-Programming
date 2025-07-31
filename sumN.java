import java.util.Scanner;

public class sumN
{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

    int n,sum=0  ;
    System.out.print("ENter the the number:");
    n=scan.nextInt();

    System.out.println("THe number of 1 to "+n+" are:");
    int i=1;
    
    do{
      sum=sum+i;
      i++;
    }while(i<=n);

    System.out.println("The sum of 1 to "+i+" numbers is :"+sum);

  }
}