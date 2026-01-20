import java.util.Scanner;

class Department
{
    String dept_name;
 
    public Department(String d_n){
        dept_name = d_n;
    }
}

class Student extends Department
{
    String name;
    int roll_no;

    public Student(String d_n, String n,int r){
        super(d_n);
        name = n;
        roll_no = r;
    }

    
}

class Marks extends Student
{
    int m1,m2,m3;
    char grade;

    public Marks(Scanner sc,String dn,String n,int ro)
    {
        super(dn,n,ro);
        System.out.print("Enter marks of 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        System.out.print("Enter grade of sports: ");
        grade = sc.next().charAt(0);
    }

    public void display()
    {
        System.out.println("Department is: "+dept_name);
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll_no);
        float percentage = (m1 + m2 + m3)/3;
        System.out.println("THe percentage is: "+percentage);
        System.out.println("The Sports grade is: "+grade);

    }
}


public class Multilevel_inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deptname,name,roll no: ");
        String d_n = sc.next();
        String name = sc.next();
        int roll = sc.nextInt();

        Marks s1 = new Marks(sc,d_n,name,roll);
        s1.display();

    }
}