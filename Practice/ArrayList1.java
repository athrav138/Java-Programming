import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
       
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            arr.add(n);
        }

        for(int i = 0 ;i<3;i++)
        {
            System.out.println(" "+arr.get(i));
        }
    }
}