import java.util.Scanner;

class MyException extends Exception
{
    MyException (String message)
    {
        super(message);
    }
}
public class ExceptionHandling
{
    public static int divide(int a, int b)
    {
        int div;
        try
        { 
            div = a / b;
            return div;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero is not allowed.");
            return -1;   // return a default value
        }
        catch(Exception e)
        {
            System.out.println("Any other Exception");
            return -1;
        }
        finally
        {
            System.out.println("It always runs");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Result: " + divide(19, 3));
    }
}
