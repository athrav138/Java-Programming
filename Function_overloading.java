import java.util.Scanner;

 class Sum
{
   int a,b,c;
   float x,y,z;
  
  public void accept(int a,int b)
  {
      this.a = a;
      this.b = b;
      display(a,b);
  }
  
  public void  accept(int a,int b,int c)
  {
      this.a = a;
      this.b = b;
      this.c = c;
      display(a,b,c);
  }
  
  public void  accept(float x,float y)
  {
      this.x = x;
      this.y = y;
      display(x,y);
  }
  
  public void  accept(float x,float y,float z)
  {
      this.x = x;
      this.y = y;
      this.z = z;
      display(x,y,z);
  }

  public void display(int a,int b)
  {
      System.out.println("Sum is: "+(a+b));
  }
  
  public void display(int a,int b,int c)
  {
      System.out.println("Sum is: "+(a+b+c));
  }
  
  public void display(float x,float y)
  {
      System.out.println("Sum is: "+(x+y));
  }
  
  public void display(float x,float y,float z)
  {
      System.out.println("SUm is: "+(x+y+z));
  }
}

public class Function_overloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Sum s1 = new Sum();
        s1.accept(1,2);
        s1.accept(1.2f,3.4f);
        s1.accept(1,2,3);
        s1.accept(1.2f,3.4f,6.6f);
    }
}