import java.util.*;

public class String2 {
  public static  void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String str[] = new String [2];

    int length = 0;

    for(int i=0;i<2;i++)
    {
      str[i] = sc.next();
      length += str[i].length();

    }

    System.out.println("THe length of string array is: "+length);
  }
}
