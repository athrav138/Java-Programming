import java.util.Scanner;

public class Usage
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