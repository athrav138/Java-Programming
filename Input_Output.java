//Java input and output statment 
/*
   System.out.print for the output and the next for the input
 */
import java.util.*;

public class Input_Output
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner (System.in);

    int a;
    float b;
    char ch;
    double d;
    int arr[] = new int [10];
    String s;

    System.out.print("Enter string: ");
     s = sc.nextLine();


     System.out.print("ENter a: ");
     a = sc.nextInt();

     System.out.print("Enter b: ");
     b = sc.nextFloat();

     System.out.print("Enter char ch: ");
     ch = sc.next().charAt(0);

     System.out.print("Enter double d: ");
     d = sc.nextDouble();

     
     System.out.println("Enter the array element 10: ");

     for(int i=0;i<10;i++)
     {
         arr[i] = sc.nextInt();
     }

     System.out.println("a= "+a);
     System.out.println("b= "+b);
     System.out.println("ch= "+ch);
     System.out.println("d= "+d);
     System.out.println("String= "+s);

     System.out.print("The array elements are: ");
     for(int i=0;i<10;i++)
     {
      System.out.print(" "+arr[i]);
     }

     a += b;

     d *=b;


    
  }
}