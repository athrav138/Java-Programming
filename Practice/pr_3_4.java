public class pr_3_4 {
    public static void main(String [] args)
    {
        // Using for loop 1 to 20 numbers
        System.out.print("THe 1-20 numbers using for loop: ");
        for(int i=1;i<=20;i++)
        {
            System.out.print(" "+i);
        }

        // Using while loop 1 to 20 numbers
        System.out.print("\nTHe 1-20 numbers using while loop: ");
        int i = 1;
        while(i<=20)
        {
            System.out.print(" "+i);
            i+=1;
        }
        
        // Using do-while loop 1 to 20 numbers
        System.out.print("\nTHe 1-20 numbers using do-while loop: ");
        int j = 1;
        do
        {
            System.out.print(" "+j);
            j+=1;
        }while(j<=20);


        }
    }