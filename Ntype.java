import java.util.Scanner;

public class Ntype{

  public static void main(String[] args){

    Scanner scan=new Scanner(System.in);

    System.out.print("Enter the number :");
    int a=scan.nextInt();

    if(a>0){
      System.out.println("The "+a+" is a positive number.");
    }
    else if(a<0){
      System.out.println("THe "+a+" Is a negative number.");
    }
    else{
      System.out.println("The number is zero");
    }

  }
}