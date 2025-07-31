import java.util.Scanner;

public class adult{
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter age:");
    int age=sc.nextInt();

    if(age>18){
      System.out.println("THe age is "+age+"  so the age is greater than 18 and the person is adult.");
    }
    else{
      System.out.println("THe age is "+age+" less than 18 and the person is not adult ");
    }


  }
}