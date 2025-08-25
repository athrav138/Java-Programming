import java.lang.*;
import java.util.Scanner;

 class pr
{
public int a=3;
}
class pr2 extends pr{
  void pr(){
System.out.println(a);
  }}
public class pr1
{
  public static void main(String[] args)

  {
    Scanner input = new Scanner(System.in);

    System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(4.3));

        pr2 p1=new pr2();
        p1.pr();

  }
}