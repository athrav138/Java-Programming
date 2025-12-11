import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vectors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        for(int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        System.out.println("Vector elements: " + v);

        // Example: sort the vector
        Collections.sort(v);
        System.out.println("Sorted Vector: " + v);
    }
}
