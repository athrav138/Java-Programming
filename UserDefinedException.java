import java.util.Scanner;

class MyException extends RuntimeException {
    MyException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static int divide(int a, int b) {
        try {
            int div = a / b;
            return div;
        } 
        catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed.");
            return -1;
        } 
        catch (Exception e) {
            System.out.println("Any other Exception: " + e);
            // unchecked exception can be thrown directly
            throw new MyException("Custom runtime error from divide()");
        } 
        finally {
            System.out.println("It always runs");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result: " + divide(19, 3));
        sc.close();
    }
}
