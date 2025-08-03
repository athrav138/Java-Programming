import java.util.*;

class Circle{
    double radius;

    Circle(double r){
        radius = r;
    }

    void area()
    {
        System.out.println("The area of circle is:"+ radius*radius*3.14);
    }

    void circumference()
    {
        System.out.println("The circumference of circle is: "+ 2*3.14*radius);
    }
}

public class object
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.print("Enter the radius of circle:");
        radius = sc.nextDouble();

        Circle c1 = new Circle(radius);
        c1.area();
        c1.circumference();

        }
}