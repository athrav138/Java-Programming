import java.util.Scanner;

public class input1{

  public static void main(String[] args){
    Scanner S=new Scanner(System.in);

    //Integers input
    int num1,num2;

    System.out.print("Enter the number:");
    num1 = S.nextInt();

    System.out.println("The number is:"+num1);

    System.out.print("Enter the number:");
    num2 = S.nextInt();

    System.out.println("The number is: "+num2);

    S.nextLine();

    //String input
    String name;
    System.out.print("Enter the name:");
    name = S.nextLine();

    System.out.println("Name is:"+name);

    //Flaot input
    Float x,y;

    System.out.print("Enter the two decimal numbers:");
    x=S.nextFloat();
    y=S.nextFloat();

    System.out.println("The addition of two float numbers is:"+(x+y));

  }

}