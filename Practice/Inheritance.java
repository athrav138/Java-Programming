import java.util.Scanner;

class Student
{
	int roll;
	String name;
	
	Student(Scanner sc)
	{
		System.out.print("ENter roll no:");
		 roll = sc.nextInt();
		System.out.print("ENter name: ");
		 name = sc.next();
	}

	
}

class Marks extends Student
{
	int sub1;
	int sub2;

	Marks(Scanner sc)
	{
		super(sc);
		System.out.print("Enter subject 1 marks:");
		sub1 = sc.nextInt();
		System.out.print("Enter subject 2 marks:");
		sub2 = sc.nextInt();
		
	}

	void display()
	{
		System.out.println("THe student information is:");
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("M1: "+sub1);
		System.out.println("M2: "+sub2);
	}
	
}

public class Inheritance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Marks m1 = new Marks(sc);
		m1.display();
	
	}
}