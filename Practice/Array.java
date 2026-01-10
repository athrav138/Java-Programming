import java.util.Scanner;

public class Array
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int []arr = new int [10];
       
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            arr[i] = n;
        }

        for(int i = 0 ;i<3;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
}