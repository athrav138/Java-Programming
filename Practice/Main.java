import java.util.Scanner;

class Car
{
    String name;
    String model_no;

    public Car(Scanner sc)
    {
        System.out.print("Enter car name: ");
        name = sc.next();
        System.out.print("Enter model no: ");
        model_no = sc.next();
    }
}

class Bus extends Car{
    int no_of_seats;

    public Bus(Scanner sc)
    {
        super(sc);
        System.out.print("Enter no of seats in the car: ");
        no_of_seats = sc.nextInt();
    }

    public void display()
    {
        System.out.println("THe car  name: "+name);
        System.out.println("THe model no. is: "+model_no);
        System.out.println("THe  no. of seats is: "+no_of_seats);
    }
}

public class Main
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        Bus b1 = new Bus(sc);
        System.out.println("\nTHe information of car is:");
        b1.display();
    }
}