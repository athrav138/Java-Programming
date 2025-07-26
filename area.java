import java.util.Scanner;

public class area{

  public static void main(String[] args){
    Scanner S=new Scanner(System.in);

    System.out.print("Enter the length of rectangle:");
    float length=S.nextFloat();

    System.out.print("Enter the breadth of rectangle:");
    float breadth=S.nextFloat();

    double area=length*breadth;

    System.out.println("The area of rectangle is:"+area);

    
  }

}