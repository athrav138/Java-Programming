import java.util.Scanner;

class Employee_1 {
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

class Student {
    int roll;
    float percent;
    String name;

 Scanner sc = new Scanner (System.in);
    public Student(int r,float p,String n) {
        roll = r;
        percent = p;
        name = n;
    }

    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percent: " + percent);
    }
}

public class emp_stu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       Employee_1[] emp = new Employee_1[5];
        emp[0].display();

        Student S1 = new Student(101,95.88f,"Atharv");
        S1.display();
    }
}