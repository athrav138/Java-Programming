import java.util.Scanner;

public class gdb
{
    
  public static int gdb1(int a,int b)
  {
    if(a>b){
        if(a%b==0){
            return b;
        }
        for(int i=a;i>=1;i--)
        {
          if(a%i==0 && b%i==0){
            return i;
          }

        }
    }
    else{
        for(int i=b;i>=1;i--)
        {
          if(a%i==0 && b%i==0){
            return i;
          }

        }
    }
    return 1;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int a,b;

    System.out.print("Enter num1: ");
    a = sc.nextInt();

    System.out.print("Enter num2: ");
    b = sc.nextInt();

    System.out.println("The greatest common divisor of "+a+" and  "+b+" is : "+gdb1(a,b));
    return;
  }
}