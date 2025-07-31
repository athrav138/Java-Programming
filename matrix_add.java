import java.util.Scanner;

public class matrix_add{

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    int arr1[][] = new int [3][3];
    int arr2[][] = new int [3][3];
    int sum[][] = new int [3][3];
    int i,j;

    System.out.println("Enter the elements of matrix 1:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print("Enter the arr1["+i+"]["+j+"] : ");
        arr1[i][j]= sc.nextInt();
      }
    }

    System.out.println("Enter the elements of matrix 2");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print("Enter the arr2["+i+"]["+j+"] : ");
        arr2[i][j]=sc.nextInt();
      }
    }

    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        sum[i][j]=arr1[i][j]+arr2[i][j];
        System.out.print(" "+sum[i][j]);
      }
      System.out.println();

    }


  }
}