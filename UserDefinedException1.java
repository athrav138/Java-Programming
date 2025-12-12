import java.util.Scanner;

class MyException1 extends RuntimeException {
    MyException1(String message) {
        super(message);
    }
}

public class UserDefinedException1 {

    public static int divide(int a, int b) {
        // validate first and throw custom exception if invalid
        if (b == 0) {
            throw new MyException1("Custom runtime error: divisor b must not be zero");
        }

        try {
            int div = a / b;   // safe now because b != 0
            return div;
        } 
        catch (ArithmeticException e) {
            // defensive: normally won't run because we checked b==0
            System.out.println("ArithmeticException caught: " + e.getMessage());
            return -1;
        } 
        finally {
            System.out.println("It always runs");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();

            System.out.println("Result: " + divide(a, b));
        } 
        catch (MyException1 me) {                     // <-- fixed type here
            System.out.println("Caught MyException1 in main: " + me.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
