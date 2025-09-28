
 abstract class GroceryItem
{
  private String name;
  private double pricePerKg;
  private double quantityKg;

  GroceryItem(String n,double p,double q)
  {
    name = n;
    pricePerKg = p;
    quantityKg = q;
  }

   public  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("Price per kg: "+pricePerKg);
    System.out.println("Quantity per Kg: "+quantityKg);

  }

}

class Fruit //extends GroceryItem
{

  
}

public class GroceryMangementSystem 
{
  public static void main(String[] args)
  {

  }
}