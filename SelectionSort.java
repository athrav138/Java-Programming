import java.util.*;

public class SelectionSort {
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

            for(int i=0;i<n;i++)
            {
                int min = i;
                for(int j=i;j<n;j++){
                     if(arr[min]>arr[j])
                {
                    min = j;
                }
                }
               
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}