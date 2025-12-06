import java.util.*;

public class String4 {
  public static  void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

   String email;
   String username = "";
   System.out.print("Enter email: ");
   email = sc.nextLine();

   for(int i=0;i<email.length();i++)
   {
    if(email.charAt(i)=='@')
    {
      break;
    }
    else
    {
      username += email.charAt(i);
    }
   }

   System.out.println("The username for "+email+" is: "+username);
   
  }
}
