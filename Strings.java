import java.util.*;

public class Strings
{
  public static void main(String [] args)
  {
      Scanner sc = new Scanner(System.in);

      String s1 = "Hello";
      System.out.println(s1);

      String s2 = "World";
      System.out.println(s2);

      // String concatenation
      String s3 = s1 + " " + s2;
      System.out.println(s3);

      // String length
      System.out.println("Length: "+s3.length());

      // Char at
      for(int i=0;i<s3.length();i++){

          System.out.println(s3.charAt(i));
      }

      // Sub string
      System.out.println("SubString: "+s3.substring(6,7));

      // String comparision
      System.out.println("String compare: "+ s2.compareTo(s1));

      System.out.println("String compare: "+ s1==s2);



  }
}