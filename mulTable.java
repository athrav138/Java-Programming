import java.util.*;

public class mulTable{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number :");
        int a=scan.nextInt();

        System.out.print("The multiplication table of "+a+" is :\n");
        for(int i=1;i<=10;i++){
            System.out.print(" "+i*a);
        }
    }
}