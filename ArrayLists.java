import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<String> names = new ArrayList<String>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    names.add("Atharv");
    names.add ("Rucha");
    names.add("Sujata");
    names.add("Milind");
    names.add("chabu");
    names.add("Tukaram");

    System.out.println("The list of Integers is: "+numbers);
    System.out.println("THe list of Names is: "+names);

  }
}