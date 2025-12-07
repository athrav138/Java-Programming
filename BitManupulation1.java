import java.util.*;

public class BitManupulation1
{

  public static void getBit(int n,int pos)
  {
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

  public static void setBit(int n,int pos)
  {
    int bitmask = 1<<pos;

    System.out.println("The "+pos+" position bit is set: "+(bitmask|n));
  }

  public static void clearBit(int n,int pos)
  {
    int bitmask = 1<<pos;

    System.out.println("The "+pos+" position bit is clear: "+(~bitmask & n));
  }

  public static void updateBit(int n,int pos,int newbit)
  {
    int bitmask = 1<<pos;

    if(newbit == 1)
    {
    System.out.println("The "+pos+" position bit is set: "+(bitmask|n));
    }
    else 
    System.out.println("The "+pos+" position bit is clear: "+(~bitmask & n));

  }



  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    // getBit(10,2);

    // setBit(10,2);

    // clearBit(10,1);

    updateBit(10,2,0); // 1010
    

  }
}