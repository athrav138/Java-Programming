import java.util.Scanner;

public class Student {
    int roll;
    float percent;
    String name;

 Scanner sc = new Scanner (System.in);
    public Student() {
        System.out.print("\nEnter the roll number: ");
        roll = sc.nextInt();

        System.out.print("Enter the percentage: ");
        percent = sc.nextFloat();

        System.out.print("Enter the name: ");
        name = sc.next();
    }

    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percent: " + percent);
    }
}
