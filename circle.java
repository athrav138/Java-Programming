import java.util.Scanner;
class Area
{
 double r;

 void Area1(){
double a=r*r*3.14;
System.out.print("THe area is:"+a);
 }


};

public class circle
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    Area a1 = new Area();

    System.out.println("Enter the radius of circle is: ");

  a1.r = sc.nextDouble();


    a1.Area1();

  }
}