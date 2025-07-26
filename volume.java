import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float r,h;
        
        System.out.print("Enter the radius of the Cylinder:");
        r=input.nextFloat();

        System.out.print("Enter the height of the cylinder:");
        h=input.nextFloat();

        double volume;
         volume = Math.PI* r*r*h;

        System.out.println("THe volume of Cylinder is:"+volume);
    }
}