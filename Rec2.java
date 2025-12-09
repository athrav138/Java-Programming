import java.util.*;

public class Rec2
{
    // Normal recursive power function
    public static int pow(int x, int n)
    {
        if (n == 0)
            return 1;

        if (x == 0)
            return 0;

        return x * pow(x, n - 1);
    }

    // Optimized recursive power function (fast exponentiation)
    public static int pow1(int x, int n)
    {
        if (n == 0)
            return 1;

        if (x == 0)
            return 0;

        if (n == 1)
            return x;

        int half = pow1(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int x = sc.nextInt();

        System.out.print("Enter power: ");
        int n = sc.nextInt();

        System.out.println("Normal recursion result  : " + pow(x, n));
        System.out.println("Optimized recursion result: " + pow1(x, n));
    }
}
