import java.util.*;

// Interface for discountable items
interface Discountable {
    double applyDiscount();
}

// Abstract class GroceryItem
abstract class GroceryItem {
    private String name;
    private double pricePerKg;
    private double quantityKg;

    public GroceryItem(String name, double pricePerKg, double quantityKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.quantityKg = quantityKg;
    }

    public String getName() { return name; }
    public double getPricePerKg() { return pricePerKg; }
    public double getQuantityKg() { return quantityKg; }
    public double getTotalPrice() { return pricePerKg * quantityKg; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price per kg: " + pricePerKg);
        System.out.println("Quantity (kg): " + quantityKg);
        System.out.println("Total Price: " + getTotalPrice());
    }
}

// Fruit Class
class Fruit extends GroceryItem implements Discountable {
    private boolean isSeasonal;

    public Fruit(String n, double p, double q, boolean s) {
        super(n, p, q);
        this.isSeasonal = s;
    }

    @Override
    public void display() {
        System.out.println("--- FRUIT ---");
        super.display();
        System.out.println("Is Seasonal: " + (isSeasonal ? "Yes" : "No"));
        System.out.println("Price after discount: " + applyDiscount());
        System.out.println("----------------------");
    }

    @Override
    public double applyDiscount() {
        if (isSeasonal) {
            return getTotalPrice() * 0.9; // 10% discount if seasonal
        }
        return getTotalPrice();
    }
}

// Vegetable Class
class Vegetable extends GroceryItem implements Discountable {
    private boolean isOrganic;

    public Vegetable(String n, double p, double q, boolean o) {
        super(n, p, q);
        this.isOrganic = o;
    }

    @Override
    public void display() {
        System.out.println("--- VEGETABLE ---");
        super.display();
        System.out.println("Is Organic: " + (isOrganic ? "Yes" : "No"));
        System.out.println("Price after discount: " + applyDiscount());
        System.out.println("----------------------");
    }

    @Override
    public double applyDiscount() {
        if (isOrganic) {
            return getTotalPrice() * 0.95; // 5% discount if organic
        }
        return getTotalPrice();
    }
}

// DryFruit Class
class DryFruit extends GroceryItem implements Discountable {
    private boolean isImported;

    public DryFruit(String n, double p, double q, boolean i) {
        super(n, p, q);
        this.isImported = i;
    }

    @Override
    public void display() {
        System.out.println("--- DRY FRUIT ---");
        super.display();
        System.out.println("Is Imported: " + (isImported ? "Yes" : "No"));
        System.out.println("Price after discount: " + applyDiscount());
        System.out.println("----------------------");
    }

    @Override
    public double applyDiscount() {
        if (isImported) {
            return getTotalPrice() * 1.1; // 10% extra if imported
        }
        return getTotalPrice();
    }
}

// Inventory class
class Inventory {
    private List<GroceryItem> items = new ArrayList<>();

    public void addItem(GroceryItem item) {
        items.add(item);
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }
        for (GroceryItem item : items) {
            item.display();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (GroceryItem item : items) {
            if (item instanceof Discountable) {
                total += ((Discountable) item).applyDiscount();
            } else {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}

// Main class
public class GroceryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n--- Grocery Management System ---");
            System.out.println("1. Add Fruit");
            System.out.println("2. Add Vegetable");
            System.out.println("3. Add Dry Fruit");
            System.out.println("4. Show Inventory");
            System.out.println("5. Show Total Bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fruit name: ");
                    String fname = sc.next();
                    System.out.print("Enter price per kg: ");
                    double fprice = sc.nextDouble();
                    System.out.print("Enter quantity (kg): ");
                    double fqty = sc.nextDouble();
                    System.out.print("Is seasonal (true/false): ");
                    boolean seasonal = sc.nextBoolean();
                    inventory.addItem(new Fruit(fname, fprice, fqty, seasonal));
                    break;

                case 2:
                    System.out.print("Enter vegetable name: ");
                    String vname = sc.next();
                    System.out.print("Enter price per kg: ");
                    double vprice = sc.nextDouble();
                    System.out.print("Enter quantity (kg): ");
                    double vqty = sc.nextDouble();
                    System.out.print("Is organic (true/false): ");
                    boolean organic = sc.nextBoolean();
                    inventory.addItem(new Vegetable(vname, vprice, vqty, organic));
                    break;

                case 3:
                    System.out.print("Enter dry fruit name: ");
                    String dname = sc.next();
                    System.out.print("Enter price per kg: ");
                    double dprice = sc.nextDouble();
                    System.out.print("Enter quantity (kg): ");
                    double dqty = sc.nextDouble();
                    System.out.print("Is imported (true/false): ");
                    boolean imported = sc.nextBoolean();
                    inventory.addItem(new DryFruit(dname, dprice, dqty, imported));
                    break;

                case 4:
                    inventory.displayAll();
                    break;

                case 5:
                    System.out.println("Total Bill = " + inventory.calculateTotal());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
