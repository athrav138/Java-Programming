import java.util.Scanner;

class Satatic
{
  static int a;

  static void fun(){
    System.out.println("a="+a);
  }
};

public class statica
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Satatic s1 = new Satatic();
 s1.a=12;
s1.fun();
    

  }
}