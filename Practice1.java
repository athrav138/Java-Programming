import java.util.*;

public class Practice1
{

      void print(String s)
    {
        System.out.println(s);
        return;
    }

    public static int multiply(int a,int b)
    {
        return a+b;
    }

    public static int factorial(int a)
    {
        if (a<0)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(a==0 || a==1)
        {
            return 1;
        }
        else return a*factorial(a-1);
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

/*
        System.out.print("Enter a string: ");
        String str = sc.next();

        Practice1 p = new Practice1();
        p.print(str);

        int x =10,y=20;
        int sum = Practice1.multiply(x,y);

        System.out.println(sum);
*/

System.out.println("Enter a number: ");
int n=sc.nextInt();
System.out.println("The factorial of "+n+"  is: "+factorial(n));


    }
}
