import java.util.Scanner;

public class Employee_1 {
    int id;
    float salary;
    String name;

    Scanner sc = new Scanner(System.in);

    public Employee_1() {
        System.out.print("Enter the id of employee: ");
        id = sc.nextInt();

        System.out.print("Enter the salary: ");
        salary = sc.nextFloat();

        System.out.print("Enter the Name: ");
        name = sc.next();
    }

    public void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
