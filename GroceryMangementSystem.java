import java.util.Scanner; 

abstract class GroceryItem {
    private String name;
    private double pricePerKg;
    private double quantityKg;

    public GroceryItem(String n, double p, double q) {
        name = n;
        pricePerKg = p;
        quantityKg = q;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price per kg: " + pricePerKg);
        System.out.println("Quantity per Kg: " + quantityKg);
    }
}

class Fruit extends GroceryItem {
  private int isseasonal;
  Scanner sc = new Scanner (System.in);
    public Fruit(String n, double p, double q) {
        super(n, p, q);
        System.out.println("Enter the fruit is seasonal or not(1/0): ");
        isseasonal = sc.nextInt();
    }

    @Override
    public void display() {
        System.out.println("--- FRUIT ---");
        super.display();
        System.out.println("Is seasonal: "+(isseasonal)?"True":"False");
    }
}



public class GroceryMangementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fruit apple = new Fruit("Apple", 150.0, 2.5);
        apple.display();
    }
}