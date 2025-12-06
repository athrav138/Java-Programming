import java.util.*;

public class String3 {
  public static  void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

   String s;
   System.out.print("Enter string: ");
   s = sc.next();

   String result = "";
   for(int i=0;i<s.length();i++)
   {
      
      if(s.charAt(i)=='e')
      {
       result += 'i';

      } else {
      result += s.charAt(i);
       }
   }
    System.out.println("Original: "+s);
       System.out.println("Changes: "+result);
  }
}
