// Multithreading in Java

// By extending the Thread class
class Thread1 extends Thread
{
  public void run()
  {
    System.out.println("Even numbers from 1 to 10:");
    for(int i =1;i<=10;i++)
    {
      if(i%2==0){
      System.out.print(" "+i);
    }
    }
  }
}

// By implementing the Runnnable interface
class Thread2 implements Runnable
{
  public void run()
  {
    System.out.println("Odd numbers from 1 to 10:");
    for(int i=1;i<=10;i++)
    {
      if(i%2!=0){
      System.out.print(" "+i);
      }
    }
  }
}

public class MultiThread2
{
  public static void main(String[] args)
  {
    Thread1 t1 = new Thread1();
    t1.start();

    Thread2 t2 = new Thread2();
    Thread t = new Thread(t2);
    t.start();
  }
}