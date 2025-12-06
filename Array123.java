import java.util.*;

public class Array123
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    
    int arr[] = new int [10];
    int arr1[] = {1,2,3};

    System.out.println("Size of array: "+arr.length);

    int n;
    System.out.print("Enter the size of aray: ");
    n = sc.nextInt();

    int arrr2[] = new int [n];

    String str[] = new String [10];

    for(int i=0;i<10;i++)
    {
      str[i] = sc.next();
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(" "+str[i]);
    }
  }
}