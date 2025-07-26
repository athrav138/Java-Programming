import java.util.Scanner;

public class arithmetic{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int a,b,sum,mul,div,sub;

    System.out.print("Enter the number 1:");
    a=sc.nextInt();
    System.out.print("Enter the number 2:");
    b=sc.nextInt();

    sum = a + b;
    mul = a * b;
    sub = a - b;
    div = a / b;

    System.out.println("The sum of a="+a+" and b="+b+" is:"+(a+ b ) );
    System.out.println("The difference of a="+a+" and b="+b+" is:"+(a- b ) );
    System.out.println("The product of a="+a+" and b="+b+" is:"+(a*b ) );
    System.out.println("The dividation of a="+a+" and b="+b+" is:"+(a/b ) );

    
  }

}