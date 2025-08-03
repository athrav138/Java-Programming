import java.util.*;

class Circle{
    double radius;

 Circle(){

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

public class object2
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



       Circle c1 = new Circle();
       c1.radius=5;
        c1.area();
        c1.circumference();

        }
}