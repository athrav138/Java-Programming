import java.util.Scanner;

public class fact{

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number which factorial want:");
    int n = sc.nextInt();

    int fact = 1;

    for(int i=1;i<=n;i++){
      fact *= i;
    }

    System.out.println("THe factorial "+n+" of number is: "+fact);

  }
}