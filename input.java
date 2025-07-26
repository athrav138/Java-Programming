import java.util.Scanner;

public class input
{

  public static void main(String[] args){
    Scanner S= new Scanner(System.in);

    String Name;

    System.out.print("Enter the Name :");
    Name=S.nextLine();

    System.out.println("The Entered name is:"+Name);
    
  }
}