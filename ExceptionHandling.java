import java.util.*;

public class ExceptionHandling
{
    public static int divide(int a, int b)
    {
        int div;
        try
        { s
            div = a / b;
            return div;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero is not allowed.");
            return -1;   // return a default value
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Result: " + divide(19, 0));
    }
}
