import java.util.Scanner;

public class evenodd{
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number:");
    int num=sc.nextInt();

    if(num%2==0){
      System.out.println("The number is even ="+num);
    }
    else{
      System.out.println("The number is odd ="+num);
    }


  }
}