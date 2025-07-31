import java.util.Scanner;

public class array1{

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Enter the size of array:");
    n=sc.nextInt();

    int arr[]=new int [n];

    for(int i=0;i<n;i++){
      System.out.print("Enter number arr["+i+"] : ");
      arr[i]=sc.nextInt();
    }

    System.out.println("The array is:");
    for(int i=0;i<n;i++){
      System.out.print(" "+arr[i]);
    }
  }
}