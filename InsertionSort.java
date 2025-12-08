import java.util.*;

public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();

        int arr[] = new int [n];

        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            }

            for(int i=1;i<n;i++)
            {
              int curr = arr[i];
              int j = i-1;

              while(j>=0 && curr<arr[j] )
              {
                arr[j+1] = arr[j];
                j--;
              }
              arr[j+1] = curr;

            }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
