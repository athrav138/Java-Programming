import java.util.*;

public class BitManupulation1
{

  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    int n = 10;
    int pos = 2;
    int bitmask = 1<<pos;

    if((bitmask & n)!=0)
    {
      System.out.println("THe bit is one ");
    }
    else
    {
      System.out.println("THe bit is zero ");
    }

  }
}