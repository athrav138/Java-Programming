import java.util.*;

public class Practice2  {

    public static int avg(int a,int b,int c)
    {
        return (a+b+c)/3;
    }

    public static int pow(int x,int n) {
        if(n==0) {
            return 1;
        }
        if (n==1) {
            return x;
        }
        else
            return pow(x,n-1)*x;
    }


    public static void power(int x,int n)
    {
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            pow *= x;
        }
        System.out.println("The power is: "+pow);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/* THe average of three numbers using the function
        ---------------------------------------------------------------
        int n1,n2,n3;

        System.out.print("Enter three Number: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.print("The average of three Numbers is: "+avg(n1,n2,n3));
        --------------------------------------------------------------------
*/
/* the count of zero, positive and negative numbers in the list entered until user wants
        ---------------------------------------------------------------
        int pcount = 0;
        int ncount = 0;
        int zcount = 0;
        int n;
 boolean choice = true;
        while(choice)
        {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if(n==0)
            {
                zcount++;
            }
            else if(n>0)
            {
                pcount++;
            }
            else {
                ncount++;
            }

            System.out.println("Enter choice: ");
            choice = sc.nextBoolean();

            System.out.println("The count  of Zero is: "+zcount);
            System.out.println("The count  of Positive numbers  is: "+pcount);
            System.out.println("The count of  Negative numbers is: "+ncount);
            ----------------------------------------------------------------
*/

        //System.out.print("The pow is:  "+pow(2,5));
        power(2,5);


    }
}