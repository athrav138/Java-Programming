import java.util.Scanner;

public class checkN{
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number:");
    int num=sc.nextInt();

    if(num>0) {
      System.out.println("The number is postive ="+num);
    }
    else if(num<0) {
      System.out.println("The number is negative ="+num);
    }
    else {
      System.out.println("The number is zero");
    }


  }
}