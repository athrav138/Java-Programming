import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayLists
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<String> names = new ArrayList<String>();

    // Add
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

    // Get 
    System.out.println("Get : "+numbers.get(2));
    System.out.println("Get String: "+names.get(1));

    // Add

    numbers.add(1,23);
    System.out.println("Array list of numbers: "+numbers);

    // Set element

    numbers.set(2,12345);

        System.out.println("Array list of numbers: "+numbers);


        numbers.remove(2);
        System.out.println("Array list of numbers: "+numbers);

        // Size of array list
        System.out.println("THe size of arrayList of numbers: "+numbers.size());

        // Loops

        for(int i=0;i<numbers.size();i++)
        {
          System.out.print(" "+numbers.get(i));
        }

        // sorting
        Collections.sort(numbers);

        System.out.println(" "+numbers);
        //Sorting strinng array list
        Collections.sort(names);
        System.out.println(names);

  } 
}