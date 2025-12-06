
import java.util.*;

public class array2d
{
  public static void main(String [] args)
  {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int arr[][] =new int [rows][cols];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("The matrix is: ");
      for(int i=0;i<rows;i++)
      {
          for(int j=0;j<cols;j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }

      int key;
      System.out.println("Enter the key: ");
      key = sc.nextInt();

      for(int i=0;i<rows;i++)
      {
          for(int j=0;j<cols;j++)
          {
              if(arr[i][j]==key){
                  System.out.println("Key is present in the array at index: arr["+i+"]["+j+"]");
              }
          }

      }


    
  }
}