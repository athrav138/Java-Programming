import java.util.Scanner;

class Employee
{
   private int empId;
   private float sal;
    private String name;

        Employee(Scanner sc)
    {
        System.out.print("ENter employee id: ");
        empId = sc.nextInt();
        System.out.print("Enter salary: ");
        sal = sc.nextFloat();
        System.out.print("Enter name: ");
        name = sc.next();
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Id: "+empId);
        System.out.println("Salary: "+sal);
    }
}

class Emp_halfTime extends Employee
{
  int time;

  Emp_halfTime(Scanner sc)
  {
    super(sc);
    System.out.print("ENter the time of work:");
    time = sc.nextInt();
  }

  public void display()
  {
    super.display();
    System.out.println("TIme: "+time);
  }
}

class Full_time extends Employee
{
    String role;
    Full_time(Scanner sc)
    {
          super(sc);
        System.out.print("Enter role: ");
        role = sc.next();
    }
    
    public void display()
    {
        super.display();
        System.out.println("Role: "+role);
    }
}

public class Employees
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter details of half time employee:");
       Emp_halfTime emp = new Emp_halfTime(sc);
        System.out.println("******Details of half time employee:*****");
        emp.display();

        System.out.println("\n\nEnter details of full time employee:");
       Full_time emp1 = new Full_time(sc);
       System.out.println("******Details of full time employee:******");
       emp1.display();
    }
}