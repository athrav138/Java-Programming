import java.util.*;

public class String1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String s = "12345";

    int number = Integer.parseInt(s);

    System.out.println("Integer is: "+number);

    String s1 = Integer.toString(number);

    System.out.println("String is: "+s1);
  }
}